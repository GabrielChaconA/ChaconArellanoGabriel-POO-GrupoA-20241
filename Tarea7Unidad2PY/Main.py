class Banco:
    def __init__(self, type, salaryaccount):
        self.type = type
        self.salaryaccount = salaryaccount

    def lista(self, lista):
        self.lista = lista

    def mostrar(self, useraccount):
        self.useraccount = useraccount

    def get_show_accounts(self):
        print("CUENTAS: ")
        for i in range(len(self.lista)):
            print("Usuario: " + self.lista[i].name)
            for j in range(len(self.lista[i].useraccounts)):
                print("Account: " + self.lista[i].useraccounts[j].type)
                print("Salart: " + str(self.lista[i].useraccounts[j].salaryaccount))
                print()

    def show_user(self, specific_account, specific_user):
        print("Usuario: " + self.lista[specific_user].name)
        print("Account: " + self.lista[specific_user].useraccounts[specific_account].type)
        print("Salart: " + str(self.lista[specific_user].useraccounts[specific_account].salaryaccount))
        print()

    def add_a(self, lista, specific_account, specific_user, add):
        cuenta = self.lista[specific_user].useraccounts[specific_account].salaryaccount + add
        print(cuenta)
        if cuenta < 50000:
            cuenta = self.lista[specific_user].useraccounts[specific_account].salaryaccount - add
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = cuenta
        return cuenta

    def add_b(self, lista, specific_account, specific_user, add):
        cuenta = self.lista[specific_user].useraccounts[specific_account].salaryaccount + add
        print(cuenta)
        if cuenta < 100000:
            cuenta = self.lista[specific_user].useraccounts[specific_account].salaryaccount - add
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = cuenta
        return cuenta

    def add_c(self, lista, specific_account, specific_user, add):
        cuenta = self.lista[specific_user].useraccounts[specific_account].salaryaccount + add
        print(cuenta)
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = cuenta
        return cuenta

    def withdraw_a(self, lista, specific_account, specific_user, withdraw):
        retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount - withdraw
        if withdraw > 1000:
            print("La cantidad a remover debe ser minima de 1000")
            retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount + withdraw
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = retiro
        return retiro

    def withdraw_b(self, lista, specific_account, specific_user, withdraw):
        retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount - withdraw
        if withdraw > 5000:
            print("La cantidad a remover debe ser minima de 5000")
            retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount + withdraw
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = retiro
        return retiro

    def withdraw_c(self, lista, specific_account, specific_user, withdraw):
        retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount - withdraw
        if withdraw > 10000:
            print("La cantidad a remover debe ser minima de 10000")
            retiro = self.lista[specific_user].useraccounts[specific_account].salaryaccount + withdraw
        self.lista[specific_user].useraccounts[specific_account].salaryaccount = retiro
        return retiro

    def comprobar(self, lista, specific_account, specific_user):
        tipo = self.lista[specific_user].useraccounts[specific_account].type
        return tipo


class Cuenta:
    def __init__(self):
        pass

    def comprobartipoA(self, salaryaccount):
        if salaryaccount > 50000:
            salaryaccount = 0
            print("you exceeded the limit of your account type ")
        return salaryaccount

    def comprobartipoB(self, salaryaccount):
        if salaryaccount > 100000:
            print("you exceeded the limit of your account type ")
            print("Amount to add")
            while True:
                salaryaccount = int(input())
                if salaryaccount < 100000:
                    break
        return salaryaccount

    def comprobartipoC(self, salaryaccount):
        return salaryaccount


class Usuario:
    def __init__(self, name, lastname, code, useraccounts):
        self.name = name
        self.lastname = lastname
        self.code = code
        self.useraccounts = useraccounts

    def show_users(self, lista):
        for i in range(len(lista)):
            print("Name: " + lista[i].name + " " + lista[i].lastname + " code: " + lista[i].code)

    def specific_users(self, specific_user, lista):
        print("Name: " + lista[specific_user].name + " " + lista[specific_user].lastname + " code: " + lista[
            specific_user].code)


def main():
    usuario = Usuario(None, None, None, None)
    banco = Banco(None, 0)
    cuenta = Cuenta()
    flag = True
    flag2 = False
    lista = []

    while flag:
        print("\n-----------------MENU----------------")
        print("-adduser(1) \n-specificaccount(2) \n-allaccounts(3) \n-allusers(4) \n-Specificuser (5)\n-add(money to an account)(6) \n-withdraw(money to account)(7)\n-n to end):")
        action = input()

        if not flag2 and action != "1":
            print("WARNING: EVERYTHING IS EMPTY, CHOOSE ADDUSER FIRST")
        else:
            if action == "1":
                flag2 = True
                while True:
                    print("-----------Add user (y/n):----------- ")
                    add = input()
                    if add == "y":
                        useraccounts = []
                        print("----------------------------------")
                        print("Writte your name:  ")
                        name = input()
                        print("Writte your lastname: ")
                        lastname = input()
                        print("Introduce your code:  ")
                        code = input()

                        while True:
                            print("add account (y/n): ")
                            addaccount = input()
                            if addaccount == "y":
                                print("Introduce your type account(A,B,C): ")
                                type = input()
                                print("Enter the payroll account(dont exceses your salary top): ")
                                salaryaccount = int(input())

                                if type == "A":
                                    useraccounts.append(Banco(type, cuenta.comprobartipoA(salaryaccount)))
                                elif type == "B":
                                    useraccounts.append(Banco(type, cuenta.comprobartipoB(salaryaccount)))
                                elif type == "C":
                                    useraccounts.append(Banco(type, cuenta.comprobartipoC(salaryaccount)))

                                banco.mostrar(useraccounts)
                            else:
                                break

                        lista.append(Usuario(name, lastname, code, useraccounts))
                        banco.lista(lista)

                        flag = True
                    else:
                        break

            elif action == "2":
                print("SPECIFI USER (1-n..)")
                specific_user = int(input())
                print("SPECIFI ACCOUNT(1-n..)")
                specific_account = int(input())
                banco.show_user(specific_account, specific_user)

            elif action == "3":
                banco.get_show_accounts()

            elif action == "4":
                usuario.show_users(lista)

            elif action == "5":
                print("SPECIFI USER (0-n..)")
                specific_user = int(input())
                usuario.specific_users(specific_user, lista)

            elif action == "6":
                print("SPECIFI USER (0-n..)")
                specific_user = int(input())
                print("SPECIFI ACCOUNT(0-n..)")
                specific_account = int(input())
                print("Amount to Add")
                add = int(input())
                print("New amount")

                if banco.comprobar(lista, specific_account, specific_user) == "A":
                    banco.add_a(lista, specific_account, specific_user, add)
                elif banco.comprobar(lista, specific_account, specific_user) == "B":
                    banco.add_b(lista, specific_account, specific_user, add)
                elif banco.comprobar(lista, specific_account, specific_user) == "C":
                    banco.add_c(lista, specific_account, specific_user, add)

            elif action == "7":
                print("SPECIFIC USER (0-n..)")
                specific_user = int(input())
                print("SPECIFIC ACCOUNT(0-n..)")
                specific_account = int(input())
                print("Amount to remove")
                withdraw = int(input())
                print("New amount")

                if banco.comprobar(lista, specific_account, specific_user) == "A":
                    banco.add_a(lista, specific_account, specific_user, -withdraw)
                elif banco.comprobar(lista, specific_account, specific_user) == "B":
                    banco.withdraw_b(lista, specific_account, specific_user, withdraw)
                elif banco.comprobar(lista, specific_account, specific_user) == "C":
                    banco.withdraw_c(lista, specific_account, specific_user, withdraw)

            elif action == "n":
                flag = False


if __name__ == "__main__":
    main()
