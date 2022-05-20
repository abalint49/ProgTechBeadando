package com.example.progtechbeadando;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.io.IOException;


public class LoginController {
    static public Users users = new Users();
    static public Lessons lessons = new Lessons();
    static public studentLessins StudentLessons = new studentLessins();
    public PasswordField LoginJelszoBox;
    public TextField LoginNeptunBox;
    public static Parent root;
    public Label ErrorLogin;

    @FXML
    protected void onLoginButtonClick() throws IOException {
        if (LoginNeptunBox.getText().isEmpty()||LoginJelszoBox.getText().isEmpty())
        {
            ErrorLogin.setText("A neptunkód és a jelszó nem lehet üres!");
            return;
        }

            LoginForm.Login(LoginNeptunBox.getText(), LoginJelszoBox.getText());

        switch (LoginForm.CurrentUser.state) {
            case "0":
                root = FXMLLoader.load(getClass().getClassLoader().getResource(("StudentFormView.fxml")));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setTitle("Diák nézet");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
                break;
            case "1":
                root = FXMLLoader.load(getClass().getClassLoader().getResource(("TeacherFormView.fxml")));
                Stage stage1 = new Stage();
                Scene scene1 = new Scene(root);
                stage1.setTitle("Tanár nézet");
                stage1.setScene(scene1);
                stage1.initModality(Modality.APPLICATION_MODAL);
                stage1.show();
                break;
            case "2":
                System.out.println("Admin nézet");
                break;
            default: System.out.println("Helló, valami szar");
                break;
        }
    }
    public void onRegButtonClick() throws Exception {
        root = FXMLLoader.load(getClass().getClassLoader().getResource(("RegFormView.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Regisztráció");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}