package com.example.pruebainterfacesgrafica.mecanica.dato;

import com.example.pruebainterfacesgrafica.mecanica.base.Base;

public class Servicio implements Informacion{
    private String idS, nombre, pagina;

    @Override
    public String toString() {
        return "Servicio{" +
                "idS='" + idS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pagina='" + pagina + '\'' +
                '}';
    }

    public Servicio(String idS) {
        this.idS = idS;
    }

    public Servicio(String nombre, String pagina) {
        this.nombre = nombre;
        this.pagina = pagina;
    }

    public Servicio(String idS, String nombre, String pagina) {
        this.idS = idS;
        this.nombre = nombre;
        this.pagina = pagina;
    }

    @Override
    public String getIdS() {
        return this.idS;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getPagina() {
        return this.pagina;
    }

    @Override
    public String getIdP() {
        return null;
    }

    @Override
    public String getFecha() {
        return null;
    }

    @Override
    public String getCosto() {
        return null;
    }

    public static class Pago extends Servicio{

        private String idP, fecha, costo;

        public Pago(String idS, String idP) {
            super(idS);
            this.idP = idP;
        }

        public Pago(String idS, String fecha, String costo) {
            super(idS);
            this.fecha = fecha;
            this.costo = costo;
        }

        public Pago(String idS, String idP, String fecha, String costo) {
            super(idS);
            this.idP = idP;
            this.fecha = fecha;
            this.costo = costo;
        }

        @Override
        public String toString() {
            return "Pago{" +
                    "idP='" + idP + '\'' +
                    ", fecha='" + fecha + '\'' +
                    ", costo='" + costo + '\'' +
                    "} " + super.toString();
        }

        @Override
        public String getIdP() {
            return this.idP;
        }

        @Override
        public String getFecha() {
            return this.fecha;
        }

        @Override
        public String getCosto() {
            return this.costo;
        }
    }
}
