package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.io.IOException;




public class LoginForm extends Application {
    static public user CurrentUser = new user();

    static public Users users = new Users();

    static public Lessons lessons = new Lessons();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginForm.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 459, 348);
        stage.setTitle("Üdvözli önt a NEPTUN!");
        stage.setScene(scene);
        stage.show();

        Lessons.RefressLessons();

        LoginController.StudentLessons.GetStudentLessons(2);
        for (int i = 0; i < LoginController.StudentLessons.LessonList.size(); i++)
        {
            System.out.println(LoginController.StudentLessons.LessonList.get(i).toString());
        }
    }

    public static void main(String[] args) {
        launch();

        //users.RefressUser();
        //System.out.println(users.toString());

        //lessons.RefressLessons();
        //System.out.println(lessons.toString());

        //ArrayList<String> LessonList = lessons.LessonsToStringList();
        //System.out.println(LessonList);

        //Login("A49I6H","1234");

        //LogInForm l = new LogInForm();

        //l.setVisible(true);
        //System.out.println(CurrentUser.toString());

        //users.regist("kjke","njkd",0,"1234");

        //UppdataLessons(2,"6uw","w46","zw46");
        //DeleteLesson(3);

        //l.setVisible(true);
        //System.out.println(CurrentUser.toString());

        //users.regist("kjke","njkd",0,"1234");

        //UppdataLessons(2,"6uw","w46","zw46");

        //DeleteLesson(3);



        //LoginController.StudentLessons.AddStudentLesson(2,2);

        //StudentLessons.DeleteStudentLesson(2,2);




    }
    static void Login(String neptun , String pw)
    {
        CurrentUser = users.login(neptun, pw);
        System.out.println(CurrentUser.toString());
        System.out.println(CurrentUser.id);
    }
    static void Registration(String name,String neptun, int stat, String pw)
    {
        users.RefressUser();
        users.regist(name, neptun, stat, pw);
        users.RefressUser();
        Login(neptun, pw);
    }

    static void UppdataLessons(int Id, String lessonName, String location , String time)
    {
        lessons.UppdataLesson(Id,lessonName,location,time);
        lessons.RefressLessons();
        System.out.println(lessons.toString());
    }

    static void DeleteLesson (int id)
    {
        lessons.DeleteLesson(id);
        lessons.RefressLessons();
        System.out.println(lessons.toString());
    }
}