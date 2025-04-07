package unidad_6.Ejercicio02;

public class EcuacionPrimerGrado {
    private double a;
    private double b;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    //Función que calcula el resultado
    public double calcularResultado() {
        double resultado = 0;

        //Comprobamos si la ecuación se puede resolver
        if (a == 0 && b == 0) {
            System.out.println("Ecuación infinita");
            return resultado = Double.POSITIVE_INFINITY;
        }

        if (a != 0) {
            resultado = - b / a;
        }
        return resultado;
    }

    //Función que muestra el campo calculado
    public String getEcuacion() {
        return a + "x + " + b + " = 0 ";
    }
}
