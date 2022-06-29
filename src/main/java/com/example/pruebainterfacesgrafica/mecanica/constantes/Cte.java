package com.example.pruebainterfacesgrafica.mecanica.constantes;

public class  Cte {
    public enum Tipo{
        SERVICIO, PAGO;
    }
    public enum Act{
        CREAR, MODIFICAR, ELIMINAR, VER;
    }
    public static final String tipoS = "servicio";
    public static final String tipoP = "pago";
    public static final String crear = "c";
    public static final String modificiar = "m";
    public static final String eliminar = "e";
    public static final String ver = "v";

    //para las bases
        //creacion de tablas
                //Servicio
    public static final String tablaServicio = "servicio";
    public static final String tablaServicioId = "id_s";
    public static final String tablaServicioNombre = "nombre";
    public static final String tablaServicioPagina = "pagina";
    public static final String tablaServicioCreacion = "CREATE TABLE IF NOT EXISTS "+tablaServicio+ "" +
            "("+tablaServicioId+" INT NOT NULL AUTO_INCREMENT," +
            ""+tablaServicioNombre+" VARCHAR(30) NOT NULL," +
            ""+tablaServicioPagina+" VARCHAR(60) NOT NULL," +
            "PRIMARY KEY("+tablaServicioId+"))";
                //Pago
    public static final String tablaPago = "pago";
    public static final String tablaPagoId = "id_p";
    public static final String tablaPagoFecha = "fecha";
    public static final String tablaPagoCosto = "costo";
    public static final String tablaPagoCreacion = "CREATE TABLE IF NOT EXISTS "+tablaPago+ "" +
            "("+tablaPagoId+" INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
            ""+tablaPagoFecha+" VARCHAR(30) NOT NULL," +
            ""+tablaPagoCosto+" VARCHAR(60) NOT NULL," +
            ""+tablaServicioId+" INT NOT NULL," +
            "FOREIGN KEY("+tablaServicioId+")" +
            "REFERENCES "+tablaServicio+" ("+tablaServicioId+") ON DELETE CASCADE)";
        //comandos SQL
                //Servicio
    public static final String SQL_SELECT_S = "SELECT * FROM " + tablaServicio;
    public static final String SQL_INSERT_S = "INSERT INTO "+ tablaServicio +"("+ tablaServicioNombre +","+tablaServicioPagina+") VALUES (?, ?)";
    public static final String SQL_UPDATE_S = "UPDATE "+ tablaServicio +" SET "+tablaServicioNombre+" = ?, "+tablaServicioPagina+" = ? WHERE "+tablaServicioId+" = ?";
    public static final String SQL_DELETE_S = "DELETE FROM "+ tablaServicio +" WHERE "+tablaServicioId+" = ?";
                //Pago
    public static final String SQL_SELECT_P = "SELECT * FROM " + tablaPago + " WHERE "+tablaServicioId+" = ?";
    public static final String SQL_INSERT_P = "INSERT INTO "+ tablaPago +" SET "+tablaPagoFecha+" = ?, "+tablaPagoCosto+" = ?, "+tablaServicioId+" = ?";
    public static final String SQL_UPDATE_P = "UPDATE "+ tablaPago +" SET  "+tablaPagoFecha+" = ?, "+tablaPagoCosto+" = ?  WHERE "+tablaPagoId+" = ? AND "+tablaServicioId+" = ?";
    public static final String SQL_DELETE_P = "DELETE FROM "+ tablaPago +" WHERE "+tablaPagoId+" = ? AND "+tablaServicioId+" = ?";







}
