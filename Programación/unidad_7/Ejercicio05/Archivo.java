package unidad_7.Ejercicio05;

public class Archivo extends SistemaArchivos {

    public double tamañoArchivo;

    public Archivo(String nombre, double tamañoArchivo) {
        super(nombre);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getTamaño() {
        return tamañoArchivo;
    }
}
