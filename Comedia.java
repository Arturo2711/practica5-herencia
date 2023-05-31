import java.sql.Time;

public class Comedia extends Pelicula {
    //Atributos
    private int numPersonajesPrincipales;
    private int numChistes;
    private double nivelFelicidad;

    //Constructor
    public Comedia(Time duracion, Time horario, String director, double precio, int numPersonajesPrincipales, int numChistes, double nivelFelicidad) {
    super(duracion, horario, director, precio);
    this.numPersonajesPrincipales = numPersonajesPrincipales;
    this.numChistes = numChistes;
    this.nivelFelicidad = nivelFelicidad;
    }

    //Getters
    public int getNumPersonajesPrincipales() {
        return numPersonajesPrincipales;
    }

    public int getNumChistes() {
        return numChistes;
    }

    public double getNivelFelicidad() {
        return nivelFelicidad;
    }

    //Setters
    public void setNumPersonajesPrincipales(int numPersonajesPrincipales) {
        this.numPersonajesPrincipales = numPersonajesPrincipales;
    }

    public void setNumChistes(int numChistes) {
        this.numChistes = numChistes;
    }

    public void setNivelFelicidad(double nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
    }    

    //Métodos

    @Override
    public void venderEntrada(double precio) {
        System.out.println("El precio de la entrada de pelicula comedia es: " + precio);
    }
}
