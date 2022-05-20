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
            System.out.println(LoginController.lessons);

            for (int i = 0; i < LoginController.lessons.lessons.size(); i++) {
                System.out.println(i);
                System.out.println(LoginController.lessons.lessons.get(i));
                targyfelvList.getItems().add(LoginController.lessons.lessons.get(i));
            }



            //targyfelvList.refresh();
            betoltve1=true;
        }
        else return;
    }

    public void Targyfelvetel(ActionEvent actionEvent) {
        studentLessins.AddStudentLesson(LoginForm.CurrentUser.id, LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id);
        targyfelvLabel.setText("Tárgy felvéve:\n" +
                "ID: "+LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).id + "\n" +
                "Kurzus neve: "+LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).lessonName + "\n" +
                "Tanár ID: "+LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).teacherId + "\n" +
                "Helyszín: "+LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).location + "\n" +
                "Időpont: "+LoginForm.lessons.lessons.get(targyfelvList.getSelectionModel().getSelectedIndex()).time);
    }
    public void RefreshTF(){
        targyfelvList.getItems().clear();
        Lessons.RefressLessons();
        System.out.println(LoginController.lessons);

        for (int i = 0; i < LoginController.lessons.lessons.size(); i++) {
            System.out.println(i);
            System.out.println(LoginController.lessons.lessons.get(i));
            targyfelvList.getItems().add(LoginController.lessons.lessons.get(i));
        }
    }


}
