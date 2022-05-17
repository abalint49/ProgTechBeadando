import javax.security.auth.kerberos.KerberosTicket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<user> users = new ArrayList<>();

    public void RefressUser()
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next())
            {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("Name");
                String neptunK = resultSet.getString("NaptunKod");
                String state = resultSet.getString("status");

                users.add(new user(id,name,neptunK,state));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public user login(String neptun , String pw)
    {
        user user = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            String sql = "select * from users where NaptunKod = '" + neptun + "' and pw = '" + pw + "'";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next())
            {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("Name");
                String neptunK = resultSet.getString("NaptunKod");
                String state = resultSet.getString("status");

                user = new user(id,name,neptunK,state);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (user == null) return new user();
        else return user;

    }
    public void regist (String name,String neptun , int stat, String pw)
    {
        if (users.contains(neptun))
        {
            return;
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            String sql = ("INSERT INTO `users`(`NaptunKod`, `Name`, `status`, `pw`) VALUES  ('"+ neptun + "','"+ name + "','" + stat + "','" + pw + "')");
            //statement.executeQuery(sql);
            statement.execute(sql);

            /*while (resultSet.next())
            {

            }*/
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < users.size(); i++) {
            output = output + users.get(i).toString() + "\n";
        }

        return output;
    }
}
