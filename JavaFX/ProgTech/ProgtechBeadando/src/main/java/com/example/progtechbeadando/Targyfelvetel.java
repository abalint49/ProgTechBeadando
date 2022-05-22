package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Targyfelvetel extends Application {
    public boolean betoltve1 = false;
    @FXML
    public ListView targyfelvList;
    public Label targyfelvLabel;
    public Button RefreshTF;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
    }

    public void startTF(MouseEvent mouseEvent) {
        if (!betoltve1)
        {
            Lessons.RefressLessons();
            for (int i = 0; i < Lessons.lessons.size(); i++) {
                targyfelvList.getItems().add(Lessons.lessons.get(i));
            }
            betoltve1=true;
        }
        else return;
    }

    public void Targyfelvetel(ActionEvent actionEvent) {
        StudentLessonProperty.AddStudentLesson(LoginForm.CurrentUser.id, Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id);
        targyfelvLabel.setText("Tárgy felvéve:\n" +
                "ID: "+ Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id + "\n" +
                "Kurzus neve: "+ Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).lessonName + "\n" +
                "Tanár ID: "+ Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).teacherId + "\n" +
                "Helyszín: "+ Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).location + "\n" +
                "Időpont: "+ Lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).time);
    }
    public void RefreshTF(){
        targyfelvList.getItems().clear();
        Lessons.RefressLessons();
        for (int i = 0; i < Lessons.lessons.size(); i++) {
            targyfelvList.getItems().add(Lessons.lessons.get(i));
        }
    }
}
