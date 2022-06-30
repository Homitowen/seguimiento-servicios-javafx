package com.example.pruebainterfacesgrafica.mecanica.base;
import com.example.pruebainterfacesgrafica.mecanica.dato.Informacion;
import com.example.pruebainterfacesgrafica.mecanica.dato.Servicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.ArrayList;

import static com.example.pruebainterfacesgrafica.mecanica.constantes.Cte.*;


/**
 * Tiene que ver con la conexion a la base de datos. En principio, los elementos de conexion e interacción deberían ser únicos.
 * lo que cambia es hacia que tabla llevaré la información.
 */
public class Base {

    private String url, user, pass;
    private static Connection con;
    private static PreparedStatement st;
    private static ResultSet rs;
    private String cabCrear, cabMod, cabEl;
    private static Informacion infoRecibida;
    private ManipuladorDeBases baseElegida;
    private static ArrayList<Informacion> conjuntoParaEnviar;


    public ManipuladorDeBases getBaseElegida() {
        return this.baseElegida;
    }

    public ResultSet getRs() {
        return this.rs;
    }

    public static void setInfoRecibida(Informacion infoRecibida) {
        Base.infoRecibida = infoRecibida;
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

    public void comenzarProcesoInformacion(){
        baseElegida = ManipuladorDeBases.identificarElegirTipo(infoRecibida);
        ManipuladorDeBases.identificarElegirActividad(infoRecibida, baseElegida);
    }

    public void forzarObtencionServicios() {
        infoRecibida = new Servicio();
        comenzarProcesoInformacion();


    }


    public static class ServicioBase implements ManipuladorDeBases{

        @Override
        public void ejecutarCrear() {
            try {
                st = con.prepareStatement(SQL_INSERT_S);
                st.setString(1, infoRecibida.getNombre());
                st.setString(2, infoRecibida.getPagina());
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarModificar() {
            try {
                st = con.prepareStatement(SQL_UPDATE_S);
                st.setString(1,infoRecibida.getNombre());
                st.setString(2,infoRecibida.getPagina());
                st.setString(3, String.valueOf(infoRecibida.getIdS()));
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarEliminar() {
            try {
                st = con.prepareStatement(SQL_DELETE_S);
                st.setString(1, String.valueOf(infoRecibida.getIdS()));
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarVer() {
            try {
                st = con.prepareStatement(SQL_SELECT_S);
                rs = st.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public ObservableList<Informacion> devolverResultado() {




            try {
                conjuntoParaEnviar = new ArrayList<Informacion>();
                while (rs.next()){
                    conjuntoParaEnviar.add(new Servicio(
                            rs.getInt(tablaServicioId),
                            rs.getString(tablaServicioNombre),
                            rs.getString(tablaServicioPagina)
                    ));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return FXCollections.observableList(conjuntoParaEnviar);
        }
    }
    public static class PagoBase implements ManipuladorDeBases{

        @Override
        public void ejecutarCrear() {
            try {
                st = con.prepareStatement(SQL_INSERT_P);
                st.setString(1, String.valueOf(infoRecibida.getFecha()));
                st.setString(2, String.valueOf(infoRecibida.getCosto()));
                st.setString(3, String.valueOf(infoRecibida.getIdS()));
                st.setString(4, infoRecibida.getNombre());
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarModificar() {
            try {
                st = con.prepareStatement(SQL_UPDATE_P);
                st.setString(1, String.valueOf(infoRecibida.getFecha()));
                st.setString(2, String.valueOf(infoRecibida.getCosto()));
                st.setString(3, String.valueOf(infoRecibida.getIdP()));
                st.setString(4, String.valueOf(infoRecibida.getIdS()));
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarEliminar() {
            try {
                st = con.prepareStatement(SQL_DELETE_P);
                st.setString(1, String.valueOf(infoRecibida.getIdP()));
                st.setString(2, String.valueOf(infoRecibida.getIdS()));
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ejecutarVer() {

        }

        @Override
        public ObservableList<Informacion> devolverResultado() {
            return null;
        }
    }



}
