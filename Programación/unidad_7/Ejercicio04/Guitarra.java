package unidad_7.Ejercicio04;

public class Guitarra implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Estoy tocando la guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando la guitarra");
    }

    @Override
    public String tipoInstrumento() {
        return "cuerda";
    }
}
