package persona;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int salir = 0;
        int count = 0;

        System.out.println("Agregar Persona");
        System.out.println("--------------------");
        System.out.println();

        while (salir != 1) {
            System.out.println("Se creara nuevo registro");
            System.out.println("Ingresa Username");
            String username = input.nextLine();

            System.out.println("Ingresa edad");
            int edad = input.nextInt();
            String salto = input.nextLine();

            System.out.println("Ingresa ciudad");
            String ciudad = input.nextLine();
            System.out.println();

            personas.add(new Persona(username, edad, ciudad));


            System.out.println("Para imprimir personas mayores a 18 presiona 1");
            int validacion = input.nextInt();
            System.out.println();
            salto = input.nextLine();

            if (validacion == 1) {
                salir = 1;
            }
        }

        System.out.println("--------------------");
        for (int i=0; i < personas.size(); i++) {
            if (personas.get(i).getEdad() < 18)
            {
                count++;

            }

            else if (personas.get(i).getEdad() > 17) {
                    personas.get(i).mostrar();
                    System.out.println("-----------------");
            }
        }
        System.out.println("Personas menores: " +count);
    }
}