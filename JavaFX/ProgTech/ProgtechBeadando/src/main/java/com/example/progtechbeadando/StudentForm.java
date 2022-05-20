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
        System.out.println("Halló");
        studentLessins.GetStudentLessons(LoginForm.CurrentUser.id);
        Frissit();
        /*System.out.println(LoginController.StudentLessons.LessonList);


        for (int i = 0; i < LoginController.StudentLessons.LessonList.size(); i++) {
            //System.out.println(i);
            //System.out.println(LoginController.StudentLessons.LessonList.get(i));
            Slist.getItems().add(LoginController.StudentLessons.LessonList.get(i).toString());
        }*/

        Slist.refresh();
    betoltve=true;
    }
    else return;

        /*
        for (studentLessin lessons : LoginController.StudentLessons.LessonList)
        {
            Slist.getItems().add(lessons.toString());
        }*/




        /*studentLessins.GetStudentLessons(0);
        System.out.println(LoginController.StudentLessons.LessonList);
        studentLessins.GetStudentLessons(1);
        System.out.println(LoginController.StudentLessons.LessonList);
        studentLessins.GetStudentLessons(2);
        System.out.println(LoginController.StudentLessons.LessonList);

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TeacherTable.getColumns().add(id);

        LoginController.StudentLessons.GetStudentLessons(2);
        for (int i = 0; i < LoginController.StudentLessons.LessonList.size(); i++)
        {
            System.out.println(LoginController.StudentLessons.LessonList.get(i).toString());
        }

        System.out.println(LoginForm.CurrentUser.id+"\n"); //MIÉRT NULLÁZZA LE?
        studentLessins.GetStudentLessons(LoginForm.CurrentUser.id);  //Üressé teszi a listát
        studentLessins.GetStudentLessons(2);
        System.out.println(LoginController.StudentLessons.LessonList);
        ObservableList<studentLessin> asd = FXCollections.observableArrayList(LoginController.StudentLessons.LessonList);
        asd.addAll(LoginController.StudentLessons.LessonList);
        for (studentLessin lessons : LoginController.StudentLessons.LessonList)
        {
            TeacherTable.getItems().add(asd);
        }
        TeacherTable.refresh();


        ArrayList<studentLessin> qwe;
        qwe = new ArrayList<>(LoginController.StudentLessons.LessonList);

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


        //System.out.println(LoginForm.CurrentUser.id);

        int selectidId = Integer.parseInt(Slist.getSelectionModel().getSelectedItems().toString().split(",")[0].split(" ")[1]);
        //System.out.println(selectidId);
        studentLessins.DeleteStudentLesson(LoginForm.CurrentUser.id, selectidId);
        StudentLabel.setText("Tárgy leadva");
        Frissit();
    }
    public void Frissit()
    {
        Slist.getItems().clear();
        studentLessins.GetStudentLessons(LoginForm.CurrentUser.id);
        //System.out.println(LoginController.StudentLessons.LessonList);


        for (int i = 0; i < LoginController.StudentLessons.LessonList.size(); i++) {
            //System.out.println(i);
            //System.out.println(LoginController.StudentLessons.LessonList.get(i));
            Slist.getItems().add(LoginController.StudentLessons.LessonList.get(i).toString());
        }


        Slist.refresh();
    }
}
