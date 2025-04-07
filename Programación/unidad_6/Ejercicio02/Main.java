package unidad_6.Ejercicio02;

public class Main {
    public static void main(String[] args) {
        EcuacionPrimerGrado ecuacionPrimerGrado = new EcuacionPrimerGrado();

        ecuacionPrimerGrado.setA(0);
        ecuacionPrimerGrado.setB(0);
        System.out.println("Ecuación: " +ecuacionPrimerGrado.getEcuacion());
        System.out.println("Resultado: x = " + ecuacionPrimerGrado.calcularResultado());
    }
}
