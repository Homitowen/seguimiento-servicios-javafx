package com.example.pruebainterfacesgrafica.controlador;

import com.example.pruebainterfacesgrafica.mecanica.base.Base;
import com.example.pruebainterfacesgrafica.mecanica.dato.Dato;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.security.auth.login.Configuration;


public class HelloController {

    private Base b = new Base();
    private Dato d = new Dato(b);


    private Partes servicio, pago;
    private Cerebro selector;
    private Tabla servicioTabla, pagoTabla, faltanteTabla, resumenTabla;


    @FXML
    private Button btnGenerarArchivo;

    @FXML
    private Button btnImprimir;

    @FXML
    private Button btnSetFechaResumenFaltantes;

    @FXML
    private DatePicker dpSetFechaResumen;

    @FXML
    private Button btnSalir;

    @FXML
    private VBox vbTipo;

    @FXML
    private MenuButton mbTipo;

    @FXML
    private MenuItem mbServicio;

    @FXML
    private MenuItem mbPago;

    @FXML
    private VBox vbActividad;

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
    private VBox vBoxNombrePago;

    @FXML
    private TextField txtNombrePago;

    @FXML
    private TextField txtIdServicio1;

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
    private Label lbMes;

    @FXML
    private Label lbAño;

    @FXML
    private Label lbCantidadTotal;

    @FXML
    private TableView<?> tvFaltante;

    @FXML
    private TableColumn<?, ?> tcIdServicioFaltante;

    @FXML
    private TableColumn<?, ?> tcNombreFaltante;

    @FXML
    private Label lbMesFaltante;

    @FXML
    private Label lbAñoFaltante;

    @FXML
    private HBox hbTituloServicio;

    @FXML
    private HBox hbTituloPago;

    @FXML
    private Label lbNombreServicioPago;

    @FXML
    private HBox hbTituloResumen;

    @FXML
    private Label lbMesResumen;

    @FXML
    private Label lbAñoResumen;

    @FXML
    private TableView<?> tvServicio;

    @FXML
    private TableColumn<?, ?> tcIdServicioServicio;

    @FXML
    private TableColumn<?, ?> tcNombreServicio;

    @FXML
    private TableColumn<?, ?> tcPaginaServicio;

    @FXML
    private TableView<?> tvPago;

    @FXML
    private TableColumn<?, ?> tcIdServicioPago;

    @FXML
    private TableColumn<?, ?> tcNombrePago;

    @FXML
    private TableColumn<?, ?> tcIdPagoPago;

    @FXML
    private TableColumn<?, ?> tcFechaPago;

    @FXML
    private TableColumn<?, ?> tcCostoPago;

    @FXML
    private TableView<?> tvResumen;

    @FXML
    private TableColumn<?, ?> tcIdServicioResumen;

    @FXML
    private TableColumn<?, ?> tcNombreResumen;

    @FXML
    private TableColumn<?, ?> tcIdPagoResumen;

    @FXML
    private TableColumn<?, ?> tcFechaResumen;

    @FXML
    private TableColumn<?, ?> tcCostoResumen;

    @FXML
    void onClickFaltante(MouseEvent event) {

    }

    @FXML
    void onClickPago(MouseEvent event) {

    }

    @FXML
    void onClickResumen(MouseEvent event) {

    }

    @FXML
    void onClickServicio(MouseEvent event) {

    }

    @FXML
    void onCosto(ActionEvent event) {

    }


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
    void onGenerarArchivo(ActionEvent event) {

    }

    @FXML
    void onImprimir(ActionEvent event) {

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
    void onSalir(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onServicio(ActionEvent event) {
        selector.mostrarServicio();
    }

    @FXML
    void onSetFechaResmuneFaltante(ActionEvent event) {

    }





































    @FXML
    void initialize() {

        servicio = new ServicioParte(hBoxServicio, btnCrearServicio, btnModificarServicio, btnEliminarServicio, txtIdServicioServicio, txtNombre, txtPagina, vBoxIdServicio, vBoxNombreServicio, vBoxPaginaServicio);

        pago = new PagoParte(hBoxPago,btnCrearPago,btnModificarPago,btnEliminarPago,vBoxIdServicioPago,vBoxNombrePago,vBoxIdPago,vBoxFechaPago,vBoxCostoPago,txtIdServicio,txtNombrePago,txtIdPago,txtCosto,dpFecha);

        servicioTabla = new ServicioTabla(hbTituloServicio, tvServicio, tcIdServicioServicio, tcNombreServicio);

        selector = new Cerebro(mbTipo, mbActividad, mbServicio, mbPago, mbCrear, mbModificar, mbEliminar, servicio, pago, servicioTabla);




    }



}
