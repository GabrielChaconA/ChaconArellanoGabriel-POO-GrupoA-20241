package Tarea6Unidad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto producto = new Producto("Juan", 2, 3);
        System.out.println(producto.getNombre());
        producto.setNombre("pepe");
        producto.setStock(5);
        producto.setprecio(4503.12);
        System.out.println("Tu stok es de: " + producto.getStock());

        boolean flag = true;
        while (flag) {
            System.out.println("INDIQUE REDUCCION");
            int reduccion = sc.nextInt();
            if (reduccion <= producto.getStock() && reduccion > 0) {
                System.out.println("Tu stock es de:" + producto.reducirStock(reduccion));

                flag = false;
            } else {
                System.out.println("NUMERO NO VALIDO");
            }

        }
        flag = true;
        while (flag) {
            System.out.println("INDIQUE AUMENTO");
            int aumento = sc.nextInt();
            if (aumento < 0) {
                System.out.println("No numeros menores a  cero");
            } else {
                System.out.println("Tu stock es de:" + producto.aumentarStock(aumento));
                flag = false;

            }

        }

        System.out.println("------------------------------------------------------");
        Producto producto2 = new Producto("Pedro", 3);
        System.out.println(producto2.getNombre());
        producto2.setprecio(20800);
        System.out.println("Su stock es de :"+producto2.getprecio());

    }
}