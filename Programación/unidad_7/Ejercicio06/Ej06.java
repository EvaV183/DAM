package unidad_7.Ejercicio06;

public class Ej06 {
    public static void main(String[] args) {

        Alimento alimento1 = new Alimento("001", "Leche", 0.80);
        ArticuloElectronico articuloElectronico1 = new ArticuloElectronico("001", "Auriculares", 78);
        Ropa ropa1 = new Ropa("001", "Camiseta de rayas", 15, true);

        System.out.println("El precio final de " + alimento1.getNombre() + " = " + alimento1.calcularPrecioFinal() + "€") ;
        System.out.println("El precio final de " + articuloElectronico1.getNombre() + " = " + articuloElectronico1.calcularPrecioFinal() + "€");
        System.out.println("El precio final de " + ropa1.getNombre() + " = " + ropa1.calcularPrecioFinal() + "€");
    }
}
