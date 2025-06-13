package unidad_7.Ejercicio07;

public abstract class Cuenta {
    int numCuenta;
    String titular;
    double saldo;

    public Cuenta(int numCuenta, double saldo, String titular) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double calcularInteres();
}
