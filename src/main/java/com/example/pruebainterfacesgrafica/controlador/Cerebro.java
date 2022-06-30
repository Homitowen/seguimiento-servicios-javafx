package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.TestTablas;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Cerebro {
    private MenuButton tipo, actividad;
    private MenuItem tipoServicio, tipoPago, actCrear, actModificar, actEliminar;
    private Partes servicio, pago, elegido;
    private Tabla servicioTabla, pagoTabla;
    private Tabla tablaElegida;

    public Cerebro(MenuButton tipo, MenuButton actividad, MenuItem tipoServicio, MenuItem tipoPago, MenuItem actCrear, MenuItem actModificar, MenuItem actEliminar, Partes servicio, Partes pago, Tabla servicioTabla, Tabla pagoTabla) {
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
        this.pagoTabla = pagoTabla;
        tablaElegida = servicioTabla;
        elegido = servicio;
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

    public void cargarTest(){
        TestTablas test = new TestTablas();
        ObservableList<Servicio> arreglado = test.conjuntoServiciosTest();
        tablaElegida.cargarTabla(arreglado);
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
        tablaElegida.ocultar();
        tablaElegida = servicioTabla;
        tablaElegida.mostrar();
    }

    private void adaptarSegundaTabla(){
        tablaElegida.ocultar();
        tablaElegida = pagoTabla;
        tablaElegida.mostrar();
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
        adaptarSegundaTabla();
        tablaElegida.mostrar();
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
