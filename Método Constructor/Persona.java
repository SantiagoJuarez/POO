import java.util.Scanner;
public class Persona
{
  int input;

  //Atributos
  String nombre;
  int edad;

  //Métodos
  //Método Constructor
  public Persona(String nombre, int edad)
  {
    this.nombre = nombre;
    this.edad =  edad;
  }

  public void mostrarDatos()
  {
    System.out.println("Nombre: "+nombre);
    System.out.println("Edad: "+edad);
  }

  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    String nombre;
    int edad;

    System.out.println("Cuál es tu nombre?");
    nombre = input.next();
    System.out.println("Cuántos años tienes?");
    edad = input.nextInt();

    //Creación del objeto de la clase "Persona"
    Persona p2 = new Persona(nombre, edad);
    p2.mostrarDatos();
  }
}
