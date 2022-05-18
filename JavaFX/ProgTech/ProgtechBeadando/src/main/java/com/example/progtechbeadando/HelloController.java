package com.example.progtechbeadando;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    public PasswordField LoginJelszoBox;
    public TextField LoginNeptunBox;
    public PasswordField RegJelszoBox;
    public TextField RegNevBox;
    public TextField RegNeptunBox;
    @FXML
    protected void onLoginButtonClick() {
        System.out.println(LoginNeptunBox.getText());
        System.out.println(LoginJelszoBox.getText());
        HelloApplication.Login(LoginNeptunBox.getText(), LoginJelszoBox.getText());
        switch (HelloApplication.CurrentUser.state) {
            case "0":
                //s = new StudentForm();
            case "1":
                //t = new TeacherForm();
            case "2":
                //t = new TeacherForm();
            default: System.out.println("Helló, valami szar");
        }

    }

    public void onRegButtonClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(("RegFormView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Reg");
        stage.setScene(scene);
        stage.show();
    }


}