/*Ejercicio 1
Obtener el Area y Perimetro de un cuadrilatero*/
public class Cuadrilatero
{
  //Atributos
  private float lado1;
  private float lado2;

  //Metodos

  //Metodo Constructor1: Para casos en en que no sea un cuadrado
  public Cuadrilatero(float lado1, float lado2)
  {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  //Metodo Constructor2: Para casos en que sea un cuadrado
  public Cuadrilatero(float lado1)
  {
    this.lado1 = this.lado2 = lado1;
  }

  //Metodo getPerimetro: Retorna el Perimetro
  public float getPerimetro()
  {
    float perimetro = 2 * (lado1 + lado2);
    return perimetro;
  }

  //Metodo getArea: Retorna el Area
  public float getArea()
  {
    float area = lado1 * lado2;
    return area;
  }
}
