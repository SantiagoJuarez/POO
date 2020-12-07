import java.util.Scanner;
public class operacion
{
  //Atributos
  int input;
  int n1;
  int n2;
  int suma;
  int resta;
  int multiplicacion;
  float division;

  //Métodos
  public void leerNumeros()
  {
    Scanner input = new Scanner(System.in);
    n1 = input.nextInt();
    n2 = input.nextInt();
  }

  public void sumar()
  {
    suma = n1 + n2;
  }

  public void restar()
  {
    resta = n1 - n2;
  }

  public void multiplicar()
  {
    multiplicacion = n1 * n2;
  }

  public void dividir()
  {
    float num1 = n1;
    float num2 = n2;
    division = num1 / num2;
  }

  public void mostrarResultados()
  {
    System.out.println("Suma = "+suma);
    System.out.println("Resta = "+resta);
    System.out.println("Multiplicación = "+multiplicacion);
    System.out.println("Dividir = "+division);
  }

  public static void main(String args[])
  {
    //Creación de Objeto de la clase "operacion" dentro del metodo "main"
    operacion o1 = new operacion();
    o1.leerNumeros();
    o1.sumar();
    o1.restar();
    o1.multiplicar();
    o1.dividir();
    o1.mostrarResultados();
  }
}
