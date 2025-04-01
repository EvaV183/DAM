package unidad_4_5.Ejercicios;

import java.util.Scanner;

//Ejercicio 6. 
// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también 
// debemos indicarlo.

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NÚMEROS DIVISIBLES POR 2");
        System.out.println("Introduce un número: ");

        int number = scanner.nextInt();

        if (number % 2 == 0 && number != 0) {
            System.out.println("El número es divisible entre 2!!!");
        } else {
            System.out.println("El número no es divisible entre 2");
        }
    }
}