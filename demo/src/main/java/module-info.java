module org.tiendaclase.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.tiendaclase.demo to javafx.fxml;
    exports org.tiendaclase.demo;
    exports org.tiendaclase.demo.Controller;
    opens org.tiendaclase.demo.Controller to javafx.fxml;
}