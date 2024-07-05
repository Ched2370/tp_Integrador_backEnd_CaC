package com.libreria.entidades;

public class Autor {
  private int id_autor;
  private String nombre_au, apellido_au;
  
  public Autor(String nombre_au, String apellido_au) {
    this.nombre_au = nombre_au;
    this.apellido_au = apellido_au;
  }

  public Autor(int id_autor, String nombre_au, String apellido_au) {
    this.id_autor = id_autor;
    this.nombre_au = nombre_au;
    this.apellido_au = apellido_au;
  }

  public int getId_autor() {
    return id_autor;
  }

  public void setId_autor(int id_autor) {
    this.id_autor = id_autor;
  }

  public String getNombre_au() {
    return nombre_au;
  }

  public void setNombre_au(String nombre_au) {
    this.nombre_au = nombre_au;
  }

  public String getApellido_au() {
    return apellido_au;
  }

  public void setApellido_au(String apellido_au) {
    this.apellido_au = apellido_au;
  }

}
