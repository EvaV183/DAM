package unidad_6.Ejercicio03;

public class Main {
    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacionSegundoGrado = new EcuacionSegundoGrado();

        ecuacionSegundoGrado.setA(1);
        ecuacionSegundoGrado.setA(-3);
        ecuacionSegundoGrado.setA(2);
        System.out.println(ecuacionSegundoGrado.getEcuacion());
        System.out.println("Resultado: x = " + ecuacionSegundoGrado.calcularResultado());

    }
}
