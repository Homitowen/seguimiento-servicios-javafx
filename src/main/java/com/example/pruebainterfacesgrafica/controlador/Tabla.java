package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.constantes.Cte;
import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public abstract class Tabla {
    private HBox titulo;
    private TableView tabla;
    private Cte.Tipo tipo;

    public Cte.Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Cte.Tipo tipo) {
        this.tipo = tipo;
    }

    public Tabla(HBox titulo, TableView tabla) {
        this.titulo = titulo;
        this.tabla = tabla;
    }

    private void mostrarTabla(){
        tabla.setVisible(true);
    }
    private void ocultarTabla(){
        tabla.setVisible(false);
    }
    private void mostrarTitulo(){
        titulo.setVisible(true);
    }
    private void ocultarTitulo(){
        titulo.setVisible(false);
    }

    public void mostrar(){
        mostrarTabla();
        mostrarTitulo();
    }
    public void ocultar(){
        ocultarTabla();
        ocultarTitulo();
    }

    public void limpiarTabla(){
        tabla.getItems().clear();
    }


    public abstract void cargarTabla(ObservableList<Informacion> conjunto);
    public abstract void configurarColumnas();
    public abstract Informacion enviarRenglonClickeado();

    public HBox getTitulo() {
        return this.titulo;
    }

    public TableView getTabla() {
        return this.tabla;
    }
}
