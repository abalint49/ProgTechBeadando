package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    }

    public static void main(String[] args) {
        launch();
    }
    static void Login(String neptun , String pw)
    {
        CurrentUser = users.login(neptun, pw);
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
        Lessons.RefressLessons();
    }

    static void DeleteLesson (int id)
    {
        Lessons.DeleteLesson(id);
        Lessons.RefressLessons();
        System.out.println(lessons.toString());
    }
}