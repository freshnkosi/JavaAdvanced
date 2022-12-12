module com.example.addsubtract3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addsubtract3 to javafx.fxml;
    exports com.example.addsubtract3;
}