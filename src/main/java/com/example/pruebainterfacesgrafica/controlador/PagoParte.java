package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class PagoParte extends Partes{

    private VBox cajaIdServicio, cajaIdPago, cajaFecha, cajaCosto;
    private TextField idServicio, idPago, costo;
    private DatePicker fecha;
    private Informacion inf;

    public PagoParte(HBox caja, Button btnCrear, Button btnModificar, Button btnEliminar, VBox cajaIdServicio, VBox cajaIdPago, VBox cajaFecha, VBox cajaCosto, TextField idServicio, TextField idPago, DatePicker fecha, TextField costo) {
        super(caja, btnCrear, btnModificar, btnEliminar);
        this.cajaIdServicio = cajaIdServicio;
        this.cajaIdPago = cajaIdPago;
        this.cajaFecha = cajaFecha;
        this.cajaCosto = cajaCosto;
        this.idServicio = idServicio;
        this.idPago = idPago;
        this.fecha = fecha;
        this.costo = costo;
    }

    private void reiniciarTxt(){
        idServicio.setText(null);
        idPago.setText(null);
        fecha.setValue(null);
        costo.setText(null);
    }
    private void reiniciarCajas(){
        cajaIdServicio.setVisible(true);
        cajaIdPago.setVisible(true);
        cajaFecha.setVisible(true);
        cajaCosto.setVisible(true);
    }
    private void reiniciarGeneral(){
        reiniciarTxt();
        reiniciarCajas();
    }

    @Override
    public void paraCrear() {
        reiniciarGeneral();
        super.paraCrear();
        cajaIdPago.setVisible(false);
    }

    @Override
    public void paraModificar() {
        reiniciarGeneral();
        super.paraModificar();
    }

    @Override
    public void paraEliminar() {
        reiniciarGeneral();
        super.paraEliminar();
        cajaFecha.setVisible(false);
        cajaCosto.setVisible(false);
    }

    @Override
    public void recolectarCrear() {
        inf = new Servicio.Pago(idServicio.getText(), fecha.getValue().toString(),costo.getText());
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarModificar() {
        inf = new Servicio.Pago(idServicio.getText(),idPago.getText(),fecha.getValue().toString(),costo.getText());
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarEliminar() {
        inf = new Servicio.Pago(idServicio.getText(),idPago.getText());
        System.out.println(inf);
        reiniciarTxt();
    }
}
