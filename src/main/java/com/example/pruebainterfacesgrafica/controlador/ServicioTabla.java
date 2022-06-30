package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.TestTablas;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

public class ServicioTabla extends Tabla{
    private TableColumn idServicio, nombre, pagina;
    private TestTablas test;

    public ServicioTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre) {
        super(titulo, tabla);
        this.idServicio = idServicio;
        this.nombre = nombre;
    }

    public ServicioTabla(HBox titulo, TableView tabla, TableColumn idServicio, TableColumn nombre, TableColumn pagina) {
        super(titulo, tabla);
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.pagina = pagina;
        configurar();
    }

    private void configurar(){

        this.idServicio.setCellValueFactory(new PropertyValueFactory<>("idS"));
        this.nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.pagina.setCellValueFactory(new PropertyValueFactory<>("pagina"));

    }

    @Override
    public void cargarTabla(ObservableList<Servicio> conjunto) {
        super.getTabla().setItems(conjunto);
    }

    @Override
    public void clickearRenglon() {

    }

    @Override
    public void enviarInformacion() {

    }

    @Override
    public void actualizar() {

    }
}
