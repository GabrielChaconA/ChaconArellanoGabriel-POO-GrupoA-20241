import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario(null, null, null, null);
        Banco banco = new Banco(null, 0);
        Cuenta cuenta = new Cuenta();
        String name, lastname, code, addaccount, type, action;
        int salaryaccount;
        boolean flag = true, flag2 = false;
        List<Usuario> lista = new ArrayList<Usuario>();

        while (flag) {
            System.out.println();
            System.out.println("-----------------MENU----------------");
            System.out.println(
                    "-adduser(1) \n-specificaccount(2) \n-allaccounts(3) \n-allusers(4) \n-Specificuser (5)\n-add(money to an account)(6) \n-withdraw(money to account)(7)\n-n to end):");
            action = sc.nextLine();
            if (flag2 == false && !action.equals("1")) {
                System.out.println("WARNING: EVERYTHING IS EMPTY, CHOOSE ADDUSER FIRST");

            } else {

                switch (action.toLowerCase()) {
                    case "1":
                        flag2 = true;
                        while (true) {

                            System.out.println("-----------Add user (y/n):----------- ");
                            String add = sc.nextLine();
                            if (add.contains("y")) {

                                List<Banco> useraccounts = new ArrayList<Banco>();
                                // Agergar datos principales
                                System.out.println("----------------------------------");
                                System.out.println("Writte your name:  ");
                                name = sc.nextLine();
                                System.out.println("Writte your lastname: ");
                                lastname = sc.nextLine();
                                System.out.println("Introduce yourt code:  ");
                                code = sc.nextLine();
                                // llenar arreglo de cuentas
                                while (true) {
                                    System.out.println("add account (y/n): ");

                                    addaccount = sc.nextLine();
                                    if (addaccount.contains("y")) {
                                        System.out.println("Introduce your type account(A,B,C): ");
                                        type = sc.nextLine();
                                        System.out
                                                .println( "Enter the payroll account(dont exceses your sakary top): ");

                                        salaryaccount = sc.nextInt();
                                        sc.nextLine();

                                        if (type.equals("A")) {
                                            useraccounts.add(new Banco(type, cuenta.comprobartipoA(salaryaccount)));
                                        }
                                        if (type.equals("B")) {
                                            useraccounts.add(new Banco(type, cuenta.comprobartipoB(salaryaccount)));
                                        }
                                        if (type.equals("C")) {

                                            useraccounts.add(new Banco(type, cuenta.comprobartipoC(salaryaccount)));
                                        }

                                        banco.mostrar(useraccounts);

                                    } else {
                                        break;
                                    }

                                }

                                lista.add(new Usuario(name, lastname, code, useraccounts));
                                banco.lista(lista);

                                flag = true;
                            } else {

                                break;
                            }

                        }

                        break;
                    case "2":
                        System.out.println("SPECIFI USER (1-n..)");
                        int specificUser = sc.nextInt();
                        System.out.println("SPECIFI ACCOUNT(1-n..)");
                        int specificAccount = sc.nextInt();
                        banco.ShowUser(specificAccount, specificUser);

                        break;
                    case "3":
                        banco.getShowAccounts();
                        break;

                    case "4":
                        usuario.ShowUsers(lista);
                        break;
                    case "5":
                        System.out.println("SPECIFI USER (0-n..)");
                        specificUser = sc.nextInt();

                        usuario.SpecificUsers(specificUser, lista);
                        break;

                    case "6":
                        System.out.println("SPECIFI USER (0-n..)");
                        specificUser = sc.nextInt();
                        System.out.println("SPECIFI ACCOUNT(0-n..)");
                        specificAccount = sc.nextInt();
                        System.out.println("Amount to Add");
                        int add = sc.nextInt();
                        sc.nextLine();
                        System.out.println("New amount ");

                        if (banco.comprobar(lista, specificAccount, specificUser).equals("A")) {
                            banco.addA(lista, specificAccount, specificUser, add);
                        }
                        if (banco.comprobar(lista, specificAccount, specificUser).equals("B")) {
                            banco.addB(lista, specificAccount, specificUser, add);
                        }
                        if (banco.comprobar(lista, specificAccount, specificUser).equals("C")) {
                            banco.addC(lista, specificAccount, specificUser, add);
                        }

                        break;

                    case "7":
                        System.out.println("SPECIFIC USER (0-n..)");
                        specificUser = sc.nextInt();
                        System.out.println("SPECIFIC ACCOUNT(0-n..)");
                        specificAccount = sc.nextInt();
                        System.out.println("Amount to remove");
                        int withdraw = sc.nextInt();
                        sc.nextLine();
                        System.out.println("New amount ");

                        if (banco.comprobar(lista, specificAccount, specificUser).equals("A")) {
                            banco.addA(lista, specificAccount, specificUser, withdraw);
                        }
                        if (banco.comprobar(lista, specificAccount, specificUser).equals("B")) {
                            banco.withdrawB(lista, specificAccount, specificUser, withdraw);
                        }
                        if (banco.comprobar(lista, specificAccount, specificUser).equals("C")) {
                            banco.withdrawC(lista, specificAccount, specificUser, withdraw);
                        }
                        break;
                    case "n":
                        flag = false;
                        break;

                    default:
                        break;
                }

            }

        }
        sc.close();

    }
}
