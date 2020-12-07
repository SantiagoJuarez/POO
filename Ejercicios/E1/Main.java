import java.util.Scanner;
public class Main
{
  int input;
  public static void main(String args[])
  {
    //Entrada de los argumentos del cuadrilatero
    System.out.println("Lados del cuadrilatero");
    Scanner input = new Scanner(System.in);

    //Objeto o1 de la clase Cuadrilatero
    Cuadrilatero c1;
    float lado1 = input.nextFloat();
    float lado2 = input.nextFloat();

    //Condicional para saber si es o no un cuadrado
    if (lado1 == lado2) //Caso: Es cuadrado
    {
      c1 =  new Cuadrilatero(lado1);
      System.out.println("Es Cuadrado");
    }
    else  //Caso: No es cuadrado
    {
      c1 =  new Cuadrilatero(lado1, lado2);
      System.out.println("No es Cuadrado");
    }
    System.out.println("Perimetro = "+c1.getPerimetro());
    System.out.println("Area = "+c1.getArea());
  }
}
