package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.stage.Stage;

public class TeacherForm extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        studentLessins.GetStudentLessons(HelloController.CurrentUser.id);
        //studentLessins.LessonList;
    }
}
