package com.libreria.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBnTables {

  public void crearDB(Conexion conexion) {
    Connection conn = conexion.getConnection();

    if (conn != null) {
      try {
        // Base de datos libreria
        String sqlCrearBD = "CREATE DATABASE IF NOT EXISTS libreria";
        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlCrearBD);
          System.out.println("Base de datos creada correctamente");
        } catch (SQLException e) {
          e.printStackTrace();
        }

        String sqlUsarBD = "USE libreria";
        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlUsarBD);
          System.out.println("Usando la base de datos");
        } catch (SQLException e) {
          e.printStackTrace();
        }

        // tabla libros
        String sqlCrearTablaLibros = "CREATE TABLE IF NOT EXISTS libros (" +
            "id_libro INT AUTO_INCREMENT PRIMARY KEY," +
            "titulo VARCHAR(255) NOT NULL," +
            "id_autor INT NOT NULL," +
            "precio FLOAT(10,2)," +
            "FOREIGN KEY (id_autor) REFERENCES autores(id_autor) ON DELETE CASCADE)";

        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlCrearTablaLibros);
          System.out.println("Tabla 'libros' activa.");
        } catch (SQLException e) {
          e.printStackTrace();
        }

        // Tabla autores
        String sqlCrearTablaAutor = "CREATE TABLE IF NOT EXISTS autores (" +
            "id_autor INT AUTO_INCREMENT PRIMARY KEY," +
            "nombre_au VARCHAR(100) NOT NULL," +
            "apellido_au VARCHAR(100) NOT NULL)";

        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlCrearTablaAutor);
          System.out.println("Tabla 'Autores' activa.");
        } catch (SQLException e) {
          e.printStackTrace();
        }

        // Tabla clientes
        String sqlCrearTablaCliente = "CREATE TABLE IF NOT EXISTS clientes (" +
            "id_cliente INT AUTO_INCREMENT PRIMARY KEY," +
            "nombre_cli VARCHAR(100) NOT NULL," +
            "apellido_cli VARCHAR(100) NOT NULL)";

        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlCrearTablaCliente);
          System.out.println("Tabla 'Clientes' activa.");
        } catch (SQLException e) {
          e.printStackTrace();
        }

        // Tabla ventas
        String sqlCrearTablaVenta = "CREATE TABLE IF NOT EXISTS ventas (" +
            "id_venta INT AUTO_INCREMENT PRIMARY KEY," +
            "id_cliente INT NOT NULL," +
            "id_libro INT NOT NULL," +
            "FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE," +
            "FOREIGN KEY (id_libro) REFERENCES libros(id_libro) ON DELETE CASCADE)";

        try (Statement stmt = conn.createStatement()) {
          stmt.executeUpdate(sqlCrearTablaVenta);
          System.out.println("Tabla 'Ventas' activa.");
        } catch (SQLException e) {
          e.printStackTrace();
        }

      } finally {
        System.out.println("Carga de databse completa.");
      }
    } else {
      System.out.println("No se pudo obtener la conexión a la base de datos.");
    }
  }
}
