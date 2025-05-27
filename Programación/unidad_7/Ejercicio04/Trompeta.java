package unidad_7.Ejercicio04;

public class Trompeta implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Esta sonando la trompeta");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando la trompeta");
    }

    @Override
    public String tipoInstrumento() {
        return "viento";
    }
}
