import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class studentLessins {

    sql Sql = new sql();

    ArrayList<Integer> lessonIds = new ArrayList<>();

    ArrayList<studentLessin> LessonList = new ArrayList<studentLessin>();

    public void GetStudentLessons(int StudentId)
    {
        lessonIds = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT `lessonsid` FROM `studenttolesson` WHERE `studentid` = " + StudentId);
            while (resultSet.next())
            {
                lessonIds.add(resultSet.getInt(1));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        main.lessons.RefressLessons();

        LessonList = new ArrayList<studentLessin>();

        for (int i = 0; i < lessonIds.size(); i++)
        {
            lesson CLesson = main.lessons.GetLessonFromId(lessonIds.get(i));
            LessonList.add(new studentLessin(i,CLesson.lessonName,main.users.GetUserFromId(CLesson.teacherId),CLesson.location,CLesson.time));
        }
    }

    public void AddStudentLesson (int StrudentId, int LessontId)
    {
        String sql = ("INSERT INTO `studenttolesson`(`studentid`, `lessonsid`) VALUES (" +  StrudentId + "," +  LessontId + ")");
        Sql.sqlWithoutResponse(sql);
    }

    public void DeleteStudentLesson (int StrudentId, int LessontId)
    {
        String sql = ("DELETE FROM `studenttolesson` WHERE `studentid` = " +  StrudentId + " AND `lessonsid` = " +  LessontId + "");
        Sql.sqlWithoutResponse(sql);
    }

    private ArrayList<Integer> GetLessons()
    {
        ArrayList<Integer> out = new ArrayList<>();



        return out;
    }
}
