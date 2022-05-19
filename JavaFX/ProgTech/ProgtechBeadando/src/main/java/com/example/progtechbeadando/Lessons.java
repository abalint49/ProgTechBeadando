package com.example.progtechbeadando;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Lessons {
    sql Sql = new sql();
    Users users = new Users();

    static ArrayList<lesson> lessons = new ArrayList<>();

    public static void RefressLessons()
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
                    ", tessonName='" + lessons.get(i).lessonName +
                    ", location='" + lessons.get(i).location +
                    ", time='" + lessons.get(i).time;
            out.add(line);
        }

        return out;
    }

    public void AddLesson (lesson lesson)
    {
        if (lesson == null)
        {
            return;
        }
        String sql = ("INSERT INTO `lessons`(`TeacherId`, `LessonName`, `location`, `time`) VALUES (" + lesson.teacherId + ",'" + lesson.lessonName + "','" + lesson.location + "','" + lesson.time + "')");
        Sql.sqlWithoutResponse(sql);
    }

    public void UppdataLesson (int id, String lessonName, String location , String time)
    {
        String sql = ("UPDATE `lessons` SET `LessonName`='" + lessonName + "',`location`='" + location + "',`time`='" + time + "' WHERE `id` = " + id + "");
        Sql.sqlWithoutResponse(sql);
    }
    public void DeleteLesson (int id)
    {
        String sql = ("DELETE FROM `lessons` WHERE `id` = " + id + "");
        Sql.sqlWithoutResponse(sql);
    }

    public lesson GetLessonFromId(int id)
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `lessons` WHERE `id` = " + id);
            while (resultSet.next())
            {
                lesson out = new lesson();

                out.id = resultSet.getInt(1);
                out.teacherId = resultSet.getInt(2);
                out.lessonName = resultSet.getString(3);
                out.location = resultSet.getString(4);
                out.time = resultSet.getString(5);

                return out;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < lessons.size(); i++) {
            lesson lesson = lessons.get(i);
            output = output + "id=" + lesson.id +
                    ", teacherName=" + users.GetUserFromId(lesson.teacherId) +
                    ", tessonName='" + lesson.lessonName +
                    ", location='" + lesson.location +
                    ", time='" + lesson.time + "\n";
        }

        return output;
    }
}


