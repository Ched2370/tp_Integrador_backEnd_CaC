package com.libreria.entidades;

public class Libro {
  private int id_libro;
  private String titulo;
  private float precio;
  private Autor autor;
  
  public Libro(String titulo, float precio, Autor autor) {
    this.titulo = titulo;
    this.precio = precio;
    this.autor = autor;
  }

  public Libro(int id_libro, String titulo, float precio, Autor autor) {
    this.id_libro = id_libro;
    this.titulo = titulo;
    this.precio = precio;
    this.autor = autor;
  }

  public int getId_libro() {
    return id_libro;
  }

  public void setId_libro(int id_libro) {
    this.id_libro = id_libro;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public Autor getAutor() {
    return autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

}
