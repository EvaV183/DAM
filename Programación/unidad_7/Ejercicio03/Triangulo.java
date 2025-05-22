package unidad_7.Ejercicio03;

public class Triangulo implements FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return (base + altura);
    }
}
