module com.example.clickcounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clickcounter to javafx.fxml;
    exports com.example.clickcounter;
}