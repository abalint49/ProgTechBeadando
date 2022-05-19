import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class main {

    static user CurrentUser = new user();

    static public Users users = new Users();

    static public Lessons lessons = new Lessons();

    static public studentLessins StudentLessons = new studentLessins();

    public static void main(String args[])
    {
        //users.RefressUser();
        //System.out.println(users.toString());

        //lessons.RefressLessons();
        //System.out.println(lessons.toString());

        //ArrayList<String> LessonList = lessons.LessonsToStringList();
        //System.out.println(LessonList);

        //Login("A49I6H","1234");

        LogInForm l = new LogInForm();

        //l.setVisible(true);
        //System.out.println(CurrentUser.toString());

        //users.regist("kjke","njkd",0,"1234");

        //UppdataLessons(2,"6uw","w46","zw46");

        //DeleteLesson(3);

        /*StudentLessons.GetStudentLessons(2);
        for (int i = 0; i < StudentLessons.LessonList.size(); i++)
        {
            System.out.println(StudentLessons.LessonList.get(i).toString());
        }*/

        //StudentLessons.AddStudentLesson(2,2);

        //StudentLessons.DeleteStudentLesson(2,2);

    }

    static void Login(String neptun , String pw)
    {
        CurrentUser = users.login(neptun, pw);
        System.out.println(main.CurrentUser.toString());
    }

    static void Registration(String name,String neptun , int stat, String pw)
    {
        users.RefressUser();
        users.regist(name, neptun, stat, pw);
        users.RefressUser();
        Login(neptun, pw);
    }

    static void UppdataLessons(int id, String lessonName, String location , String time)
    {
        lessons.UppdataLesson(id,lessonName,location,time);
        lessons.RefressLessons();
        System.out.println(lessons.toString());
    }

    static void DeleteLesson (int id)
    {
        lessons.DeleteLesson(id);
        lessons.RefressLessons();
        System.out.println(lessons.toString());
    }

    static void AddStudentLesson (int StrudentId, int LessontId)
    {
        StudentLessons.AddStudentLesson(StrudentId,LessontId);
        System.out.println("add");
    }

    static void DeleteStudentLesson (int StrudentId, int LessontId)
    {
        StudentLessons.DeleteStudentLesson(StrudentId,LessontId);
        System.out.println("add");
    }

}
