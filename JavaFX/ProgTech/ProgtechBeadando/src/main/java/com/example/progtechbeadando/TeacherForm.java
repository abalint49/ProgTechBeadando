package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherForm extends Application {

    public boolean betoltveT = false;
    public ListView Tlist;
    public static Parent root;

    @Override
    public void start(Stage stage) throws Exception {
        studentLessins.GetStudentLessons(HelloApplication.CurrentUser.id);
        //System.out.println("ASD");
        //studentLessins.LessonList;
    }

    public void CreateTargy(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource(("TargyletrehozView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("DiákForm");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void DeleteTargy(ActionEvent actionEvent) {
        Lessons.RefressLessons();
        int selectidId = Integer.parseInt(Tlist.getSelectionModel().getSelectedItems().toString().split(",")[0].split("=")[1]);
        System.out.println(selectidId);
        Lessons.DeleteLesson(selectidId);
        Refresh();
    }

    public void UpdateTargy(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource(("TargymodositView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("DiákForm");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void Refresh() {
        Tlist.getItems().clear();
        Lessons.RefressTeacherLessons(HelloApplication.CurrentUser.id);
        //System.out.println(Lessons.TeacherLessons);


        for (int i = 0; i < Lessons.TeacherLessons.size(); i++) {
            //System.out.println(i);
            //System.out.println(Lessons.TeacherLessons.get(i));
            Tlist.getItems().add(Lessons.TeacherLessons.get(i).toString());
        }

        Tlist.refresh();
        betoltveT=true;
    }

    public void startT(MouseEvent mouseEvent) {
        if (!betoltveT)
        {
            System.out.println("Halló");
            Lessons.RefressTeacherLessons(HelloApplication.CurrentUser.id);
            System.out.println(Lessons.TeacherLessons);


            for (int i = 0; i < Lessons.TeacherLessons.size(); i++) {
                System.out.println(i);
                System.out.println(Lessons.TeacherLessons.get(i));
                Tlist.getItems().add(Lessons.TeacherLessons.get(i).toString());
            }

            Tlist.refresh();
            betoltveT=true;
        }
        else return;
    }
}
