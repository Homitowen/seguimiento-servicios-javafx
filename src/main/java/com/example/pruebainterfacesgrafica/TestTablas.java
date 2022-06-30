package com.example.pruebainterfacesgrafica;

import com.example.pruebainterfacesgrafica.controlador.Tabla;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestTablas {

    public ObservableList<Servicio> conjuntoServiciosTest(){
        List<Servicio> conjunto = new ArrayList<>();

        for (int i = 0; i < 20; i++){

            conjunto.add(new Servicio(i, "servicio "+ i*2, "pagina "+3*i));

        }


        return FXCollections.observableList(conjunto);
    }
    public ObservableList<Servicio> conjuntoPagoTest(){
        List<Servicio> conjunto = new ArrayList<>();

        for (int i = 0; i < 20; i++){

            conjunto.add(new Servicio.Pago(i, "nombre"+2*i, i*3, LocalDate.now(), i*4));

        }


        return FXCollections.observableList(conjunto);
    }


    public void determinarTablayCargar(Tabla tabla){

        switch (tabla.getTipo()){
            case SERVICIO -> tabla.cargarTabla(conjuntoServiciosTest());
            case PAGO -> tabla.cargarTabla(conjuntoPagoTest());
        }

    }
}
