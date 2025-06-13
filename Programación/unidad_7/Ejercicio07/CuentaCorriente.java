package unidad_7.Ejercicio07;

public class CuentaCorriente extends Cuenta {

    private static final double tasaInteres = 0.01;

    public CuentaCorriente(int numCuenta, double saldo, String titular) {
        super(numCuenta, saldo, titular);
    }

    @Override
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
}
