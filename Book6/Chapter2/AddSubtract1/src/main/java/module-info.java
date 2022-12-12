module com.example.addsubtract1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addsubtract1 to javafx.fxml;
    exports com.example.addsubtract1;
}