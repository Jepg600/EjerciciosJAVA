
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner obtener = new Scanner (System.in);
        String nombre = obtener.nextLine();
        System.out.println("Buenos dias "+nombre+"!");
    }
}
