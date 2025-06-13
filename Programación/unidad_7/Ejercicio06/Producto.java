package unidad_7.Ejercicio06;

abstract class Producto {

    String id;
    String nombre;
    double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularPrecioFinal();

}
