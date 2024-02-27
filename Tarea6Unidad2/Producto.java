package Tarea6Unidad2;

import java.util.Scanner;

public class Producto {
    Scanner sc = new Scanner(System.in);
    private String nombre = "Juan";
    private double precio = 0.0;
    private int stock = 0;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int aumentarStock(int aumento) {
        stock = stock + aumento;

        return stock;

    }

    public int reducirStock(int reduccion) {
        stock = stock - reduccion;

        return stock;

    }

}
