package com.example.pruebainterfacesgrafica.mecanica.base;
import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;

import java.sql.*;

import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.tablaPagoCreacion;
import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.tablaServicioCreacion;


/**
 * Tiene que ver con la conexion a la base de datos. En principio, los elementos de conexion e interacción deberían ser únicos.
 * lo que cambia es hacia que tabla llevaré la información.
 */
public class Base {

    private String url, user, pass;
    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;
    private String cabCrear, cabMod, cabEl;
    private static Informacion info;

    public ResultSet getRs() {
        return this.rs;
    }

    public Base() {
        url = "jdbc:mysql://localhost:3306/pruebajava?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        user = "root";
        pass = "admin";
        generarUnicaConexion();
        verificarExistenciaTablas();
    }

    private void generarUnicaConexion(){
        try {
            con = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Esta actividad esta media al pedo debido a que el comando SQL tiene un If por lo tanto nunca va tirar una excepción
    private void verificarExistenciaTablas(){

        try {
            st = con.prepareStatement(tablaServicioCreacion);
            st.executeUpdate();
        } catch (SQLException throwables) {
            System.out.println("TABLA SERVICIO EXISTENTE");;
        }

        try {
            st = con.prepareStatement(tablaPagoCreacion);
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void cerrarTodo() {

        try {
            con.close();
            st.close();
            if (rs != null){
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class ServicioBase implements ManipuladorDeBases{

        @Override
        public void ejecutarCrear() {

        }

        @Override
        public void ejecutarModificar() {

        }

        @Override
        public void ejecutarEliminar() {

        }
    }
    private class PagoBase implements ManipuladorDeBases{

        @Override
        public void ejecutarCrear() {

        }

        @Override
        public void ejecutarModificar() {

        }

        @Override
        public void ejecutarEliminar() {

        }
    }



}
