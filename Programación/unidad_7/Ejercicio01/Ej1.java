package unidad_7.Ejercicio01;

public class Ej1 {
    public static void main(String[] args) {
        Componente componente1 = new Componente(123456, "HP", "EliteDesk");
        DiscoDuro discoDuro1 = new DiscoDuro(000111, "Seagate", "Barracuda", 1024);
        Microprocesador microprocesador1 = new Microprocesador(11223344, "Intel", "i7-12700", 3200);

        System.out.println(componente1.toString());
        System.out.println(discoDuro1.toString());
        System.out.println(microprocesador1.toString());
    }
}
