package com.example.progtechbeadando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentLessonProperty {

    static studentLessins StudentLessins = new studentLessins();

    public static void GetStudentLessons(int StudentId)
    {
        StudentLessins.GetStudentLessons(StudentId);
    }

    public static void AddStudentLesson(int StrudentId, int LessontId)
    {
        StudentLessins.AddStudentLesson(StrudentId,LessontId);
    }

    public static void DeleteStudentLesson (int StrudentId, int LessontId)
    {
        StudentLessins.DeleteStudentLesson(StrudentId,LessontId);
    }
}
