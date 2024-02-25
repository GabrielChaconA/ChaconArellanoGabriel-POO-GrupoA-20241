package Tarea5Unidad2;

import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        String elegir;
        while (continuar) {

            System.out.println("ELEGIR CLASE ");
            System.out.println("RECTANGULO---------EMPLEADO---------CALCULADORA ");

            String eleccion = sc.nextLine();
            eleccion = eleccion.toUpperCase();
            switch (eleccion) {
                case "RECTANGULO":
                    // Rectangulo
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Area: " + rectangulo.area() + " Perimetro : " + rectangulo.Perimetro());
                    System.out.println("Desea elegir otra clase? SI/NO");
                    elegir = sc.nextLine();
                    elegir = elegir.toLowerCase();
                    if (elegir.contains("n")) {
                        continuar = false;
                    }

                    break;
                case "EMPLEADO":
                    // Empleado
                    int sueldoBase = 500, bonificación = 209, horasextras = 20;
                    Empleado empleado = new Empleado(sueldoBase, bonificación, horasextras);
                    System.out.println("Que desea saber?");
                    System.out.println(
                            "SUELDO------------SUELDOyBONIFICACION------------SUELDO,BONIFICACIONyHORASEXTRAS--------");
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Escriba 1 , 2 ,3");
                        String desicion = sc.nextLine();
                        if (desicion.equals("1")) {
                            System.out.println("Su sueldo es de : " + empleado.calcularSalario(sueldoBase));
                            flag = false;

                        }
                        if (desicion.equals("2")) {
                            System.out.println(
                                    "Su sueldo con bonificacion es : " + empleado.calcularSalario(bonificación));
                            flag = false;
                        }
                        if (desicion.equals("3")) {
                            System.out.println("Sueldo con bonificacion y horas extras: "
                                    + empleado.calcularSalario(sueldoBase, bonificación, horasextras));
                            flag = false;
                        }
                        System.out.println("Desea elegir otra clase? SI/NO");
                        elegir = sc.nextLine();
                        elegir = elegir.toLowerCase();
                        if (elegir.contains("n")) {
                            continuar = false;
                        }

                    }
                    break;
                case "CALCULADORA":
                    // Calculadora
                    System.out.println("Que desea sabes:");
                    System.out.println(
                            "ingresos------------ventas y porcentajeimpuesto------------dividendos, porcentajeimpuesto y exención--------");
                    String desicion = sc.nextLine();
                    int ingreso = 54000;
                    double porcentajeImpuesto = 54.3, dividendos = 34, exencion = 34;
                    Calculadora calculadora = new Calculadora(porcentajeImpuesto, dividendos, exencion, ingreso);
                    if (desicion.equals("ingresos")) {
                        System.out.println("Su ingresos son: " + calculadora.calcularImpuestos(ingreso));
                    }
                    if (desicion.contains("ventas") || desicion.contains("porcentajeimpuestos")) {
                        System.out.println(
                                "Porcentaje de impuesto: "
                                        + calculadora.calcularImpuestos(ingreso, porcentajeImpuesto));
                    }
                    if (desicion.contains("dividendos") || desicion.contains("porcentaje")
                            || desicion.contains("exen")) {
                        System.out.println(
                                "Exenxion: " + calculadora.calcularImpuestos(dividendos, porcentajeImpuesto, exencion));
                    }
                    System.out.println("Desea elegir otra clase? SI/NO");
                    elegir = sc.nextLine();
                    elegir = elegir.toLowerCase();
                    if (elegir.contains("n")) {
                        continuar = false;
                    }

                default:
                    break;
            }

        }

    }
}