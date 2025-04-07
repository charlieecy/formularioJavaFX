module org.example.javafxbutton {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.javafxbutton to javafx.fxml;
    exports org.example.javafxbutton;

    opens org.example.javafxbutton.controllers to javafx.fxml;
    exports org.example.javafxbutton.controllers;
}