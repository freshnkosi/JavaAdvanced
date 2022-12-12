module com.example.clickmeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clickmeapp to javafx.fxml;
    exports com.example.clickmeapp;
}