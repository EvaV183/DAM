//Ejercicio 2.
//Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos.
//Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

public class Ejercicio02 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        if (num1 >  num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } if (num1 == num2) {
            System.out.println("Ambos números son iguales");
        }
    }
}