package unidad_4_5.Ejercicios;
// Ejercicio 12. 
// Muestra los números del 1 al 100 (ambos incluidos)divisibles entre 2 y 3. Utiliza el bucle 
// que desees

public class Ejercicio12 {
    public static void main(String[] args) {
        //CON WHILE
        int contador = 0;
        String numerosDivisibles2 = " "; //cadena donde iremos añadiendo los números
        String numerosDivisibles3 = " ";
        
        while (contador < 101) {
            if (contador % 2 == 0) {
                numerosDivisibles2 += contador + " "; //Si es divisible por 2 lo concatenamos a su variable correspondiente y añadimos espacio
            } if (contador % 3 == 0) {
                numerosDivisibles3 += contador + " "; //Si es divisible por 3 lo concatenamos a su variable correspondiente y añadimos espacio
            }
            contador++; //Aumentamos el contador +1 en cada iteración
        }
        System.out.println("Los números divisibles por 2 son: " + numerosDivisibles2);
        System.out.println("Los números divisibles por 3 son: " + numerosDivisibles3);

        System.out.println("----------------");

        //CON FOR
        String numDiv2 = " ";
        String numDiv3 = " ";

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                numDiv2 += i + " ";
            } if (i % 3 == 0) {
                numDiv3 += i + " ";
            }
        }
        System.out.println("Los números divisibles por 2 son: " + numDiv2);
        System.out.println("Los números divisibles por 3 son: " + numDiv3);
    }
}
