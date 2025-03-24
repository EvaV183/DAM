//Ejercicio 1
//Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
//resta, multiplicación, división y módulo (resto de la división).

public class Ejercicio01 {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 2;

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta);
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("La división de " + num1 + " / " + num2 + " = " + division);
        System.out.println("El modulo de " + num1 + " y " + num2 + " es = " + modulo);
    }
}