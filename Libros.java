import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libros {
    Usuarios usuarios = new Usuarios(null, 0);
    String nombre;
    int number;
    boolean rented = false;
    List<Libros> Libreria = new ArrayList<Libros>();
    Scanner sc = new Scanner(System.in);

    public Libros(String nombre, int number, boolean rented) {
        this.rented = rented;
        this.nombre = nombre;
        this.number = number;

    }

    public void libreriapre() {
        Libreria.add(new Libros("Harry Potter", 7, rented));
        Libreria.add(new Libros("Cronicas de Narnia", 6, rented));
        Libreria.add(new Libros("Maze Runner", 2, rented));
        Libreria.add(new Libros("La teoria del todo", 0, rented));
    }

    // Agergar libro
    public void addbook() {

        while (true) {
            System.out.println("-ADD BOOK(y/n)");
            String aswer = sc.nextLine();
            if (aswer.contains("y")) {
                System.out.println("NAME OF THE BOOK: ");
                String nombre3 = sc.nextLine();
                System.out.println("NUMBER OF BOOKS TO ADD: ");
                int number2 = sc.nextInt();
                sc.nextLine();

                if (vefify(nombre3)) {
                    Libreria.add(new Libros(nombre3, number2, rented));
                } else {
                    addexixstingbook(nombre3, number2);
                }

            } else {
                break;
            }
        }

    }

    // Verificar Libro
    public boolean vefify(String nombre) {
        boolean flag = true;
        for (int i = 0; i < Libreria.size(); i++) {
            if (nombre.equals(Libreria.get(i).nombre)) {
                flag = false;
            }
        }
        return flag;
    }

    // Agregar Libro
    public void addexixstingbook(String nombre, int number2) {

        for (int i = 0; i < Libreria.size(); i++) {
            if (nombre.equals(Libreria.get(i).nombre)) {
                Libreria.get(i).number = Libreria.get(i).number + number2;
            }
        }

    }

    // libro rentado
    public void rentbook(int booknumer, int numerUser, List<Usuarios> usuarios) {

        if (Libreria.get(booknumer).number == 0) {
            System.out.println("NO AVAILABLE BOOKS");
        } else {
            Libreria.get(booknumer).number = Libreria.get(booknumer).number - 1;
            usuarios.get(numerUser).books = usuarios.get(numerUser).books + 1;
            Libreria.get(booknumer).rented = true;
        }

    }

    // Mostrar libros TODOS
    public void showbookList() {
        ;
        for (int i = 0; i < Libreria.size(); i++) {
            System.out.println(
                    String.format("(%d)Book: %s Amount: %d ", i, Libreria.get(i).nombre, Libreria.get(i).number));
        }

    }

    // Mostrar libros DIPONIBLES
    public void showbookListAvailable() {
        for (int i = 0; i < Libreria.size(); i++) {
            if (Libreria.get(i).number > 0) {
                System.out
                        .println(String.format("(%d )Book: %s Amount: %d ", i, Libreria.get(i).nombre,
                                Libreria.get(i).number));
            }
        }
    }

    // Mostrar libros NO DISPONIBLES
    public void showbookListNOT() {
        for (int i = 0; i < Libreria.size(); i++) {
            if (Libreria.get(i).number == 0) {
                System.out
                        .println(String.format("Book: %s Amount: %d ", Libreria.get(i).nombre, Libreria.get(i).number));
            }
        }

    }

    public void rented() {
        for (int i = 0; i < Libreria.size(); i++) {
            if (Libreria.get(i).rented) {
                System.out
                        .println(String.format("Book: %s Amount: %d ", Libreria.get(i).nombre, Libreria.get(i).number));
            }

        }

    }

    public void noRente() {
        for (int i = 0; i < Libreria.size(); i++) {
            if (!Libreria.get(i).rented) {
                System.out
                        .println(String.format("Book: %s Amount: %d ", Libreria.get(i).nombre, Libreria.get(i).number));
            }

        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumber() {
        return number;
    }

}