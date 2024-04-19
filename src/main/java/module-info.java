module com.example.demomoving {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demomoving to javafx.fxml;
    exports com.example.demomoving;
}