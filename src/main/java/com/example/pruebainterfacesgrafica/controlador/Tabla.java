package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public abstract class Tabla {
    private HBox titulo;
    private TableView tabla;

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


    public abstract void cargarTabla(ObservableList<Servicio> conjunto);
    public abstract void clickearRenglon();
    public abstract void enviarInformacion();
    public abstract void actualizar();

    public HBox getTitulo() {
        return this.titulo;
    }

    public TableView getTabla() {
        return this.tabla;
    }
}
