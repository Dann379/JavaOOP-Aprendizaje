package persona;
import java.util.ArrayList;

public class GestorPersonas {

    private ArrayList<Persona> personas = new ArrayList<>();

    public void agregarPersona (String username, int edad, String ciudad) {
        personas.add(new Persona(username, edad, ciudad));

    }

    public void mostrarMayores(){

        for (int i=0; i < personas.size(); i++) {

            if (personas.get(i).getEdad() > 17) {
                personas.get(i).mostrar();
                System.out.println("-----------------");
            }
        }
    }

    public void contarMenores() {

        int count = 0;
        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).getEdad() < 18) {
                count++;

            }
        }
        System.out.println("el numero de personas menores es de: " + count);
    }
}
