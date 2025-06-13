package unidad_7.Ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends SistemaArchivos {

    //Lista que contendrá los archivos y directorios
    private List<SistemaArchivos> contenido = new ArrayList<>();

    public Directorio(String nombre) {
        super(nombre);
    }

    public void agregar(SistemaArchivos elemento) {
        contenido.add(elemento);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getTamaño() {
        double total = 0;

        for (SistemaArchivos elemento : contenido) {
            total += elemento.getTamaño();
        }
        return total;
    }
}
