package com.example.progtechbeadando;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class RegForm extends Application {
   @FXML
   private PasswordField RegJelszoBox = new PasswordField();
   @FXML
   private TextField RegNevBox = new TextField();
   @FXML
   private TextField RegNeptunBox = new TextField();
   @FXML
   private Button RegButton;
   @FXML
   private Label Message = new Label();
   @FXML
   public static ToggleGroup RegGroup = new ToggleGroup();
   public RadioButton R1 = new RadioButton();
   public RadioButton R2 = new RadioButton();
   public RadioButton R3 = new RadioButton();
   @Override
   public void start(Stage stage) throws Exception {
   }
   public void RegButtonClick(ActionEvent actionEvent) {
      if (RegNevBox.getText().isEmpty()||RegNeptunBox.getText().isEmpty()||RegJelszoBox.getText().isEmpty())
      {
         Message.setText("A név, a neptunkód és a jelszó\n nem lehet üres!");
         return;
      }
      int stateIndex = 0;
      if (R1.isSelected()) stateIndex=0;
      if (R2.isSelected()) stateIndex=1;
      if (R3.isSelected()) stateIndex=2;
      LoginForm.Registration(RegNevBox.getText(), RegNeptunBox.getText(), stateIndex,String.valueOf(RegJelszoBox.getText()));
      Message.setText("Sikeres regisztráció!");
      RegButton.setDisable(true);
   }
}