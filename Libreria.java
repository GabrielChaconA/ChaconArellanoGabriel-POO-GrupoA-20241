import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Opciones de Rentar o regresar
        Usuarios usuarios = new Usuarios(null, 0);
        Libros libros = new Libros(null, 0, false);
        boolean flag = true;
        libros.libreriapre();
        System.out.println("------------------- WELCOME TO MENU--------------------------");
        while (flag) {

            System.out.println(
                    "(1)ADD USER\n(2)SHOW BOOKLIST  \n(3)SHOW USERLIST \n(4)SHOW AVAILABLE BOOK\n(5)SHOW NO  AVAILABLE BOOK \n(6)SHOW USERS THAT RENTED A BOOK \n(7)RENT A BOOK \n(8)ADD BOOK \n(9)BOOKS NO RENTED \n(10)BOOKS RENTED\n(n)END CODE  ");
            String action = sc.nextLine();

            switch (action) {
                case "1":
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("ADD USER(y/n):");
                        String answ = sc.nextLine();

                        if (answ.contains("y")) {
                            usuarios.createuserList(usuarios.registeUsers());
                        } else {
                            flag1 = false;
                        }

                    }
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "2":
                    libros.showbookList();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "3":
                    usuarios.showuserList();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "4":

                    libros.showbookListAvailable();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "5":
                    libros.showbookListNOT();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "6":
                    usuarios.userList_Rent();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "7":
                    System.out.println("NUMER OF THE BOOK: ");
                    int numerbook = sc.nextInt();
                    sc.nextLine();
                    System.out.println("NUMBER USER: ");
                    int numeruser = sc.nextInt();
                    sc.nextLine();

                    libros.rentbook(numerbook, numeruser, usuarios.getUsuarios());
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "8":
                    libros.addbook();
                    System.out.println("----------------------------------------------------------------");
                    break;
                case "10":
                    libros.rented();
                    System.out.println("----------------------------------------------------------------");
                    break;

                case "9":
                    libros.noRente();
                    System.out.println("----------------------------------------------------------------");
                    break;

                case "n":
                    flag = false;
                    break;

                default:
                    break;
            }

        }

    }

}
