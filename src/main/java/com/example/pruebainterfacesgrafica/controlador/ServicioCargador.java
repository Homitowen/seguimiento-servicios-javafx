package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ServicioCargador extends Cargador {

    private TextField idS, nombre, pagina;
    private VBox boxId, boxNombre, boxPagina;
    private Informacion inf;

    public ServicioCargador(HBox caja, Button btnCrear, Button btnModificar, Button btnEliminar, TextField idS, TextField nombre, TextField pagina, VBox boxId, VBox boxNombre, VBox boxPagina) {
        super(caja, btnCrear, btnModificar, btnEliminar);
        this.idS = idS;
        this.nombre = nombre;
        this.pagina = pagina;
        this.boxId = boxId;
        this.boxNombre = boxNombre;
        this.boxPagina = boxPagina;
    }


    private void reiniciarTxt(){
        idS.setText(null);
        nombre.setText(null);
        pagina.setText(null);
    }
    private void reiniciarCajas(){
        boxId.setVisible(true);
        boxNombre.setVisible(true);
        boxPagina.setVisible(true);
    }
    private void reiniciar(){
        reiniciarTxt();
        reiniciarCajas();

    }

    @Override
    public void paraCrear() {
        reiniciar();
        super.paraCrear();
        boxId.setVisible(false);
    }

    @Override
    public void paraModificar() {
        reiniciar();
        super.paraModificar();
    }

    @Override
    public void paraEliminar() {
        reiniciar();
        super.paraEliminar();
        boxNombre.setVisible(false);
        boxPagina.setVisible(false);
    }

    @Override
    public void recibirInformacionTabla(Informacion info) {
        idS.setText(String.valueOf(info.getIdS()));
        nombre.setText(info.getNombre());
        pagina.setText(info.getPagina());
    }

    @Override
    public Informacion obtenerInformacionCargada() {
        return inf;
    }


    @Override
    public void recolectarCrear() {
        inf = new Servicio(nombre.getText(), pagina.getText());
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarModificar() {
        inf = new Servicio(Integer.parseInt(idS.getText()), nombre.getText(), pagina.getText());
        System.out.println(inf);
        reiniciarTxt();
    }

    @Override
    public void recolectarEliminar() {
        inf = new Servicio(Integer.parseInt(idS.getText()));
        System.out.println(inf);
        reiniciarTxt();
    }
}
