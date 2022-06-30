package com.example.pruebainterfacesgrafica.mecanica.dato;

import com.example.pruebainterfacesgrafica.mecanica.constantes.Cte;

import java.time.LocalDate;

public class Servicio implements Informacion{
    private int idS;
    private String nombre, pagina;
    private static Cte.Tipo tipo;
    protected Cte.Act act;

    //VER QUE ONDA CON ESTO QUE ES POSIBLE
    {
        tipo = Cte.Tipo.SERVICIO;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idS='" + idS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pagina='" + pagina + '\'' +
                '}';
    }


    /**
     * Eliminar
     * @param idS
     */
    public Servicio(int idS) {
        this.idS = idS;
        act = Cte.Act.ELIMINAR;
    }

    /**
     * Para pagos, no se usa solo
     * @param idS
     * @param nombre
     */
    public Servicio(int idS, String nombre) {
        this.idS = idS;
        this.nombre = nombre;
    }

    /**
     * Crear
     * @param nombre
     * @param pagina
     */
    public Servicio(String nombre, String pagina) {
        this.nombre = nombre;
        this.pagina = pagina;
        act = Cte.Act.CREAR;
    }

    /**
     * Modificar
     * @param idS
     * @param nombre
     * @param pagina
     */
    public Servicio(int idS, String nombre, String pagina) {
        this.idS = idS;
        this.nombre = nombre;
        this.pagina = pagina;
        act = Cte.Act.MODIFICAR;
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

    @Override
    public Cte.Tipo getTipo() {
        return tipo;
    }

    @Override
    public Cte.Act getActividad() {
        return act;
    }

    public static class Pago extends Servicio{

        private int idP;
        private LocalDate fecha;
        private double costo;

        {
            tipo = Cte.Tipo.PAGO;
        }


        /**
         * Eliminar
         * @param idS
         * @param idP
         */
        public Pago(int idS, int idP) {
            super(idS);
            this.idP = idP;
            act = Cte.Act.ELIMINAR;
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
            act = Cte.Act.CREAR;
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
            act = Cte.Act.MODIFICAR;
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
