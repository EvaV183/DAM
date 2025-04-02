package unidad_6.Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNum1(5);
        calculadora.setNum2(10);

        System.out.println("Número 1: " + calculadora.getNum1());
        System.out.println("Número 2: " + calculadora.getNum2());
        System.out.println("El resultado de la suma es: " + calculadora.suma());
        System.out.println("El resultado de la resta es: " + calculadora.resta());
        System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicacion());
        System.out.println("El resultado de la división es: " + calculadora.division());

    }
}
