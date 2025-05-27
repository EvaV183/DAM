package unidad_7.Ejercicio04;

public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Estoy tocando el piano");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando el piano");
    }

    @Override
    public String tipoInstrumento() {
        return "cuerda percutida";
    }
}
