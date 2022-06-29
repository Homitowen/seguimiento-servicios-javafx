package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.base.Base;
import com.example.pruebainterfacesgrafica.mecanica.dato.Dato;

import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController {

    private Base b = new Base();
    private Dato d = new Dato(b);


    private Partes servicio, pago;
    private Selector selector;


    public HelloController() {
        System.out.println("hellocontroller");

    }


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton mbTipo;

    @FXML
    private MenuItem mbServicio;

    @FXML
    private MenuItem mbPago;

    @FXML
    private MenuButton mbActividad;

    @FXML
    private MenuItem mbCrear;

    @FXML
    private MenuItem mbModificar;

    @FXML
    private MenuItem mbEliminar;

    @FXML
    private HBox hBoxPago;

    @FXML
    private VBox vBoxIdServicioPago;

    @FXML
    private TextField txtIdServicio;

    @FXML
    private VBox vBoxIdPago;

    @FXML
    private TextField txtIdPago;

    @FXML
    private VBox vBoxFechaPago;

    @FXML
    private DatePicker dpFecha;

    @FXML
    private VBox vBoxCostoPago;

    @FXML
    private TextField txtCosto;

    @FXML
    private Button btnCrearPago;

    @FXML
    private Button btnModificarPago;

    @FXML
    private Button btnEliminarPago;

    @FXML
    private HBox hBoxServicio;

    @FXML
    private VBox vBoxIdServicio;

    @FXML
    private TextField txtIdServicioServicio;

    @FXML
    private VBox vBoxNombreServicio;

    @FXML
    private TextField txtNombre;

    @FXML
    private VBox vBoxPaginaServicio;

    @FXML
    private TextField txtPagina;

    @FXML
    private Button btnCrearServicio;

    @FXML
    private Button btnModificarServicio;

    @FXML
    private Button btnEliminarServicio;

    @FXML
    void onCrear(ActionEvent event) {
        selector.mostrarCrear();
    }

    @FXML
    void onCrearPago(ActionEvent event) {
        selector.recolectarCrear();
    }

    @FXML
    void onCrearServicio(ActionEvent event) {
        selector.recolectarCrear();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        selector.mostrarEliminar();
    }

    @FXML
    void onEliminarPago(ActionEvent event) {
        selector.recolectarEliminar();
    }

    @FXML
    void onEliminarServicio(ActionEvent event) {
        selector.recolectarEliminar();
    }

    @FXML
    void onMbTipo(MouseEvent event) {
        selector.reiniciar();
    }

    @FXML
    void onModificar(ActionEvent event) {
        selector.mostrarModificar();
    }

    @FXML
    void onModificarPago(ActionEvent event) {
        selector.recolectarModificar();
    }

    @FXML
    void onModificarServicio(ActionEvent event) {
        selector.recolectarModificar();
    }

    @FXML
    void onPago(ActionEvent event) {
        selector.mostrarPago();
    }

    @FXML
    void onServicio(ActionEvent event) {
        selector.mostrarServicio();
    }












































    @FXML
    void initialize() {

        servicio = new ServicioParte(hBoxServicio, btnCrearServicio, btnModificarServicio, btnEliminarServicio, txtIdServicioServicio, txtNombre, txtPagina, vBoxIdServicio, vBoxNombreServicio, vBoxPaginaServicio);

        pago = new PagoParte(hBoxPago,btnCrearPago,btnModificarPago,btnEliminarPago,vBoxIdServicioPago,vBoxIdPago,vBoxFechaPago,vBoxCostoPago,txtIdServicio,txtIdPago,dpFecha,txtCosto);

        selector = new Selector(mbTipo, mbActividad, mbServicio, mbPago, mbCrear, mbModificar, mbEliminar, servicio, pago);



    }
}
