package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public class FaltanteTabla extends ServicioTabla{
    private DatePicker fechaSeleccionada;

    public FaltanteTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, DatePicker fechaSeleccionada) {
        super(titulo, tabla, idServicio, nombre);
        this.fechaSeleccionada = fechaSeleccionada;
    }
}
