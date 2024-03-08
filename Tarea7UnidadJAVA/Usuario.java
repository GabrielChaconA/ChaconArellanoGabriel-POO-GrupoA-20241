
import java.util.List;

public class Usuario {
    Banco banco;
    String name, lastname, code;
    List<Banco> useraccounts;

    public Usuario(String name, String lastname, String code, List<Banco> useraccounts) {
        this.name = name;
        this.lastname = lastname;
        this.code = code;
        this.useraccounts = useraccounts;

    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCode() {
        return code;
    }

    public List<Banco> getuseraccount() {
        return useraccounts;

    }

    public void ShowUsers(List<Usuario> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(String.format("Name: %s %s code: %s", lista.get(i).name,
                    lista.get(i).lastname, lista.get(i).code));

        }
    }

    public void SpecificUsers(int specificUser, List<Usuario> lista) {

        System.out.println(String.format("Name: %s %s code: %s", lista.get(specificUser).name,
                lista.get(specificUser).lastname, lista.get(specificUser).code));

    }

}
