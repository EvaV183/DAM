package unidad_7.Ejercicio03;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    Rectangulo(double base, double altura) {
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
        return base * altura;
    }

    public double calcularPerimetro() {
        return base * 2;
    }
}
