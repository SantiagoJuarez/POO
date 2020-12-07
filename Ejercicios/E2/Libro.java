/*Ejercicio
Crerar objetos Libro que tengan atributos: -Titulo, -Autor, -Numero de Paginas*/
public class Libro
{
  //Atributos
  private String titulo;
  private String autor;
  private int numPag;

  //Metodos
  //Métodos Get y Set de para todos los atributos
  //Titulo
  public void setTitulo(String titulo)
  {
    this.titulo = titulo;
  }
  public String getTitulo()
  {
    return titulo;
  }

  //Autor
  public void setAutor(String autor)
  {
    this.autor = autor;
  }
  public String getAutor()
  {
    return autor;
  }

  //Numero de Paginas
  public void setnumPag(int numPag)
  {
    this.numPag = numPag;
  }
  public int getnumPag()
  {
    return numPag;
  }

  /*Método toString que muestra los datos en
  una misma linea*/
  public void mostrarDatos()
  {
    System.out.println("Titulo: "+titulo);
    System.out.println("Autor: "+autor);
    System.out.println("Paginas: "+numPag);
  }
}
