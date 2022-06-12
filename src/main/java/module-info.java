module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javafxapp to javafx.fxml;
    exports ru.gb.javafxapp;
}