package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.progtechbeadando.HelloController.StudentLessons;
import static com.example.progtechbeadando.HelloController.lessons;

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


    @Override
    public void start(Stage stage) throws Exception {
    }

    public void startS() {
    if (!betoltve)
{
        System.out.println("Halló");
        studentLessins.GetStudentLessons(HelloApplication.CurrentUser.id);
        System.out.println(HelloController.StudentLessons.LessonList);


        for (int i = 0; i < HelloController.StudentLessons.LessonList.size(); i++) {
            System.out.println(i);
            System.out.println(HelloController.StudentLessons.LessonList.get(i));
            Slist.getItems().add(HelloController.StudentLessons.LessonList.get(i).toString());
        }

        Slist.refresh();
    betoltve=true;
    }
    else return;

        /*
        for (studentLessin lessons : HelloController.StudentLessons.LessonList)
        {
            Slist.getItems().add(lessons.toString());
        }*/




        /*studentLessins.GetStudentLessons(0);
        System.out.println(HelloController.StudentLessons.LessonList);
        studentLessins.GetStudentLessons(1);
        System.out.println(HelloController.StudentLessons.LessonList);
        studentLessins.GetStudentLessons(2);
        System.out.println(HelloController.StudentLessons.LessonList);

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TeacherTable.getColumns().add(id);

        HelloController.StudentLessons.GetStudentLessons(2);
        for (int i = 0; i < HelloController.StudentLessons.LessonList.size(); i++)
        {
            System.out.println(HelloController.StudentLessons.LessonList.get(i).toString());
        }

        System.out.println(HelloApplication.CurrentUser.id+"\n"); //MIÉRT NULLÁZZA LE?
        studentLessins.GetStudentLessons(HelloApplication.CurrentUser.id);  //Üressé teszi a listát
        studentLessins.GetStudentLessons(2);
        System.out.println(HelloController.StudentLessons.LessonList);
        ObservableList<studentLessin> asd = FXCollections.observableArrayList(HelloController.StudentLessons.LessonList);
        asd.addAll(HelloController.StudentLessons.LessonList);
        for (studentLessin lessons : HelloController.StudentLessons.LessonList)
        {
            TeacherTable.getItems().add(asd);
        }
        TeacherTable.refresh();


        ArrayList<studentLessin> qwe;
        qwe = new ArrayList<>(HelloController.StudentLessons.LessonList);

        TeacherTable.refresh();*/


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
        studentLessins.DeleteStudentLesson(HelloApplication.CurrentUser.id, Slist.getSelectionModel().getSelectedIndex());
    }
}
