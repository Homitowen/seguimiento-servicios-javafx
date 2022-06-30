package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public abstract class Cargador {
    private HBox caja;
    private Button btnCrear, btnModificar, eliminar;


    public Cargador(HBox caja, Button btnCrear, Button btnModificar, Button btnEliminar) {
        this.caja = caja;
        this.btnCrear = btnCrear;
        this.btnModificar = btnModificar;
        this.eliminar = btnEliminar;
    }


    public void mostrar(){
        caja.setVisible(true);
    }
    public void ocultar(){
        caja.setVisible(false);
    }


    public void paraCrear(){
        btnCrear.setVisible(true);
        btnModificar.setVisible(false);
        eliminar.setVisible(false);
    }
    public void paraModificar(){
        btnCrear.setVisible(false);
        btnModificar.setVisible(true);
        eliminar.setVisible(false);
    }
    public void paraEliminar(){
        btnCrear.setVisible(false);
        btnModificar.setVisible(false);
        eliminar.setVisible(true);
    }

    public abstract void recibirInformacionTabla(Informacion info);
    public abstract Informacion obtenerInformacionCargada();
    public abstract void recolectarCrear();
    public abstract void recolectarModificar();
    public abstract void recolectarEliminar();
}
