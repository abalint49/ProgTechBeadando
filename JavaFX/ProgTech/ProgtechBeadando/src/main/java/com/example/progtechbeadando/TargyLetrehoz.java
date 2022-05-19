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
        //Lessons.AddLesson(HelloApplication.CurrentUser.id,CTargynev.getText(),CTargyhely.getText(),CTargyido.getText());
    }
}
