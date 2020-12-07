import java.util.Scanner;
public class operacion
{
  //Atributos
  int input;
  int suma;
  int resta;
  int multiplicacion;
  float division;

  //Métodos
  //Llevan entre paréntesis los parámetros que utilizan
  public void sumar(int n1, int n2)
  {
    suma = n1 +n2;
  }

  public void restar(int n1, int n2)
  {
    resta = n1 - n2;
  }

  public void multiplicar(int n1, int n2)
  {
    multiplicacion = n1 * n2;
  }

  public void dividir(int n1, int n2)
  {
    float a;
    a = n1;
    float b;
    b = n2;
    division = a / b;
  }

  public void mostrarResultados()
  {
    System.out.println("Suma = "+suma);
    System.out.println("Resta = "+resta);
    System.out.println("Multiplicación = "+multiplicacion);
    System.out.println("División = "+division);
  }

  public static void main(String args[])
  {
    //Creación del objeto de la clase "operación" dentro del método "main"
    Scanner input = new Scanner(System.in);
    System.out.println("Números");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    //Llevan entre paréntesis los argumentos que envía a los métodos que los requieren
    operacion o1 = new operacion();
    o1.sumar(n1 , n2);
    o1.restar(n1 , n2);
    o1.dividir(n1 , n2);
    o1.multiplicar(n1 , n2);
    o1.mostrarResultados();
  }
}
