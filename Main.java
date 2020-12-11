import java.util.Scanner;
public class Main
{
  public static int indiceBarato(Carro carros[])
  {
    int precio;
    int indice = 0;

    precio = carros[0].getPrecio();
    for(int i=1 ; i<carros.length ; i++)
    {
      if(carros[i].getPrecio() < precio)
      {
        precio = carros[i].getPrecio();
        indice = i;
      }
    }
    return indice;
  }
  int input;

  public static void main(String args[])
  {
    Scanner input =  new Scanner(System.in);

    String marca;
    int modelo;
    int precio;
    int indiceBarato;

    int numCarros;
    System.out.print("Cantidad de Carros  ");
    numCarros = input.nextInt();

    Carro carros[] = new Carro[numCarros];

    for(int i=0 ; i<numCarros ; i++)
    {
      System.out.println("Datos del Carro "+(i+1));
      marca = input.next();
      modelo = input.nextInt();
      precio = input.nextInt();

      carros[i] = new Carro(marca, modelo, precio);
    }

    indiceBarato = indiceBarato(carros);
    System.out.println("El carro mas barato es: ");
    System.out.println(carros[indiceBarato].mostrarDatos());

  }
}
