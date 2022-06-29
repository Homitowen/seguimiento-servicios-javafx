package com.example.pruebainterfacesgrafica.mecanica.base;

import com.example.pruebainterfacesgrafica.mecanica.dato.Dato;
import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;

public class Base {

    public Base() {
        System.out.println("configuracion incial");
    }
    public void cerrar(){
        System.out.println("cerrando base");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("cerrando de manera rara");
    }

    public void cargarServicioCrear(Informacion informacion){
        System.out.println("nombre: " + informacion.getNombre());
        System.out.println("pagina: " + informacion.getPagina());
    }
    public void cargarServicioModificar(Informacion informacion){
        System.out.println("idServicio: " + informacion.getIdS());
        System.out.println("nombre: " + informacion.getNombre());
        System.out.println("pagina: " + informacion.getPagina());
    }
    public void cargarServicioEliminar(Informacion informacion){
        System.out.println("idServicio: " + informacion.getIdS());
    }
    public void cargarServicioVer(Informacion informacion){}

    public void cargarPagoCrear(Informacion informacion){}
    public void cargarPagoModificar(Informacion informacion){}
    public void cargarPagoEliminar(Informacion informacion){}
    public void cargarPagoVer(Informacion informacion){}

}
