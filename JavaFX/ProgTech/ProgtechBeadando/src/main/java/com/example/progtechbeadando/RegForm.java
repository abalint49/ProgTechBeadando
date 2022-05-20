package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class RegForm extends Application {
   /*     LoginController.StateComboBox.getItems().removeAll(LoginController.StateComboBox.getItems());
    LoginController.StateComboBox.getItems().addAll("Option A","Option B","Option C");*/
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




    /*public RegForm(){

        /*setTitle("Regisztráció");
        setSize(450,300);
        setContentPane(RegPanel);
        setVisible(true);*/


   // gombkattintásra regisztrálást és feldobandó "sikeres regisztráció!" feliratot ide
   //RegButton.addActionListener(e -> main.Registration(RegNevBox.getText(), RegNeptunBox.getText(), StateCombobox.getSelectedIndex(), String.valueOf(RegJelszoBox.getPassword())));
        /*RegButton.addActionListener(e -> {
            main.Registration(RegNevBox.getText(), RegNeptunBox.getText(), StateCombobox.getSelectedIndex(), String.valueOf(RegJelszoBox.getPassword()));
            JOptionPane.showMessageDialog(null, "Sikeres regisztráció!", "Siker",JOptionPane.WARNING_MESSAGE);
            setVisible(false);
            dispose();
        });
    }*/


   @Override
   public void start(Stage stage) throws Exception {


      /*FXMLLoader fxmlLoader = new FXMLLoader(LoginForm.class.getResource("RegFormView.fxml"));
      Scene scene = new Scene(fxmlLoader.load(), 459, 348);*/

       /*LoginController.StateComboBox.getItems().removeAll(LoginController.StateComboBox.getItems());
       LoginController.StateComboBox.getItems().addAll("Diák", "Tanár", "Admin");
       LoginController.StateComboBox.getSelectionModel().select("Diák");*/

      /*ObservableList<String> list = FXCollections.observableArrayList("Diák","Tanár","Admin") ;
      LoginController.StateComboBox.setItems(list);*/

      /*stage.setTitle("Hello!");
      stage.setScene(scene);
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.show();*/
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

      /*String regNev = RegNevBox.getText();
      String regNeptun = RegNeptunBox.getText();
      String regJelszo = RegJelszoBox.getText();

      System.out.println(regNev + regJelszo + regNeptun + stateIndex);*/

      LoginForm.Registration(RegNevBox.getText().toString(), RegNeptunBox.getText().toString(), stateIndex,String.valueOf(RegJelszoBox.getText()));
      Message.setText("Sikeres regisztráció!");
      RegButton.setDisable(true);

   }




   //protected void onRegButtonClick() {
      /*int stateIndex = 0;
      switch (LoginController.RegGroup.getSelectedToggle().toString())
      {
         case "Diák": stateIndex=0; break;
         case "Tanár": stateIndex=1; break;
         case "Admin": stateIndex=2; break;
         default: System.out.println("Szarság van"); break;
      }
        LoginForm.Registration(LoginController.RegNevBox.getText(), LoginController.RegNeptunBox.getText(), stateIndex,String.valueOf(LoginController.RegJelszoBox.getText()));
        LoginController.Message.setText("Sikeres regisztráció!");*/
        /*JOptionPane.showMessageDialog(null, "Sikeres regisztráció!", "Siker",JOptionPane.WARNING_MESSAGE);*/
      //Stage stage = (Stage) LoginController.RegButton.getScene().getWindow();
      //stage.close();
            /*LoginForm.Registration(LoginController.RegNevBox.getText(), LoginController.RegNeptunBox.getText(), LoginController.StateComboBox.getVisibleRowCount(), String.valueOf(LoginController.RegJelszoBox.getText()));
            LoginController.Message.setText("Sikeres regisztráció!");

             */
   //}



}




