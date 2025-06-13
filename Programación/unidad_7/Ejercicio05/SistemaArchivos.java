package unidad_7.Ejercicio05;

abstract class SistemaArchivos {

    String nombre;

    public SistemaArchivos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    };

    public abstract double getTamaño();

}
