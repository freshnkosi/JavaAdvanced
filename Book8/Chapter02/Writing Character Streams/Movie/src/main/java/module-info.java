module com.example.movie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movie to javafx.fxml;
    exports com.example.movie;
}