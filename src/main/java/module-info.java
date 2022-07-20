module com.example.krbntransport {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.krbn.ui to javafx.fxml;
    exports com.krbn.ui;
}