package com.example.progtechbeadando;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class sql {

    public void sqlWithoutResponse(String sql)
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "");
            Statement statement = connection.createStatement();
            statement.execute(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
