package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class StudentForm extends Application {
    @FXML
    private TableView TeacherTable;
    @FXML
    private TableColumn<String, Lessons> id = new TableColumn<>("Id");


    @Override
    public void start(Stage stage) throws Exception {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TeacherTable.getColumns().add(id);

        studentLessins.GetStudentLessons(HelloController.CurrentUser.id);
        System.out.println(HelloController.StudentLessons.LessonList);
        for (studentLessin lessons : HelloController.StudentLessons.LessonList)
        {
            TeacherTable.getItems().add(lessons);
        }
    }
}
