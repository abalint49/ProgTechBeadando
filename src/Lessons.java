import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Lessons {
    sql Sql = new sql();
    Users users = new Users();

    ArrayList<lesson> lessons = new ArrayList<>();

    public void RefressLessons()
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from lessons");
            while (resultSet.next())
            {
                int id = resultSet.getInt(1);
                int teacherId = resultSet.getInt(2);
                String lessonName = resultSet.getString(3);
                String location = resultSet.getString(4);
                String time = resultSet.getString(5);

                lessons.add(new lesson(id,teacherId,lessonName,location,time));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<String> LessonsToStringList()
    {
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i < lessons.size() ; i++)
        {
            String line = "id=" + lessons.get(i).id +
                    ", teacherId=" + users.GetUserFromId(lessons.get(i).teacherId) +
                    ", tessonName='" + lessons.get(i).tessonName +
                    ", location='" + lessons.get(i).location +
                    ", time='" + lessons.get(i).time;
            out.add(line);
        }

        return out;
    }


    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < lessons.size(); i++) {
            lesson lesson = lessons.get(i);
            output = output + "id=" + lesson.id +
                    ", teacherId=" + users.GetUserFromId(lesson.teacherId) +
                    ", tessonName='" + lesson.tessonName +
                    ", location='" + lesson.location +
                    ", time='" + lesson.time + "\n";
        }

        return output;
    }
}