package unidad_7.Ejercicio06;

public class Alimento extends Producto{

    double impuestoVentas = 0.10;

    public Alimento(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal = precio + (precio * impuestoVentas);
        return Math.round(precioFinal * 100.0) / 100.0;
    }
}
