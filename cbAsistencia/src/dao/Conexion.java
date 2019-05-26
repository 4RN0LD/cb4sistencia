/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arnold Alfredo Norabuena Aranda
 * @version 1.0
 */
public class Conexion {

    protected final String dataBase = "web";
    protected final String port = "3306";
    protected final String host = "localhost";
    protected final String usuario = "root";
    protected final String password = "mysql";
    public static Connection connection;
    protected final String cadenaConexion;
    private static Conexion conexion;

    private Conexion() throws ClassNotFoundException, SQLException {
        this.cadenaConexion = "jdbc:mysql://" + host + ":" + port + "/" + dataBase;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(cadenaConexion, usuario, password);
    }
    
    public static Connection getInstanceConnection() throws ClassNotFoundException, SQLException{
        if (conexion == null) {
            conexion = new Conexion();
        }
        return connection;
    }
}
