import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

    static user CurrentUser = new user();

    static public Users users = new Users();
    public static void main(String args[])
    {
        /*users.RefressUser();
        System.out.println(users.toString());*/

        //Login("A49I6H","1234");

        LogInForm l = new LogInForm();

        //users.regist("jjgld", "neptun", 0, "pw");

        //l.setVisible(true);
        //System.out.println(CurrentUser.toString());

        //users.regist("kjke","njkd","student","1234");


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
}
