public class Carro
{
  private String marca;
  private int modelo;
  private int precio;

  public Carro(String marca, int modelo, int precio)
  {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }

  public int getPrecio()
  {
    return precio;
  }

  public String mostrarDatos()
  {
    return"Marca "+marca+" - Modelo "+modelo+" - Precio "+precio+"Q";
  }
}
