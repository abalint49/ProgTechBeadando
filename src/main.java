import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

    static user CurrentUser = new user();

    static Users users = new Users();
    static sql Sql;

    public static void main(String args[])
    {
        /*users.RefressUser();
        System.out.println(users.toString());*/

        Login("A49I6H","1234");
        System.out.println(CurrentUser.toString());

        //System.out.println(Sql.getMaxid("users"));

        //users.regist("kjke","njkd","student","1234");


    }

    static void Login(String neptun , String pw)
    {
        CurrentUser = users.login(neptun, pw);
    }
}
