module com.example.workingwithxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.workingwithxml to javafx.fxml;
    exports com.example.workingwithxml;
}