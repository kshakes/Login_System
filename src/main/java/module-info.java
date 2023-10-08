module com.example.loginsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.loginsystem to javafx.fxml;
    exports com.example.loginsystem;
}