package unidad_7.Ejercicio04;

public class EJ04 {
    public static void main(String[] args) {
        Guitarra guitarra1 = new Guitarra();
        Piano piano1 = new Piano();
        Trompeta trompeta1 = new Trompeta();

        guitarra1.tocar();
        guitarra1.afinar();
        System.out.println("El instrumento es de tipo " + guitarra1.tipoInstrumento());

        System.out.println("------------------------------------");

        piano1.tocar();
        piano1.afinar();
        System.out.println("El instrumento es de tipo " + piano1.tipoInstrumento());

        System.out.println("------------------------------------");

        trompeta1.tocar();
        trompeta1.afinar();
        System.out.println("El instrumento es de tipo " + trompeta1.tipoInstrumento());
    }
}
