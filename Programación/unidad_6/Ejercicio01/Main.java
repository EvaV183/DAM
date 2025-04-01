package unidad_6.Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNum1(5);
        calculadora.setNum2(10);

        System.out.println(calculadora.suma());
    }
}
