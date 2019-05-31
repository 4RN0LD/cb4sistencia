package com.arnoldnorabuena.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consulta {

    private Connection conexion;
    private ResultSet Result;
    private PreparedStatement Query;
    private List<Object> rows = new ArrayList<>();
    private String[] Cavecera;

    public Consulta() {
        try {
            conexion = Conexion.getInstanceConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getConsulta(String... Parameters) throws SQLException {
        rows.clear();
        Query = conexion.prepareStatement(Parameters[0]);
        for (int i = 1; i < Parameters.length; i++) {
            Query.setString(i, Parameters[i]);
        }
        Result = Query.executeQuery();
        int columnas = Result.getMetaData().getColumnCount();
        Cavecera = new String[columnas];
        for (int i = 0; i < columnas; i++) {
            Cavecera[i] = Result.getMetaData().getColumnLabel(i + 1);
        }
        String[] datos = new String[columnas];
        while (Result.next()) {
            for (int i = 0; i < columnas; i++) {
                datos[i] = Result.getString(i + 1);
            }
            rows.add(datos);
        }
        Result.close();
        Query.close();
        return rows;
    }

    public Boolean ejecutaQuery(String... Paramentros) {
        try {
            Query = conexion.prepareStatement(Paramentros[0]);
            for (int i = 1; i < Paramentros.length; i++) {
                Query.setString(i, Paramentros[i]);
            }
            Query.executeUpdate();
            Query.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String[] getCavecera() {
        return Cavecera;
    }
}
