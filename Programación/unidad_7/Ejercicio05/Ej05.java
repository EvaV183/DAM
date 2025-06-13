package unidad_7.Ejercicio05;

public class Ej05 {
    public static void main(String[] args) {

        Directorio directorioRaiz = new Directorio("/");
        Archivo archivo3 = new Archivo("Archivo03", 25.3);
        directorioRaiz.agregar(archivo3);

        Archivo archivo1 = new Archivo("Archivo01", 5.5);
        Archivo archivo2 = new Archivo("Archivo02", 10);

        Directorio directorio1 = new Directorio("Directorio01");
        directorio1.agregar(archivo1);
        directorio1.agregar(archivo2);

        directorioRaiz.agregar(directorio1);

        System.out.println("Tamaño total de " + directorioRaiz.getNombre() + " = " + directorioRaiz.getTamaño() + "MB");
        System.out.println("Tamaño total de " + directorio1.getNombre() + " = " + directorio1.getTamaño() + "MB");
    }
}
