package com.libreria;

import com.libreria.conexion.Conexion;
import com.libreria.conexion.CreateDBnTables;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int opc;
    System.out.println("        *****BIENVENIDO******");

    try {
      // Establecemos conexion
      System.out.println("\n--------------------------");
      System.out.println("Establesca su conexion");
      System.out.print("Ingrese su usuario: ");
      String user = scan.nextLine();
      System.out.print("Ingrese su contraseña: ");
      String pass = scan.nextLine();
      System.out.print("Ingrese el puerto(ej:3306): ");
      String port = scan.nextLine();
      System.out.println("");

      Conexion conexion = Conexion.getInstance(user, pass, port);
      Connection con = conexion.getConnection();

      if (con != null) {
        System.out.println("Conexión a la base de datos establecida.");
      } else {
        System.out.println(
            "No se pudo establecer la conexión.\nRecuerde habilitar el servidor. \nRevise su usuario y contraseña.\nControle que el puerto de conexion sea el indicado.\nCerrando programa...");
        System.exit(0);
      }
      System.out.println("--------------------------");
      do {
        System.out.println("Seleccione una opción: ");
        System.out.println("1) Crear base de datos y sus tablas.");
        System.out.println("2) Cargar libro.");
        System.out.println("3) Cargar venta.");
        System.out.println("4) Mostrar lista de libros.");
        System.out.println("5) Mostrar lista de ventas.");
        System.out.println("6) Modificar libro.");
        System.out.println("7) Modificar Venta.");
        System.out.println("8) Cancelar libro.");
        System.out.println("9) Cancelar Venta.");
        System.out.println("0) Salir");
        System.out.print("Opción: ");

        opc = scan.nextInt();
        scan.nextLine();

        switch (opc) {
          case 1:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 1***");
            CreateDBnTables createBD = new CreateDBnTables();
            Conexion conexionExistente = Conexion.getInstance(null, null, null);
            createBD.crearDB(conexionExistente);
            System.out.println("--------------------------");
            break;
          case 2:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 2***");
            System.out.println("--------------------------");
            break;
          case 3:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 3***");
            System.out.println("--------------------------");
            break;
          case 4:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 4***");
            System.out.println("--------------------------");
            break;
          case 5:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 5***");
            System.out.println("--------------------------");
            break;
          case 6:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 6***");
            System.out.println("--------------------------");
            break;
          case 7:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 7***");
            System.out.println("--------------------------");
            break;
          case 8:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 8***");
            System.out.println("--------------------------");
            break;
          case 9:
            System.out.println("\n--------------------------");
            System.out.println("***Opción 9***");
            System.out.println("--------------------------");
            break;
          case 0:
            System.out.println("\n--------------------------");
            System.out.println("Saliendo...");
            System.out.println("--------------------------");
            break;
          default:
            System.out.println("\n--------------------------");
            System.out.println("Opción no válida");
            System.out.println("--------------------------");
            break;
        }

      } while (opc != 0);
    } catch (InputMismatchException e) {
      System.out.println("Error: Has ingresado una opción inválida, cerrando programa.");
    } finally {
      scan.close();
      System.out.println("*****Gracias por usar esta aplicación*****\n******Lo esperamos nuevamente.******");
    }
  }
}
