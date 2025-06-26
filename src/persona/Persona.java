package persona;

public class Persona {
    String nombre;
    int edad;
    String ciudad;


    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public void mostrar(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("ciudad: " +ciudad);
    }
}
