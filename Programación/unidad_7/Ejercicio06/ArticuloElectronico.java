package unidad_7.Ejercicio06;

public class ArticuloElectronico extends Producto{

    private static final double tarifaReciclaje = 10.0;

    public ArticuloElectronico(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio + tarifaReciclaje;
    }
}
