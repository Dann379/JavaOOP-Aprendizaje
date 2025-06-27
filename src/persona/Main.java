package persona;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();
        //personas.add(new Persona("Dany", 32, "Puebla"));
        //personas.add(new Persona("Luis", 27, "CDMX"));
        //Persona persona1 = new Persona("Dany", 32, "Puebla");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa Username");
        String username = input.nextLine();

        System.out.println("Ingresa edad");
        int edad = input.nextInt();
        String salto = input.nextLine();

        System.out.println("Ingresa ciudad");
        String ciudad = input.nextLine();

        personas.add(new Persona(username, edad, ciudad));

        /*System.out.println("Nombre: " +username);
        System.out.println("Edad: " +edad);
        System.out.println("ciudad: " +ciudad);*/

        //System.out.println("Datos de la Persona");
        //persona1.mostrar();
        System.out.println("--------------------");
        for (int i=0; i < personas.size(); i++) {
            personas.get(i).mostrar();
            System.out.println("-----------------");
        }


    }
}