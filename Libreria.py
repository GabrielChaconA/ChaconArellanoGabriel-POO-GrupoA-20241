class Usuarios:
    usuarios = []

    def __init__(self, nombre, books):
        self.nombre = nombre
        self.books = books

    def registe_users(self):
        nombre = input("Name: ")
        return nombre

    def create_user_list(self, nombre):
        Usuarios.usuarios.append(Usuarios(nombre, 0))

    def show_user_list(self):
        print("-User list")
        for usuario in Usuarios.usuarios:
            print("-" + usuario.nombre)

    def user_list_rent(self):
        print("-User list(Rent)")
        for usuario in Usuarios.usuarios:
            if usuario.books > 0:
                print("-" + usuario.nombre)


class Libros:
    libros = []

    def __init__(self, nombre, number, rented):
        self.nombre = nombre
        self.number = number
        self.rented = rented

    def libreria_pre(self):
        Libros.libros.append(Libros("Harry Potter", 7, False))
        Libros.libros.append(Libros("Cronicas de Narnia", 6, False))
        Libros.libros.append(Libros("Maze Runner", 2, False))
        Libros.libros.append(Libros("La teoria del todo", 0, False))

    def add_book(self):
        while True:
            print("-ADD BOOK(y/n)")
            aswer = input()
            if "y" in aswer:
                print("NAME OF THE BOOK: ")
                nombre3 = input()
                print("NUMBER OF BOOKS TO ADD: ")
                number2 = int(input())
                if self.verify(nombre3):
                    Libros.libros.append(Libros(nombre3, number2, False))
                else:
                    self.add_existing_book(nombre3, number2)
            else:
                break

    def verify(self, nombre):
        for libro in Libros.libros:
            if nombre == libro.nombre:
                return False
        return True

    def add_existing_book(self, nombre, number2):
        for libro in Libros.libros:
            if nombre == libro.nombre:
                libro.number += number2

    def rent_book(self, book_number, user_number):
        if Libros.libros[book_number].number == 0:
            print("NO AVAILABLE BOOKS")
        else:
            Libros.libros[book_number].number -= 1
            Usuarios.usuarios[user_number].books += 1
            Libros.libros[book_number].rented = True

    def show_book_list(self):
        print("-Book list")
        for i, libro in enumerate(Libros.libros):
            print(f"({i}) Book: {libro.nombre} Amount: {libro.number}")

    def show_book_list_available(self):
        print("-Available books list")
        for i, libro in enumerate(Libros.libros):
            if libro.number > 0:
                print(f"({i}) Book: {libro.nombre} Amount: {libro.number}")

    def show_book_list_not(self):
        print("-Not available books list")
        for i, libro in enumerate(Libros.libros):
            if libro.number == 0:
                print(f"Book: {libro.nombre} Amount: {libro.number}")

    def rented(self):
        print("-Rented books list")
        for libro in Libros.libros:
            if libro.rented:
                print(f"Book: {libro.nombre} Amount: {libro.number}")

    def no_rented(self):
        print("-Not rented books list")
        for libro in Libros.libros:
            if not libro.rented:
                print(f"Book: {libro.nombre} Amount: {libro.number}")


if __name__ == "__main__":
    usuarios = Usuarios(None, 0)
    libros = Libros(None, 0, False)
    libros.libreria_pre()
    flag = True
    while flag:
        print("------------------- WELCOME TO MENU--------------------------")
        print("(1)ADD USER\n(2)SHOW BOOKLIST  \n(3)SHOW USERLIST \n(4)SHOW AVAILABLE BOOK\n(5)SHOW NO  AVAILABLE BOOK \n(6)SHOW USERS THAT RENTED A BOOK \n(7)RENT A BOOK \n(8)ADD BOOK \n(9)BOOKS NO RENTED \n(10)BOOKS RENTED\n(n)END CODE  ")
        action = input()

        if action == "1":
            flag1 = True
            while flag1:
                print("ADD USER(y/n):")
                answ = input()
                if "y" in answ:
                    usuarios.create_user_list(usuarios.registe_users())
                else:
                    flag1 = False
            print("----------------------------------------------------------------")

        elif action == "2":
            libros.show_book_list()
            print("----------------------------------------------------------------")

        elif action == "3":
            usuarios.show_user_list()
            print("----------------------------------------------------------------")

        elif action == "4":
            libros.show_book_list_available()
            print("----------------------------------------------------------------")

        elif action == "5":
            libros.show_book_list_not()
            print("----------------------------------------------------------------")

        elif action == "6":
            usuarios.user_list_rent()
            print("----------------------------------------------------------------")

        elif action == "7":
            print("NUMBER OF THE BOOK: ")
            numerbook = int(input())
            print("NUMBER USER: ")
            numeruser = int(input())
            libros.rent_book(numerbook, numeruser)
            print("----------------------------------------------------------------")

        elif action == "8":
            libros.add_book()
            print("----------------------------------------------------------------")

        elif action == "9":
            libros.no_rented()
            print("----------------------------------------------------------------")

        elif action == "10":
            libros.rented()
            print("----------------------------------------------------------------")

        elif action == "n":
            flag = False

