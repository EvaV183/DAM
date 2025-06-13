package unidad_7.Ejercicio07;

public class Ej07 {
    public static void main(String[] args) {
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(123456, 1000, "Pepito");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(234567, 15000, "María");
        CuentaInversion cuentaInversion1 = new CuentaInversion(890123, 23150, "Carmen");

        System.out.println("Número de cuenta: " + cuentaAhorro1.getNumCuenta() + " Titular: " + cuentaAhorro1.getTitular() + " Saldo: " + cuentaAhorro1.getSaldo() + "€ Intereses: " + cuentaAhorro1.calcularInteres() + "€");

        System.out.println("Número de cuenta: " + cuentaCorriente1.getNumCuenta() + " Titular: " + cuentaCorriente1.getTitular() + " Saldo: " + cuentaCorriente1.getSaldo() + "€ Intereses: " + cuentaCorriente1.calcularInteres() + "€");
        System.out.println("Número de cuenta: " + cuentaInversion1.getNumCuenta() + " Titular: " + cuentaInversion1.getTitular() + " Saldo: " + cuentaInversion1.getSaldo() + "€ Intereses: " + cuentaInversion1.calcularInteres() + "€");

    }
}
