
public class Rectangulo {
    public int ancho, altura;

  public Rectangulo(int ancho, int altura){
    this.altura= altura ;
    this.ancho = ancho;
  }

    public int perimetro() {
        int perimetro = (ancho * altura);
        return perimetro;

    }

    public int area() {
        int area = (ancho * altura) / 2;
        System.out.println(area);
        return area;
    }
    

   
}
