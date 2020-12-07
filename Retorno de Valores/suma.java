import java.util.Scanner;
public class suma
{
  int input;

  //Los métodos que usan un "return" no necesitan de atributos
  public int sumar(int n1, int n2)
  {
    int suma = n1 + n2;
    return suma;
  }

  public void mostrarResultados(int suma)
  {
    System.out.println("Suma = "+suma);
  }

  public static void main(String args[])
  {
    //Creación del objeto de la clase "suma" dentro del método "main"
    Scanner input = new Scanner(System.in);
    System.out.println("Números");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    /*Se crea la variable "suma" en el objeto "suma" y al método invocado
    "sumar" se le envían los argumentos "n1" y "n2" */
    suma o1 = new suma();
    int suma = o1.sumar(n1 , n2);
    o1.mostrarResultados(suma);
  }
}
