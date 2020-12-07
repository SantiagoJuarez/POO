import java.util.Scanner;
public class Datos
{
  int input;

  private int edad;
  private String nombre;

  public void setEdad(int edad)
  {
    this.edad = edad;
  }

  public int getEdad()
  {
    return edad;
  }

  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }

  public String getNombre()
  {
    return nombre;
  }

  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int _edad = input.nextInt();
    String _nombre = input.next();

    Datos o1 = new Datos();

    o1.setEdad(_edad);
    System.out.println("Edad: "+o1.getEdad());

    o1.setNombre(_nombre);
    System.out.println("Nombre: "+o1.getNombre());
  }
}
