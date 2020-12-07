import java.util.Scanner;
public class main
{
  int input;
  public static void main(String args[])
  {
    //Creación del objeto de la clase "operacion" dentro de la clase "main"
    System.out.println("Números");
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    operacion o2 = new operacion();

    //Llevan entre paréntesis los argumentos que envía a los métodos que lo requieren
    o2.sumar(n1, n2);
    o2.restar(n1, n2);
    o2.multiplicar(n1, n2);
    o2.dividir(n1, n2);
    o2.mostrarResultados();
  }
}
