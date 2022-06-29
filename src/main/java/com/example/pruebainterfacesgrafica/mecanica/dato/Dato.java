package com.example.pruebainterfacesgrafica.mecanica.dato;

import com.example.pruebainterfacesgrafica.mecanica.base.Base;

public class Dato {

    private Base b;
    private Informacion informacion;

    public Dato(Base b) {
        this.b = b;
    }

    public Informacion getInformacion() {
        return this.informacion;
    }

    public void setInformacion(Informacion informacion) {
        this.informacion = informacion;
    }

    public Base getB() {
        return this.b;
    }


}
