package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ResumenTabla extends PagoTabla {
    private DatePicker fechaSeleccionada;

    public ResumenTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, TableColumn idPago, TableColumn fecha, TableColumn costo, DatePicker fechaSeleccionada) {
        super(titulo, tabla, idServicio, nombre, idPago, fecha, costo);
        this.fechaSeleccionada = fechaSeleccionada;
    }

}
