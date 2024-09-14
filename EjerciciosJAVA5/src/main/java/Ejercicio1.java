import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca dos números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Mostrar los números introducidos
        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);
    }
}
