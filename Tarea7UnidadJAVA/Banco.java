import java.util.List;

public class Banco {
    private String type;
    private int salaryaccount;
    private List<Usuario> lista;
    private List<Banco> useraccount;

    public int getSalaryaccount() {
        return salaryaccount;
    }

    public String getType() {
        return type;
    }

    public Banco(String type, int salaryaccount) {
        this.type = type;
        this.salaryaccount = salaryaccount;

    }

    public void lista(List<Usuario> lista) {
        this.lista = lista;
    }

    public List<Banco> getUseraccount() {
        return useraccount;
    }

    public void mostrar(List<Banco> useraccount) {
        this.useraccount = useraccount;

    }

    public void getShowAccounts() {
        int i = 0, j = 0;
        System.out.println("CUENTAS: ");
        for (i = 0; i < lista.size(); i++) {
            System.out.println("Usuario: " + lista.get(i).name);
            for (j = 0; j < lista.get(i).useraccounts.size(); j++) {
              
                System.out.println("Account: " + lista.get(i).useraccounts.get(j).type);
                System.out.println("Salart: " + lista.get(i).useraccounts.get(j).salaryaccount);
                System.out.println();
            }

        }

    }

    public void ShowUser(int specificAccount, int specificUser) {

        System.out.println("Usuario: " + lista.get(specificUser).name);
        System.out.println("Account: " + lista.get(specificUser).useraccounts.get(specificAccount).type);
        System.out.println("Salart: " + lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount);
        System.out.println();

    }

    public int addA(List<Usuario> lista, int specificAccount, int specificUser, int add) {
        int cuenta = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + add;
        System.out.println(cuenta);
        if (cuenta < 50000) {
            cuenta = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount - add;

        }
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = cuenta;

        return cuenta;
    }

    public int addB(List<Usuario> lista, int specificAccount, int specificUser, int add) {
        int cuenta = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + add;
        System.out.println(cuenta);
        if (cuenta < 100000) {
            cuenta = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount - add;
        }
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = cuenta;
        return cuenta;
    }

    public int addC(List<Usuario> lista, int specificAccount, int specificUser, int add) {
        int cuenta = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + add;
        System.out.println(cuenta);
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = cuenta;

        return cuenta;
    }

    public int withdrawA(List<Usuario> lista, int specificAccount, int specificUser, int withdraw) {
        int retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount - withdraw;
        if (withdraw > 1000) {
            System.out.println("La cantidad a remover debe ser minima de 1000");
            retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + withdraw;
        }
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = retiro;
        return retiro;
    }

    public int withdrawB(List<Usuario> lista, int specificAccount, int specificUser, int withdraw) {
        int retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount - withdraw;
        if (withdraw > 5000) {
            System.out.println("La cantidad a remover debe ser minima de 5000");
            retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + withdraw;
        }
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = retiro;
        return retiro;

    }

    public int withdrawC(List<Usuario> lista, int specificAccount, int specificUser, int withdraw) {

        int retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount - withdraw;

        if (withdraw > 10000) {
            System.out.println("La cantidad a remover debe ser minima de 1000");
            retiro = lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount + withdraw;
        }
        lista.get(specificUser).useraccounts.get(specificAccount).salaryaccount = retiro;
        return retiro;
    }

    public String comprobar(List<Usuario> lista, int specificAccount, int specificUser) {
        String tipo = lista.get(specificUser).useraccounts.get(specificAccount).type;
        return tipo;
    }
}
