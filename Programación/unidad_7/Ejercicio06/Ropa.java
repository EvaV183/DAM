package unidad_7.Ejercicio06;

public class Ropa extends Producto {

    private boolean esDeMarca;
    private static final double impuestoMarcas = 20.0;

    public Ropa(String id, String nombre, double precio, boolean esDeMarca) {
        super(id, nombre, precio);
        this.esDeMarca = esDeMarca;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecioFinal() {
        if (esDeMarca == true) {
            return precio + impuestoMarcas;
        } else {
            return precio;
        }
    }
}
