package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentForm extends Application {
    @FXML
    public  TableView TeacherTable = new TableView<>();
    @FXML
    public static TableColumn<String, Lessons> id = new TableColumn<>("Id");
    @FXML
    public ListView Slist = new ListView<>();
    @FXML
    public AnchorPane panelS = new AnchorPane();
    public boolean betoltve = false;
    public static Parent root;
    public Label StudentLabel;
    @Override
    public void start(Stage stage) throws Exception {
    }
    public void startS() {
    if (!betoltve)
        {
        studentLessins.GetStudentLessons(LoginForm.CurrentUser.id);
        Frissit();
        Slist.refresh();
        betoltve=true;
    }
    else return;
    }

    public void TargyFelvetel(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource(("TargyfelvetelView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Tárgyfelvétel");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void TargyLeadas(ActionEvent actionEvent) {
        int selectidId = Integer.parseInt(Slist.getSelectionModel().getSelectedItems().toString().split(",")[0].split(" ")[1]);
        studentLessins.DeleteStudentLesson(LoginForm.CurrentUser.id, selectidId);
        StudentLabel.setText("Tárgy leadva");
        Frissit();
    }
    public void Frissit()
    {
        Slist.getItems().clear();
        studentLessins.GetStudentLessons(LoginForm.CurrentUser.id);
        for (int i = 0; i < studentLessins.LessonList.size(); i++) {
            Slist.getItems().add(studentLessins.LessonList.get(i).toString());
        }
        Slist.refresh();
    }
}
