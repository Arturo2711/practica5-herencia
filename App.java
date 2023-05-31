public class App {
    public static void main(String[] args) {
        Cine cine = new Cine("Cinepolis", "Av. Siempre Viva 123");
        System.out.println("Nombre: " + cine.getNombre());
        System.out.println("Ubicacion: " + cine.getUbicacion());
        cine.venderEntrada(50.0);
    }
}
