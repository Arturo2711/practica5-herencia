package PracticaHerencia;

import java.sql.Time;

public class Pelicula extends Cine {

  protected Time duracion;
  protected Time horario;
  protected String director;
  protected double precio;

  // Constructor
  public Pelicula(
    String nombre,
    Time duracion,
    Time horario,
    String director,
    double precio
  ) {
    super(nombre);
    this.duracion = duracion;
    this.precio = precio;
    this.horario = horario;
    this.director = director;
  }

  // SET

  public void setDuracion(Time duracion) {
    this.duracion = duracion;
  }

  public void setHorario(Time horario) {
    this.horario = horario;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  //GET

  public Time getDuracion() {
    return duracion;
  }

  public Time getHorario() {
    return horario;
  }

  public String getDirector() {
    return director;
  }

  public double getPrecio() {
    return precio;
  }

  // VENDER ENTRADA
  @Override
  void vender_entrada(double entrada) {
    super.vender_entrada(entrada);
    System.out.println("Gracias");
  }
}
