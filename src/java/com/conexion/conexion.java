/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class conexion {
    private static final String url = "jdbc:mysql://186.117.156.180:3306/tutoweb";
    private static final String usuario = "root";
    private static final String clave = "jsp+jsf";
    private static transient Connection connection = null;

    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, usuario, clave);
        return connection;
    }
    
}
