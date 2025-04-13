package unidad_6.Ejercicio05;

public class CuentaBancaria {
    // Atributos privados para mantener la encapsulación
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String ultimaOperacion; // Guarda una descripción de la última operación realizada

    // Constructor que inicializa el número de cuenta y el titular
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Métodos getter y setter para acceder y modificar los atributos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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

    // Metodo para ingresar dinero en la cuenta
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    // Metodo para retirar dinero
    // Boolean para que solo devuelva un resultado positivo o negativo y luego poder decidir como manejar esa respuesta
    // También guarda un registro de la operación
    public boolean retirarDinero(double cantidad) {
        System.out.println("Retirar: " + cantidad);

        ultimaOperacion = "Retirada: " + cantidad;
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false; // No se puede transferir por falta de saldo
    }

    // Metodo para transferir
    // Igual que el anterior usamos un boolean y la cuentaDestino que utilice el metodo que hemos creado antes
    // También guarda un registro de la operación
    public boolean transferirDinero(double cantidad, CuentaBancaria cuentaDestino) {
        if (saldo >= cantidad) {
            cuentaDestino.ingresarDinero(cantidad);
            return true;
        }
        return false; // No se puede transferir por falta de saldo
    }
}
