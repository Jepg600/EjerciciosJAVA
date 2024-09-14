import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca el valor del radio
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // Calcular la longitud y el área de la circunferencia
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }
}
