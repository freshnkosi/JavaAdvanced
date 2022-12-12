module com.example.addsubtract4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addsubtract4 to javafx.fxml;
    exports com.example.addsubtract4;
}