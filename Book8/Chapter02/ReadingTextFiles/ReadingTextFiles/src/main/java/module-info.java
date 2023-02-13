module com.example.readingtextfiles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.readingtextfiles to javafx.fxml;
    exports com.example.readingtextfiles;
}