package unidad_6.Ejercicio03;

public class EcuacionSegundoGrado {
    double a;
    double b;
    double c;

    //A
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    //B
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    //C
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    //Función que calcula el resultado
    public double[] calcularResultado() {
        //El discriminante es la parte bajo la raíz
        double discriminant = Math.pow(b, 2) -4 * a * c;

        //En función de lo que valga el discriminante habrá varias posibilidades
        if (discriminant > 0) { //Si el discriminante es mayor de 0 hay 2 soluciones reales distintas
            double solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{solution1, solution2};
        } else if (discriminant == 0) { //Si es igual a 0 hay 1 solución real doble
            double solution = -b / (2 * a);
            return new double[] {solution};
        } else { //Si es menor de 0 no hay soluciones reales
            System.out.println("La ecuación no tiene soluciones reales");
            return null;
        }
    }

    //Función que muestra el campo calculado
    public String getEcuacion() {
        return  a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
