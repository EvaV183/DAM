package unidad_7.Ejercicio03;

public class Ej03 {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(10, 5);
        FiguraGeometrica triangulo = new Triangulo(6, 12);

        System.out.println("Área y perímetro de un círculo de radio " + ((Circulo) circulo).getRadio());
        System.out.println("Área = " + circulo.calcularArea());
        System.out.println("Perímetro = " + circulo.calcularPerimetro());

        System.out.println("----------------------------------");

        System.out.println("Área y perímetro de un rectángulo de base " +((Rectangulo) rectangulo).getBase() + " y altura " + ((Rectangulo) rectangulo).getAltura());
        System.out.println("Área = " + rectangulo.calcularArea());
        System.out.println("Perímetro = " + rectangulo.calcularPerimetro());

        System.out.println("----------------------------------");

        System.out.println("Área y perímetro de un triángulo de base " + ((Triangulo) triangulo).getBase() + " y altura " + ((Triangulo) triangulo).getAltura());
        System.out.println("Área = " + triangulo.calcularArea());
        System.out.println("Perímetro = " + triangulo.calcularPerimetro());
    }
}
