package persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int salir = 0;
        char imprimir = 'Y';

        System.out.println("Agregar Persona");
        System.out.println("--------------------");
        System.out.println();
        GestorPersonas gestor = new GestorPersonas();

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

            gestor.agregarPersona(username, edad, ciudad);

            System.out.println("Presiona 'Y' para imprimir o cualquier tecla para ingresar otro usuario");
            char validacion = input.next().charAt(0);
            System.out.println();
            salto = input.nextLine();

            if (validacion == imprimir) {
                salir++;
            }
        }

        System.out.println("--------------------");
        gestor.mostrarMayores();
        gestor.contarMenores();
    }
}