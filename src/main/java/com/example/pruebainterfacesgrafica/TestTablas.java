package com.example.pruebainterfacesgrafica;

import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
}
