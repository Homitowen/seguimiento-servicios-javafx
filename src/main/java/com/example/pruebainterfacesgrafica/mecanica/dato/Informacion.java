package com.example.pruebainterfacesgrafica.mecanica.dato;

import com.example.pruebainterfacesgrafica.mecanica.constantes.Cte;

import java.time.LocalDate;

public interface Informacion {

    public abstract int getIdS();
    public abstract int getIdP();
    public abstract String getNombre();
    public abstract String getPagina();
    public abstract LocalDate getFecha();
    public abstract double getCosto();
    Cte.Tipo getTipo();
    Cte.Act getActividad();
}
