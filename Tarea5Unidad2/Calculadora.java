package Tarea5Unidad2;

import java.util.Scanner;
//Realizar una clase llamada CalculadoraImpuestos que cuente con un método llamado calcularImpuestos.
//Este método puede recibir hasta 4 parámetros, ingresos (int), porcentajeImpuestos (double), dividendos (double) y exención (double).
//Si el usuario manda solo los ingresos, retornar ingresos + 0.15
//Si el usuario manda ventas y porcentajeImpuesto retornar ventas * (porcentajeImpuesto / 100)
//Si el usuario manda dividendos, porcentajeImpuesto y exención.
//Calcular los impuestos = dividendos * (porcentajeImpuesto / 100)
//Si los impuestos son mayores que la exención retornar los impuestos menos la exención, sino retornar 0.

public class Calculadora {
    public Scanner sc = new Scanner(System.in);

    public Calculadora(double porcentajeImpuesto, double dividendos, double exencion, int ingresos) {

    }

    public double calcularImpuestos(int ingreso) {
        return ingreso + 0.15;
    }

    public double calcularImpuestos(int ingreso, double porcentajeImpuesto) {
        System.out.println("Cuatas ventas hubieron: ");
        int ventas = sc.nextInt();
        return ventas * (porcentajeImpuesto / 100);
    }

    public double calcularImpuestos(double dividendos, double porcentajeImpuesto, double exencion) {
        double impuestos = dividendos * (porcentajeImpuesto / 100);

        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0.0;
        }

    }

}
