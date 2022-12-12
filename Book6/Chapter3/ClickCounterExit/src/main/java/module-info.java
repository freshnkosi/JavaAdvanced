module com.example.clickcounterexit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clickcounterexit to javafx.fxml;
    exports com.example.clickcounterexit;
}