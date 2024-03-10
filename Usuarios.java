import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {

    Scanner sc = new Scanner(System.in);
    String nombre;
    int books = 0;

    public Usuarios(String nombre, int books) {
        this.nombre = nombre;

    }

    // Regristrar usuario
    public String registeUsers() {
        System.out.println("Name: ");
        nombre = sc.nextLine();
        return nombre;

    }

    // Crear Lista usuarios
    public void createuserList(String nombre) {
        usuarios.add(new Usuarios(nombre, books));

    }

    // Mostrar lista de usuarios
    public void showuserList() {
        System.out.println("-User list");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("-" + usuarios.get(i).nombre);

        }
    }

    // Listar usuarios que rentaron libro
    public void userList_Rent() {
        System.out.println("-User list(Rent)");
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).books > 0) {
                System.out.println("-" + usuarios.get(i).nombre);

            }

        }
    }

    public String getNombre() {
        return nombre;
    }

    List<Usuarios> usuarios = new ArrayList<Usuarios>();

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

}
