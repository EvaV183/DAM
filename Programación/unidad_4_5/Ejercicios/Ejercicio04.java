package unidad_4_5.Ejercicios;

// Ejercicio 4.
// Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre ");
        String name = scanner.nextLine();

        System.out.println("Bienvenid@ " + name);
        scanner.close();
    }
}
