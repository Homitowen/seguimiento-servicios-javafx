package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PagoTabla extends ServicioTabla{
    private TableColumn idPago, fecha, costo;

    public PagoTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, TableColumn idPago, TableColumn fecha, TableColumn costo) {
        super(titulo, tabla, idServicio, nombre);
        this.idPago = idPago;
        this.fecha = fecha;
        this.costo = costo;
    }

}
