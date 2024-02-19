public class persona {
    public String nombre, genero;
    public int edad;

    public  persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
       

    }

    public void mostrar() {
        System.out.println("Tu nombres es " + nombre);
        System.out.println("Tu edad es :" + edad);
        System.out.println("Tu genero es " + genero);

    }

}
