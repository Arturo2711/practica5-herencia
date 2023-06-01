package PracticaHerencia;

import java.sql.Time;

public class Terror extends Pelicula {

  private String personaje_Terror;
  private double nivel_miedo;

  public Terror(
    String nombre,
    Time duracion,
    Time horario,
    String director,
    double precio,
    String personaje_Terror,
    double nivel_miedo
  ) {
    super(nombre, duracion, horario, director, precio);
    this.personaje_Terror = personaje_Terror;
    this.nivel_miedo = nivel_miedo;
  }

  //SET

  public void setPersonaje_Terror(String personaje_Terror) {
    this.personaje_Terror = personaje_Terror;
  }

  public void setNivel_miedo(double nivel_miedo) {
    this.nivel_miedo = nivel_miedo;
  }

  //GET

  public String getPersonaje_Terror() {
    return personaje_Terror;
  }

  public double getNivel_miedo() {
    return nivel_miedo;
  }

  // VENDER ENTRADA
  @Override
  void vender_entrada(double entrada) {
    super.vender_entrada(entrada);
    System.out.println("Disfute su pelicula de Terror");
  }
}
