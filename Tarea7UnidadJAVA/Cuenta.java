import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);

    public Cuenta() {

    }

    public int comprobartipoA(int salaryaccount) {
        if (salaryaccount > 50000) {
            salaryaccount = 0;
            System.out.println("you exceeded the limit of your account type ");
        }

        return salaryaccount;
    }

    public int comprobartipoB(int salaryaccount) {
        if (salaryaccount > 100000) {

            System.out.println("you exceeded the limit of your account type ");
            System.out.println("Amount to add");
            while (true) {
                salaryaccount = sc.nextInt();
                if (salaryaccount < 100000) {
                    break;
                }
            }
        }

        return salaryaccount;
    }

    public int comprobartipoC(int salaryaccount) {

        return salaryaccount;
    }

}
