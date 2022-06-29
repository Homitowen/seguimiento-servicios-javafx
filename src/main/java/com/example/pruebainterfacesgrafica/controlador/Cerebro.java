package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Cerebro {
    private MenuButton tipo, actividad;
    private MenuItem tipoServicio, tipoPago, actCrear, actModificar, actEliminar;
    private Partes servicio, pago, elegido;
    private Tabla servicioTabla;
    private Tabla tablaElegida;

    public Cerebro(MenuButton tipo, MenuButton actividad, MenuItem tipoServicio, MenuItem tipoPago, MenuItem actCrear, MenuItem actModificar, MenuItem actEliminar, Partes servicio, Partes pago, Tabla servicioTabla) {
        this.tipo = tipo;
        this.actividad = actividad;
        this.tipoServicio = tipoServicio;
        this.tipoPago = tipoPago;
        this.actCrear = actCrear;
        this.actModificar = actModificar;
        this.actEliminar = actEliminar;
        this.servicio = servicio;
        this.pago = pago;
        this.servicioTabla = servicioTabla;
    }

    public Cerebro(MenuButton tipo, MenuButton actividad, MenuItem tipoServicio, MenuItem tipoPago, MenuItem actCrear, MenuItem actModificar, MenuItem actEliminar, Partes servicio, Partes pago) {
        this.tipo = tipo;
        this.actividad = actividad;
        this.tipoServicio = tipoServicio;
        this.tipoPago = tipoPago;
        this.actCrear = actCrear;
        this.actModificar = actModificar;
        this.actEliminar = actEliminar;
        this.servicio = servicio;
        this.pago = pago;
    }


    public Cerebro(MenuButton tipo, MenuButton actividad, MenuItem tipoServicio, MenuItem tipoPago, MenuItem actCrear, MenuItem actModificar, MenuItem actEliminar, Partes servicio) {
        this.tipo = tipo;
        this.actividad = actividad;
        this.tipoServicio = tipoServicio;
        this.tipoPago = tipoPago;
        this.actCrear = actCrear;
        this.actModificar = actModificar;
        this.actEliminar = actEliminar;
        this.servicio = servicio;
    }

    public void copiarClip(){

    }

    public void reiniciar(){
        servicio.ocultar();
        pago.ocultar();
    }

    private void adaptarServicio(){
        elegido = servicio;
    }
    private void adaptarPago(){
        elegido = pago;
    }
    private void adaptarPrimerTabla(){
        tablaElegida = servicioTabla;
    }

    private void adaptarSegundaTabla(){

    }


    public void mostrarServicio(){
        tipo.setText("Servicio");
        adaptarServicio();
        elegido.mostrar();
        adaptarPrimerTabla();
        tablaElegida.mostrar();

    }
    public void mostrarPago(){
        tipo.setText("Pago");
        adaptarPago();
        elegido.mostrar();
    }

    public void mostrarCrear(){
        actividad.setText("Crear");
        elegido.paraCrear();
    }
    public void mostrarModificar(){
        actividad.setText("Modificar");
        elegido.paraModificar();
    }
    public void mostrarEliminar(){
        actividad.setText("Eliminar");
        elegido.paraEliminar();
    }
    public void recolectarCrear(){
        elegido.recolectarCrear();
    }
    public void recolectarModificar(){
        elegido.recolectarModificar();
    }
    public void recolectarEliminar(){
        elegido.recolectarEliminar();
    }
}
