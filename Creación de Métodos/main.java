public class main
{
  public static void main(String args[])
  {
    //Creación del objeto de la clase "operacion" dentro de la clase "main"
    operacion o1 = new operacion();

    o1.leerNumeros();
    o1.sumar();
    o1.restar();
    o1.multiplicar();
    o1.dividir();
    o1.mostrarResultados();
  }
}
