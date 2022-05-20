package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TargyLetrehoz extends Application {

    @FXML
    public TextField CTargynev = new TextField();
    @FXML
    public TextField CTargyido= new TextField();
    public RadioButton NappaliGomb;
    public RadioButton LevGomb;
    public Label TClabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void Ctargygomb(ActionEvent actionEvent) {

        if (CTargynev.getText().isEmpty()||CTargyido.getText().isEmpty())
        {
            TClabel.setText("A szövegmezőkben\n nincs adat!");
            return;
        }


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

        Lessons.AddLesson(add);
        TClabel.setText("Tárgy létrehozva!");
        Lessons.RefressLessons();
    }
}
