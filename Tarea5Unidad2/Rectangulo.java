package Tarea5Unidad2;

import java.util.Scanner;

public class Rectangulo {

    Scanner sc = new Scanner(System.in);
    public double ancho, alto;

    public Rectangulo() {
        System.out.println("Dime el ancho");
        ancho = sc.nextDouble();
        System.out.println("Dime el alto");
        alto = sc.nextDouble();

    }

    public double Perimetro() {

        return ancho * alto;

    }

    public double area() {
        return (ancho * alto) / 2;

    }

}
