module com.example.usinglayoutpanes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.usinglayoutpanes to javafx.fxml;
    exports com.example.usinglayoutpanes;
}