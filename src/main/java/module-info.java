module com.example.udemytodo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.example.udemytodo to javafx.fxml;
    exports com.example.udemytodo;
}