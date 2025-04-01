package unidad_4_5.Ejercicios;
// Ejercicio 9. 
// Lee un número por teclado que pida el precio de un producto (puede tener decimales)y 
// calcule el precio final con IVA. El IVA será una constante que será del 21%.

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio del producto: ");
        float price = scanner.nextInt();

        float iva = 21;

        float finalPrice = price * (1+(iva/100));

        System.out.println("---------------");
        System.out.println("Precio Total: " + finalPrice + " Euros");
    }
}
