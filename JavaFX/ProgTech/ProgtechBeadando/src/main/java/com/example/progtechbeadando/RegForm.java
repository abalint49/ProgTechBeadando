package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class RegForm extends Application {
   /*     HelloController.StateComboBox.getItems().removeAll(HelloController.StateComboBox.getItems());
    HelloController.StateComboBox.getItems().addAll("Option A","Option B","Option C");*/
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


      /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegFormView.fxml"));
      Scene scene = new Scene(fxmlLoader.load(), 459, 348);*/

       /*HelloController.StateComboBox.getItems().removeAll(HelloController.StateComboBox.getItems());
       HelloController.StateComboBox.getItems().addAll("Diák", "Tanár", "Admin");
       HelloController.StateComboBox.getSelectionModel().select("Diák");*/

      /*ObservableList<String> list = FXCollections.observableArrayList("Diák","Tanár","Admin") ;
      HelloController.StateComboBox.setItems(list);*/

      /*stage.setTitle("Hello!");
      stage.setScene(scene);
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.show();*/
   }


   public void RegButtonClick(ActionEvent actionEvent) {
      int stateIndex = 0;
      if (R1.isSelected()) stateIndex=0;
      if (R2.isSelected()) stateIndex=1;
      if (R3.isSelected()) stateIndex=2;

      /*String regNev = RegNevBox.getText();
      String regNeptun = RegNeptunBox.getText();
      String regJelszo = RegJelszoBox.getText();

      System.out.println(regNev + regJelszo + regNeptun + stateIndex);*/

      HelloApplication.Registration(RegNevBox.getText().toString(), RegNeptunBox.getText().toString(), stateIndex,String.valueOf(RegJelszoBox.getText()));
      Message.setText("Sikeres regisztráció!");
      RegButton.setDisable(true);

   }




   //protected void onRegButtonClick() {
      /*int stateIndex = 0;
      switch (HelloController.RegGroup.getSelectedToggle().toString())
      {
         case "Diák": stateIndex=0; break;
         case "Tanár": stateIndex=1; break;
         case "Admin": stateIndex=2; break;
         default: System.out.println("Szarság van"); break;
      }
        HelloApplication.Registration(HelloController.RegNevBox.getText(), HelloController.RegNeptunBox.getText(), stateIndex,String.valueOf(HelloController.RegJelszoBox.getText()));
        HelloController.Message.setText("Sikeres regisztráció!");*/
        /*JOptionPane.showMessageDialog(null, "Sikeres regisztráció!", "Siker",JOptionPane.WARNING_MESSAGE);*/
      //Stage stage = (Stage) HelloController.RegButton.getScene().getWindow();
      //stage.close();
            /*HelloApplication.Registration(HelloController.RegNevBox.getText(), HelloController.RegNeptunBox.getText(), HelloController.StateComboBox.getVisibleRowCount(), String.valueOf(HelloController.RegJelszoBox.getText()));
            HelloController.Message.setText("Sikeres regisztráció!");

             */
   //}



}




