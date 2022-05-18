package com.example.progtechbeadando;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegForm extends Application {


    public RegForm(){

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
        });*/
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegFormView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 459, 348);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
