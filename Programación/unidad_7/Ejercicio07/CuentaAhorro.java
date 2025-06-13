package unidad_7.Ejercicio07;

public class CuentaAhorro extends Cuenta {

    private static final double tasaInteres = 0.03;

    public CuentaAhorro(int numCuenta, double saldo, String titular) {
        super(numCuenta, saldo, titular);
    }

    @Override
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
}
