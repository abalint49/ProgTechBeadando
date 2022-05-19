package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

import static com.example.progtechbeadando.HelloController.StudentLessons;

public class StudentForm extends Application {
    @FXML
    public static TableView TeacherTable = new TableView<>();
    @FXML
    public static TableColumn<String, Lessons> id = new TableColumn<>("Id");
    @FXML
    public static ListView Slist = new ListView<>();


    @Override
    public void start(Stage stage) throws Exception {
    }

    public static void startS() {
        System.out.println("Halló");
        studentLessins.GetStudentLessons(HelloApplication.CurrentUser.id);
        System.out.println(HelloController.StudentLessons.LessonList);
        for (studentLessin lessons : HelloController.StudentLessons.LessonList)
        {
            Slist.getItems().add(lessons.toString());
        }




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
}
