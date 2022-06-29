module com.example.pruebainterfacesgrafica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;




    opens com.example.pruebainterfacesgrafica to javafx.fxml;
    exports com.example.pruebainterfacesgrafica;
    exports com.example.pruebainterfacesgrafica.controlador;
    opens com.example.pruebainterfacesgrafica.controlador to javafx.fxml;
}