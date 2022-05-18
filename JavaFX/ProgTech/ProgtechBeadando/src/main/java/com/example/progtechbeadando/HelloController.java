package com.example.progtechbeadando;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {


    public PasswordField LoginJelszoBox;
    public TextField LoginNeptunBox;
    public static PasswordField RegJelszoBox;
    public static TextField RegNevBox;
    public static TextField RegNeptunBox;
    //public static Button RegButton;
    //public static Label Message;
    //public static ToggleGroup RegGroup;

    public static Parent root;

    @FXML
    protected void onLoginButtonClick() {
        HelloApplication.Login(LoginNeptunBox.getText(), LoginJelszoBox.getText());
        switch (HelloApplication.CurrentUser.state) {
            case "0":
                System.out.println("nem oké");
                //s = new StudentForm();
                break;
            case "1":
                System.out.println("oké");
                //t = new TeacherForm();
                break;
            case "2":
                System.out.println("nagyon nem oké");
                //t = new TeacherForm();
                break;
            default: System.out.println("Helló, valami szar");
                break;
        }

    }
    public void onRegButtonClick() throws IOException {


        root = FXMLLoader.load(getClass().getClassLoader().getResource(("RegFormView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        


        stage.setTitle("Reg");
        stage.setScene(scene);

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();




    }



}