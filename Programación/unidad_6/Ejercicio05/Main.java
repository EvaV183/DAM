package unidad_6.Ejercicio05;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("02015458410154", "Pepe Perez");
        CuentaBancaria cuenta2 = new CuentaBancaria("12120558460784", "Paco Garcia");

        // Establecer saldo inicial
        cuenta1.setSaldo(3500);
        cuenta2.setSaldo(10000);

        System.out.println("===== ESTADO INICIAL =====");
        System.out.println("Cuenta 1 - " + cuenta1.getTitular() + " | Saldo: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2 - " + cuenta2.getTitular() + " | Saldo: " + cuenta2.getSaldo());

        System.out.println("\n===== TRANSFERENCIA =====");
        double cantidadATransferir = 2000;
        System.out.println("Intentando transferir " + cantidadATransferir + " de Cuenta 2 a Cuenta 1");

        boolean resultado = cuenta2.transferirDinero(cantidadATransferir, cuenta1);

        if (resultado) {
            System.out.println("✅ Transferencia realizada con éxito");
        } else {
            System.out.println("❌ Transferencia fallida. Saldo insuficiente");
        }

        System.out.println("\n===== ESTADO FINAL =====");
        System.out.println("Cuenta 1 - " + cuenta1.getTitular() + " | Saldo: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2 - " + cuenta2.getTitular() + " | Saldo: " + cuenta2.getSaldo());
    }
}
