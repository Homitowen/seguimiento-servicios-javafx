package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ServicioTabla extends Tabla{
    private TableColumn idServicio;
    private TableColumn nombre;

    public ServicioTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre) {
        super(titulo, tabla);
        this.idServicio = idServicio;
        this.nombre = nombre;
    }




}
