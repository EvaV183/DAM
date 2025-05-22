package unidad_7.Ejercicio03;

public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.round(Math.PI * radio * radio * 100.0) / 100.0;
    }

    public double calcularPerimetro() {
        return Math.round(2 * Math.PI * radio * 100.0) / 100.0;
    }
}
