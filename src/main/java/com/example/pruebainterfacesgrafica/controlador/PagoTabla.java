package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.constantes.Cte;
import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PagoTabla extends ServicioTabla{
    private TableColumn idPago, fecha, costo;

    public PagoTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, TableColumn idPago, TableColumn fecha, TableColumn costo) {
        super(titulo, tabla, idServicio, nombre);
        this.idPago = idPago;
        this.fecha = fecha;
        this.costo = costo;
        setTipo(Cte.Tipo.PAGO);
        configurarColumnas();
    }

    @Override
    public void configurarColumnas() {
        getIdServicio().setCellValueFactory(new PropertyValueFactory("idS"));
        getNombre().setCellValueFactory(new PropertyValueFactory("nombre"));
        idPago.setCellValueFactory(new PropertyValueFactory("idP"));
        fecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        costo.setCellValueFactory(new PropertyValueFactory("costo"));
    }

    @Override
    public Informacion enviarRenglonClickeado() {
        renglonElegido = (Servicio.Pago) getTabla().getSelectionModel().getSelectedItems().get(0);
        System.out.println(renglonElegido);
        return renglonElegido;
    }
}
