import java.util.Scanner;
public class Operacion
{
  int input;

  int n1;
  int n2;

  public Operacion(int n1, int n2)
  {
    this.n1 = n1;
    this.n2 = n2;
  }

  public void mostrarResultados(int n1, int n2)
  {
    System.out.println("Suma = "+(n1+n2));
    System.out.println("Resta = "+(n1-n2));
    System.out.println("Multiplicación = "+(n1*n2));
    System.out.println("Dividir = "+(n1/n2));
  }

  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int n1;
    int n2;

    System.out.println("Números");
    n1 = input.nextInt();
    n2 = input.nextInt();

    Operacion o1 = new Operacion(n1, n2);
    o1.mostrarResultados(n1, n2);
  }
}
