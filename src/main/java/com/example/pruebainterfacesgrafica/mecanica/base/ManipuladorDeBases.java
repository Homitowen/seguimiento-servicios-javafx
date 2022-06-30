package com.example.pruebainterfacesgrafica.mecanica.base;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.Act.*;
import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.Tipo.PAGO;
import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.Tipo.SERVICIO;

public interface ManipuladorDeBases {


    void ejecutarCrear();
    void ejecutarModificar();
    void ejecutarEliminar();
}
