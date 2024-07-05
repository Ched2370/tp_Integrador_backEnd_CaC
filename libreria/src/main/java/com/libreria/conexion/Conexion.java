package com.libreria.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Se realiza un patrón Singleton para la conexión a la BD
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Conexion instance;
    private static Connection con = null;
    private static String USER = null;
    private static String PASS = null;
    private static String PORT = null;

    private Conexion(String user, String pass, String port) {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL + port + "/", user, pass);
            System.out.println("Conexión exitosa.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Conexion getInstance(String user, String pass, String port) {
        if (instance == null) {
            synchronized (Conexion.class) {
                if (instance == null) {
                    USER = user;
                    PASS = pass;
                    PORT = port;
                    instance = new Conexion(USER, PASS, PORT);
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }

}
