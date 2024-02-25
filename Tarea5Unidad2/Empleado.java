package Tarea5Unidad2;

import java.util.Scanner;;

public class Empleado {
    Scanner sc = new Scanner(System.in);

    public Empleado(int sueldoBase, int bonificación, int horasextras) {

    }

    public int calcularSalario(int sueldoBase) {
        return sueldoBase;
    }

    public int calcularSalario(int bonificación, int sueldoBase) {
        return (sueldoBase + bonificación);

    }

    public int calcularSalario(int sueldoBase, int bonificación, int horasextras) {
        System.out.println("Dime tus horas laborales");
        int h = sc.nextInt();
        return (sueldoBase + bonificación + (horasextras * h));
    }

}
