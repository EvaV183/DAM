
import java.util.Scanner;

// Ejercicio 5.
// Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
// (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

public class U4y5_Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo:");
        double radio = scanner.nextDouble();

        //Math.round(*100)/100 para redondear el double y que muestre un solo decimal
        double area = Math.round(Math.PI * Math.pow(radio, 2)*100) / 100;

        System.out.println("El área del círculo es: " + area);
    }
}