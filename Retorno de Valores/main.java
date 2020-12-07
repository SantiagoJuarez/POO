import java.util.Scanner;
public class main
{
  int input;
  public static void main(String args[])
  {
    //Creación del objeto de la clase "suma" dentro de la clase "main"
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    /*Se crea la variable "suma" en el objeto "suma" y al método invocado
    "sumar" se le envían los argumentos "n1" y "n2" */
    suma o2 = new suma();
    int suma = o2.sumar(n1, n2);
    o2.mostrarResultados(suma);
  }
}
