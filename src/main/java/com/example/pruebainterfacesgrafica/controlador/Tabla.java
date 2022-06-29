package com.example.pruebainterfacesgrafica.controlador;

import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Tabla {
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
}
