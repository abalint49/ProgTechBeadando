package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TargyModosit extends Application {

    @FXML
    public TextField CTargynev = new TextField();
    @FXML
    public TextField CTargyido= new TextField();
    @FXML
    public TextField CTargyid= new TextField();
    public RadioButton NappaliGomb;
    public RadioButton LevGomb;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void Ctargygomb(ActionEvent actionEvent) {

        lesson nappali = new lesson(0,0,"","Nappali","");
        lesson levelezo = new lesson(0,0,"","Levelező","");

        lesson add = null;

        if (NappaliGomb.isSelected())
            add = nappali;
        if (LevGomb.isSelected())
            add = levelezo;

        add.lessonName = CTargynev.getText();
        add.time = CTargyido.getText();
        add.teacherId = LoginForm.CurrentUser.id;

        LoginForm.UppdataLessons(Integer.parseInt(CTargyid.getText()),add.lessonName,add.location,add.time);

        Lessons.RefressLessons();
    }
}