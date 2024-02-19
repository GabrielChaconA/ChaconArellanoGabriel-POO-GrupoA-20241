

public class Tarea3 {
    public static void main(String[] args) {
        System.out.println("Punto 1");
        // punto 1
        persona Persona = new persona("gabo ", "masculino", 14);
        Persona.mostrar();
        persona Persona2 = new persona("Andre ", "Maculino", 13);
        Persona2.mostrar();
        persona Persona3 = new persona("Daniel ", "Maculino", 16);
        Persona3.mostrar();
        persona Persona4 = new persona("Roxana ", "Femenino", 18);
        Persona4.mostrar();

        
        // punto 2
        System.out.println("Punto 2 ");
        Libro libro = new Libro();

        System.out.println(String.format("Autor: %s, Libro: %s, Año de publicación: %d", libro.autor, libro.titulo, libro.añoDePublicacion));

        Libro libro2 = new Libro();
        System.out.println();
        libro2.titulo = "Maze Runner";
        libro2.autor = "James Dashner";

        libro2.añoDePublicacion = 2014;
        System.out.println(String.format("Autor: %s, Libro: %s, Año de publicación: %d", libro2.autor, libro2.titulo, libro2.añoDePublicacion));

        Libro libro3 = new Libro();
        System.out.println();
        libro3.titulo = "Cronicas de Narnia";
        libro3.autor = " C. S. Lewis, Sinclair Lewis, Clive Staples Lewis";

        libro3.añoDePublicacion = 1998;
        System.out.println(String.format("Autor: %s, Libro: %s, Año de publicación: %d", libro3.autor, libro3.titulo, libro3.añoDePublicacion));


        Libro libro4 = new Libro();
        System.out.println();
        libro4.titulo = "El principuto";
        libro4.autor = " Antoine de Saint-Exupéry";
        libro4.añoDePublicacion = 1943;
        System.out.println(String.format("Autor: %s, Libro: %s, Año de publicación: %d", libro4.autor, libro4.titulo, libro4.añoDePublicacion));

        // punto3
        System.out.println("Punto 3");
        System.out.println();
        Rectangulo miRectangulo = new Rectangulo(4,5);
        System.out.println("Area de Rectangulo :" + miRectangulo.area());
        System.out.println("Perimetro de rectangulo :" + miRectangulo.perimetro());
        Rectangulo miRectangulo2 = new Rectangulo(2,3);  
        System.out.println("Area de Rectangulo :" + miRectangulo2.area());
        System.out.println("Perimetro de rectangulo :" + miRectangulo2.perimetro());
        Rectangulo miRectangulo3 = new Rectangulo(5,5);
        System.out.println("Area de Rectangulo :" + miRectangulo3.area());
        System.out.println("Perimetro de rectangulo :" + miRectangulo3.perimetro());
        Rectangulo miRectangulo4= new Rectangulo(6,6);
        System.out.println("Area de Rectangulo :" + miRectangulo4.area());
        System.out.println("Perimetro de rectangulo :" + miRectangulo4.perimetro());
    }

}