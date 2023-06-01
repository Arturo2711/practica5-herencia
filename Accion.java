import java.sql.Time;

public class Accion extends Pelicula {
    //Atributos
    private int numPersecuciones;
    private int numEnfrentamientos;
    private double nivelViolencia;

    //Constructor
    public Accion(Time duracion, Time horario, String director, double precio, int numPersecuciones, int numEnfrentamientos, double nivelViolencia) {
    super(duracion, horario, director, precio);
    this.numPersecuciones = numPersecuciones;
    this.numEnfrentamientos = numEnfrentamientos;
    this.nivelViolencia = nivelViolencia;
    }

    //Getters
    public int getNumPersecuciones() {
        return numPersecuciones;
    }

    public int getNumEnfrentamientos() {
        return numEnfrentamientos;
    }

    public double getNivelViolencia() {
        return nivelViolencia;
    }

    //Setters
    public void setNumPersecuciones(int numPersecuciones) {
        this.numPersecuciones = numPersecuciones;
    }

    public void setNumEnfrentamientos(int numEnfrentamientos) {
        this.numEnfrentamientos = numEnfrentamientos;
    }

    public void setNivelViolencia(double nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }    

    //Métodos

    @Override
    public void venderEntrada(double precio) {
        System.out.println("El precio de la entrada de pelicula accion es: " + precio);
    }
}
