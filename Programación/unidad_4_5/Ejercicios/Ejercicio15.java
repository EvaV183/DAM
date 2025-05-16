package unidad_4_5.Ejercicios;
//
// Ejercicio 15.
// Lee un número por teclado y comprueba que este número es mayor o igual que cero,
// si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor que 0: ");
        int num1 = sc.nextInt();

        while (num1 <= 0) {
            System.out.println("El número es menor de 0. Vuelve a introducir el número: ");
            num1 = sc.nextInt();
        }
        System.out.println("El número es: " + num1);

        sc.close();
    }
}
