package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.TestTablas;
import com.example.pruebainterfacesgrafica.mecanica.base.Base;
import javafx.application.Platform;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Cerebro {
    private Base b;
    private MenuButton tipo, actividad;
    private MenuItem tipoServicio, tipoPago, actCrear, actModificar, actEliminar;
    private Cargador servicioCargador, pagoCargador, cargadorElegido;
    private Tabla servicioTabla, pagoTabla, tablaElegida;
    private TestTablas test;

    public Cerebro(MenuButton tipo, MenuButton actividad, MenuItem tipoServicio, MenuItem tipoPago, MenuItem actCrear, MenuItem actModificar, MenuItem actEliminar, Cargador servicio, Cargador pagoCargador, Tabla servicioTabla, Tabla pagoTabla) {
        this.tipo = tipo;
        this.actividad = actividad;
        this.tipoServicio = tipoServicio;
        this.tipoPago = tipoPago;
        this.actCrear = actCrear;
        this.actModificar = actModificar;
        this.actEliminar = actEliminar;
        this.servicioCargador = servicio;
        this.pagoCargador = pagoCargador;
        this.servicioTabla = servicioTabla;
        this.pagoTabla = pagoTabla;
        tablaElegida = servicioTabla;
        cargadorElegido = servicio;
        b = new Base();

        test = new TestTablas();
    }

    public void reiniciar(){
        servicioCargador.ocultar();
        pagoCargador.ocultar();
    }

    private void adaptarServicio(){
        cargadorElegido = servicioCargador;
    }
    private void adaptarPago(){
        cargadorElegido = pagoCargador;
    }
    private void adaptarPrimerTabla(){
        tablaElegida.ocultar();
        tablaElegida.limpiarTabla();
        tablaElegida = servicioTabla;
        tablaElegida.mostrar();
    }
    private void adaptarSegundaTabla(){
        tablaElegida.ocultar();
        tablaElegida.limpiarTabla();
        tablaElegida = pagoTabla;
        tablaElegida.mostrar();
    }


    public void mostrarServicio(){
        tipo.setText("Servicio");
        adaptarServicio();
        cargadorElegido.mostrar();
        adaptarPrimerTabla();
        tablaElegida.mostrar();

    }
    public void mostrarPago(){
        tipo.setText("Pago");
        adaptarPago();
        cargadorElegido.mostrar();
        adaptarSegundaTabla();
        tablaElegida.mostrar();
    }

    public void mostrarCrear(){
        actividad.setText("Crear");
        cargadorElegido.paraCrear();
    }
    public void mostrarModificar(){
        actividad.setText("Modificar");
        cargadorElegido.paraModificar();
    }
    public void mostrarEliminar(){
        actividad.setText("Eliminar");
        cargadorElegido.paraEliminar();
    }

    public void recolectarCrear(){
        cargadorElegido.recolectarCrear();
        enviarInformacionCerebroBase();
    }
    public void recolectarModificar(){
        cargadorElegido.recolectarModificar();
        enviarInformacionCerebroBase();
    }
    public void recolectarEliminar(){
        cargadorElegido.recolectarEliminar();
        enviarInformacionCerebroBase();
    }

    public void pasarTablaAlCargador(){
        cargadorElegido.recibirInformacionTabla(tablaElegida.enviarRenglonClickeado());
    }
    public void cargarTablaAlTest() {
        test.determinarTablayCargar(tablaElegida);
    }

    public void apagar() {
        b.cerrarTodo();
        Platform.exit();
    }

    private void enviarInformacionCerebroBase(){
        b.setInfoRecibida(cargadorElegido.obtenerInformacionCargada());
        b.comenzarProcesoInformacion();
    }
}
