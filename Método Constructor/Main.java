import java.util.Scanner;
public class Main
{
  int input;
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    String nombre;
    int edad;

    System.out.println("Cuál es tu nombre?");
    nombre = input.next();
    System.out.println("Cuántos años tienes?");
    edad = input.nextInt();

    Persona p1 = new Persona(nombre, edad);
    p1.mostrarDatos();
  }
}
