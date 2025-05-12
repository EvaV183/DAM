package unidad_4_5.Ejercicios;

// Ejercicio 14.
// Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las
// variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada).
// Para la raíz cuadrada usa el metodo sqlrt de Math. Te recomiendo que uses mensajes de traza.

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        c = sc.nextDouble();

        System.out.println("-------------------------");

        //Calcular el discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println("El discriminante es: " + discriminante);

        System.out.println("-------------------------");


        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíces reales y distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Raíces reales e iguales:");
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("No hay soluciones reales para la ecuación");
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}
