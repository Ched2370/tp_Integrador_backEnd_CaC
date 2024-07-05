package com.libreria.entidades;

public class Venta {
  private int id_venta;
  private Cliente cliente;
  private Libro libro;
  
  public Venta(int id_venta, Cliente cliente, Libro libro) {
    this.id_venta = id_venta;
    this.cliente = cliente;
    this.libro = libro;
  }

  public int getId_venta() {
    return id_venta;
  }

  public void setId_venta(int id_venta) {
    this.id_venta = id_venta;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Libro getLibro() {
    return libro;
  }

  public void setLibro(Libro libro) {
    this.libro = libro;
  }

  
}
