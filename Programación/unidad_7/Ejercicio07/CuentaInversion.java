package unidad_7.Ejercicio07;

public class CuentaInversion extends Cuenta {

    private static final double tasaInteres = 0.06;

    public CuentaInversion(int numCuenta, double saldo, String titular) {
        super(numCuenta, saldo, titular);
    }

    @Override
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
}
