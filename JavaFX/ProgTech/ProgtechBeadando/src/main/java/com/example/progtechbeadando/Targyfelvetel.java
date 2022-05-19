package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Targyfelvetel extends Application {
    public boolean betoltve1 = false;
    @FXML
    public ListView targyfelvList;
    public Label targyfelvLabel;


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
            System.out.println(HelloController.lessons);

            for (int i = 0; i < HelloController.lessons.lessons.size(); i++) {
                System.out.println(i);
                System.out.println(HelloController.lessons.lessons.get(i));
                targyfelvList.getItems().add(HelloController.lessons.lessons.get(i));
            }



            //targyfelvList.refresh();
            betoltve1=true;
        }
        else return;
    }

    public void Targyfelvetel(ActionEvent actionEvent) {
        studentLessins.AddStudentLesson(HelloApplication.CurrentUser.id, HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id);
        targyfelvLabel.setText("Tárgy felvéve:\n" +
                HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id + "\n" +
                HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).lessonName + "\n" +
                HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).teacherId + "\n" +
                HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).location + "\n" +
                HelloApplication.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).time);
    }


}
