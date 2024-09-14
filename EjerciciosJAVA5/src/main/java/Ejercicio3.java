import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Calcular el doble y el triple
        int doble = numero * 2;
        int triple = numero * 3;

        // Mostrar los resultados
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
    }
}
