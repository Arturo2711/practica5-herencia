public class Cine{
    // Atributos
    protected String nombre;
    private String ubicacicion;


    // Constructor
    Cine(String nombre, String ubicacicion){
        this.nombre = nombre;
        this.ubicacicion = ubicacicion;
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getUbicacion(){
        return this.ubicacicion;
    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacicion = ubicacion;
    }

    // Metodos
    public void venderEntrada(double precio){
        System.out.println("El precio de la entrada es: " + precio);
    }
}