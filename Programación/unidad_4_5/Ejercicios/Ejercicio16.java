package unidad_4_5.Ejercicios;

// Ejercicio 16.
// Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
// se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
// más la contraseña y mostrará un mensaje diciendo «Enhorabuena». Piensa bien en la
// condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        String password = "abcd";
        int counter = 3;
        Boolean isCorrect = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina la password en menos de 3 intentos");
        System.out.println("------------------------------------------");

        while (counter > 0 && !isCorrect) {
            System.out.println("Ingrese su password: ");
            String userPassword = scanner.nextLine();
            counter--;

            if (userPassword.equals(password)) {
                isCorrect = true;
                System.out.println("Enhorabuena! El password es correcto");
            } else if (counter > 0) {
                System.out.println("Contraseña incorrecta, te quedan " + counter + " intentos. Vuelve a intentarlo.");
            }
        }

        if (isCorrect == false) {
            System.out.println("No quedan más intentos");
        }

        scanner.close();
    }
}
