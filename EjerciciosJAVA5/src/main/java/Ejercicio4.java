import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca una cantidad de grados centígrados
        System.out.print("Introduce la cantidad de grados centígrados: ");
        double centigrados = sc.nextDouble();

        // Convertir a grados Fahrenheit
        double fahrenheit = 32 + (9.0 / 5.0) * centigrados;

        // Mostrar el resultado
        System.out.println(centigrados + " grados centígrados son " + fahrenheit + " grados Fahrenheit.");
    }
}
