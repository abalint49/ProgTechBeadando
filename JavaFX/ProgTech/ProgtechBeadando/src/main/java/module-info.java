module com.example.progtechbeadando {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires junit;
    requires org.testng;
    requires java.security.jgss;

    opens com.example.progtechbeadando to javafx.fxml;
    exports com.example.progtechbeadando;
}