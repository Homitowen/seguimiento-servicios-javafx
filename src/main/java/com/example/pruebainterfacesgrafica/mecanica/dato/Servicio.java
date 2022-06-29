package com.example.pruebainterfacesgrafica.mecanica.dato;

import java.time.LocalDate;

public class Servicio implements Informacion{
    private int idS;
    private String nombre, pagina;

    @Override
    public String toString() {
        return "Servicio{" +
                "idS='" + idS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pagina='" + pagina + '\'' +
                '}';
    }

    public Servicio(int idS) {
        this.idS = idS;
    }

    public Servicio(int idS, String nombre) {
        this.idS = idS;
        this.nombre = nombre;
    }

    public Servicio(String nombre, String pagina) {
        this.nombre = nombre;
        this.pagina = pagina;
    }

    public Servicio(int idS, String nombre, String pagina) {
        this.idS = idS;
        this.nombre = nombre;
        this.pagina = pagina;
    }

    @Override
    public int getIdS() {
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
    public int getIdP() {
        return Integer.parseInt(null);
    }

    @Override
    public LocalDate getFecha() {
        return null;
    }

    @Override
    public double getCosto() {
        return Double.parseDouble(null);
    }

    public static class Pago extends Servicio{

        private int idP;
        private LocalDate fecha;
        private double costo;

        /**
         * Eliminar
         * @param idS
         * @param idP
         */
        public Pago(int idS, int idP) {
            super(idS);
            this.idP = idP;
        }

        /**
         * crear
         * @param idS
         * @param nombre
         * @param fecha
         * @param costo
         */
        public Pago(int idS, String nombre, LocalDate fecha, double costo) {
            super(idS, nombre);
            this.fecha = fecha;
            this.costo = costo;
        }

        /**
         * modificar
         * @param idS
         * @param nombre
         * @param idP
         * @param fecha
         * @param costo
         */
        public Pago(int idS, String nombre, int idP, LocalDate fecha, double costo) {
            super(idS, nombre);
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
        public int getIdP() {
            return this.idP;
        }

        @Override
        public LocalDate getFecha() {
            return this.fecha;
        }

        @Override
        public double getCosto() {
            return this.costo;
        }
    }
}
