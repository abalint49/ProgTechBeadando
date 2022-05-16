import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
    int getMaxid(String tabe)
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            String sql = "SELECT MAX(id) FROM `users`";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next())
            {
                return Integer.parseInt(resultSet.);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return 999999;
    }
}
