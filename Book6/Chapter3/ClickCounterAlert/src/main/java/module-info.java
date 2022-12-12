module com.example.clickcounteralert {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clickcounteralert to javafx.fxml;
    exports com.example.clickcounteralert;
}