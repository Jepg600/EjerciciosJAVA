import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca su nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // Mostrar el mensaje
        System.out.println("Buenos días, " + nombre);
    }
}
