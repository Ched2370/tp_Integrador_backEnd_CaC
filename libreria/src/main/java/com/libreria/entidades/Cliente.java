package com.libreria.entidades;

public class Cliente {
  private int id_cliente;
  private String nombre_cli, apellido_cli;
  
  public Cliente(String nombre_cli, String apellido_cli) {
    this.nombre_cli = nombre_cli;
    this.apellido_cli = apellido_cli;
  }

  public Cliente(int id_cliente, String nombre_cli, String apellido_cli) {
    this.id_cliente = id_cliente;
    this.nombre_cli = nombre_cli;
    this.apellido_cli = apellido_cli;
  }

  public int getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(int id_cliente) {
    this.id_cliente = id_cliente;
  }

  public String getNombre_cli() {
    return nombre_cli;
  }

  public void setNombre_cli(String nombre_cli) {
    this.nombre_cli = nombre_cli;
  }

  public String getApellido_cli() {
    return apellido_cli;
  }

  public void setApellido_cli(String apellido_cli) {
    this.apellido_cli = apellido_cli;
  }

  
}
