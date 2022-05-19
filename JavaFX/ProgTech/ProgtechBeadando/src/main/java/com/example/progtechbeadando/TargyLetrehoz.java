package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TargyLetrehoz extends Application {

    public TextField CTargynev;
    public TextField CTargyhely;
    public TextField CTargyido;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void Ctargygomb(ActionEvent actionEvent) {

        lesson nappali = new lesson(0,0,"","Nappali","");
        lesson levelezo = new lesson(0,0,"","Levelező","");

        lesson add = null;

        switch (CTargyhely.getText())
        {
            case "nappali" :
                add = nappali;
                break;
            case "levelező" :
                add = levelezo;

        }
        add.lessonName = CTargynev.getText();
        add.time = CTargyido.getText();
        add.teacherId = HelloApplication.CurrentUser.id;

        Lessons.AddLesson(add);
        Lessons.RefressLessons();
    }
}
