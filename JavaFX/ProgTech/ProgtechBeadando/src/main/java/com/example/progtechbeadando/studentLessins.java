package com.example.progtechbeadando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class studentLessins {

    static sql Sql = new sql();

    static ArrayList<Integer> lessonIds = new ArrayList<>();

    static ArrayList<studentLessin> LessonList = new ArrayList<studentLessin>();

    public static void GetStudentLessons(int StudentId)
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

        HelloController.lessons.RefressLessons();

        LessonList = new ArrayList<studentLessin>();

        for (int i = 0; i < lessonIds.size(); i++)
        {
            lesson CLesson = HelloController.lessons.GetLessonFromId(lessonIds.get(i));
            LessonList.add(new studentLessin(i,CLesson.lessonName,HelloController.users.GetUserFromId(CLesson.teacherId),CLesson.location,CLesson.time));
        }
    }

    public void AddStudentLesson (int StrudentId, int LessontId)
    {
        String sql = ("INSERT INTO `studenttolesson`(`studentid`, `lessonsid`) VALUES (" +  StrudentId + "," +  LessontId + ")");
        Sql.sqlWithoutResponse(sql);
    }

    public static void DeleteStudentLesson (int StrudentId, int LessontId)
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
