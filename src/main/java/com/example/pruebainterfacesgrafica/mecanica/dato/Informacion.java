package com.example.pruebainterfacesgrafica.mecanica.dato;

import java.time.LocalDate;

public interface Informacion {

    public abstract int getIdS();
    public abstract int getIdP();
    public abstract String getNombre();
    public abstract String getPagina();
    public abstract LocalDate getFecha();
    public abstract double getCosto();



}
