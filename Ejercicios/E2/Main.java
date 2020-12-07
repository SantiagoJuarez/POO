import java.util.Scanner;
public class Main
{
  int input;
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    String titulo = input.nextLine();
    String autor = input.nextLine();
    int numPag = input.nextInt();

    Libro o1 = new Libro();
    o1.setTitulo(titulo);
    o1.setAutor(autor);
    o1.setnumPag(numPag);
    o1.mostrarDatos();
  }
}
