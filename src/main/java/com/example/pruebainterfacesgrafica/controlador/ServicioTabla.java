package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ServicioTabla extends Tabla{
    private TableColumn idServicio, nombre, pagina;

    public ServicioTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre) {
        super(titulo, tabla);
        this.idServicio = idServicio;
        this.nombre = nombre;
    }

    public ServicioTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, TableColumn pagina) {
        super(titulo, tabla);
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.pagina = pagina;
    }

    @Override
    public void clickear() {

    }

    @Override
    public void enviarInformacion() {

    }

    @Override
    public void actualizar() {

    }
}
