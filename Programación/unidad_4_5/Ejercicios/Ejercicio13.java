package unidad_4_5.Ejercicios;

import java.util.Scanner;

// Ejercicio 13. 
// Realiza una aplicación que nos pida un número de ventas a introducir, después nos 
// pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final 
// mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no. 

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float importeTotal = 0;

        System.out.println("Introduce el número de ventas: ");
        int ventas = scanner.nextInt();

        
        for (int i = 0; i < ventas; i++) {
            System.out.println("Introduce ahora el importe de cada venta: ");
            float importe = scanner.nextFloat();
            importeTotal += importe;
        }

        System.out.println("Se ha realizado un total de " + ventas + " ventas cuyo importe total es " + importeTotal);

        scanner.close();
    }
}
