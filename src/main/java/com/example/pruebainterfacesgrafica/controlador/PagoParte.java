package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class PagoParte extends Partes{

    private VBox cajaIdServicio, cajaNombre,cajaIdPago, cajaFecha, cajaCosto;
    private TextField idServicio, nombre, idPago, costo;
    private DatePicker fecha;
    private Informacion inf;
    private Clipboard clipsito;

    public PagoParte(HBox caja, Button btnCrear, Button btnModificar, Button btnEliminar, VBox cajaIdServicio, VBox cajaNombre, VBox cajaIdPago, VBox cajaFecha, VBox cajaCosto, TextField idServicio, TextField nombre, TextField idPago, TextField costo, DatePicker fecha) {
        super(caja, btnCrear, btnModificar, btnEliminar);
        this.cajaIdServicio = cajaIdServicio;
        this.cajaNombre = cajaNombre;
        this.cajaIdPago = cajaIdPago;
        this.cajaFecha = cajaFecha;
        this.cajaCosto = cajaCosto;
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.idPago = idPago;
        this.costo = costo;
        this.fecha = fecha;
    }

    public void copiarClip(){
    }

    private void reiniciarTxt(){
        idServicio.setText(null);
        idPago.setText(null);
        fecha.setValue(null);
        costo.setText(null);
        nombre.setText(null);
    }
    private void reiniciarCajas(){
        cajaIdServicio.setVisible(true);
        cajaIdPago.setVisible(true);
        cajaFecha.setVisible(true);
        cajaCosto.setVisible(true);
        cajaNombre.setVisible(true);
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
        cajaNombre.setVisible(false);
    }

    @Override
    public void recolectarCrear() {
        inf = new Servicio.Pago(Integer.parseInt(idServicio.getText()),
                nombre.getText(),
                fecha.getValue(),
                Double.parseDouble(costo.getText()));
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarModificar() {
        inf = new Servicio.Pago(Integer.parseInt(idServicio.getText()),
                nombre.getText(),
                Integer.parseInt(idPago.getText()),
                fecha.getValue(),
                Double.parseDouble(costo.getText()));
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarEliminar() {
        inf = new Servicio.Pago(Integer.parseInt(idServicio.getText()),
                Integer.parseInt(idPago.getText()));
        System.out.println(inf);
        reiniciarTxt();
    }
}
