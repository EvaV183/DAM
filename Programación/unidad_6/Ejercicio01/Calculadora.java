package unidad_6.Ejercicio01;

public class Calculadora {
    //Declaramos los atributos como privados para encapsularlos
    private double num1;
    private double num2;

    //Numero 1 - Getters and Setters
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1; //void porque no devuelve nada unicamente modifica el número
    }

    //Numero 2 - Getters and Setters
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) { 
        this.num2 = num2;
    }

    //Operaciones
    public double suma() {
     return num1 + num2;
    }

    public double resta() {
     return num1 - num2;
    }

    public double multiplicacion() {
     return num1 * num2;
    }
    public double division() {
     return num1 / num2;
    }
}
