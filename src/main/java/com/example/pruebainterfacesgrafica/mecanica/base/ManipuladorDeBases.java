package com.example.pruebainterfacesgrafica.mecanica.base;

import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;

public interface ManipuladorDeBases {

    static ManipuladorDeBases identificarElegirTipo(Informacion info){
        return switch (info.getTipo()) {
            case SERVICIO -> new Base.ServicioBase();
            case PAGO -> new Base.PagoBase();
            default -> null;
        };
    }
    static void identificarElegirActividad(Informacion info, ManipuladorDeBases baseElegida){
        switch (info.getActividad()){
            case CREAR -> baseElegida.ejecutarCrear();
            case MODIFICAR -> baseElegida.ejecutarModificar();
            case ELIMINAR -> baseElegida.ejecutarEliminar();
            case VER -> baseElegida.ejecutarVer();
        }
    }

    void ejecutarCrear();
    void ejecutarModificar();
    void ejecutarEliminar();
    void ejecutarVer();
}
