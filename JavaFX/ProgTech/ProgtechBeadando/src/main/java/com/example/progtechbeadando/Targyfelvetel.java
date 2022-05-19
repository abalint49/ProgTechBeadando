package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Targyfelvetel extends Application {
    public boolean betoltve1 = false;
    @FXML
    public ListView targyfelvList;
    public ArrayList tfList;

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
            System.out.println(HelloController.StudentLessons.LessonList);

            for (int i = 0; i < HelloController.StudentLessons.LessonList.size(); i++) {
                System.out.println(i);
                System.out.println(HelloController.StudentLessons.LessonList.get(i));
                targyfelvList.getItems().add(HelloController.StudentLessons.LessonList.get(i).toString());
            }

            targyfelvList.refresh();
            betoltve1=true;
        }
        else return;
    }

    public void Targyfelvetel(ActionEvent actionEvent) {
    }


}
