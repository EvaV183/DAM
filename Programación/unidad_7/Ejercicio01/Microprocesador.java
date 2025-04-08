package unidad_7.Ejercicio01;

public class Microprocesador extends Componente {
    //Atributo adicional
    int frecuencia;

    //Metodo toString
    @Override
    public String toString() {
        return "Microprocesador{" +
                "frecuencia=" + frecuencia +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getModelo() + '\'' +
                ", referencia=" + getReferencia() +
                '}';
    }

    //Constructor
    public Microprocesador(long referencia, String marca, String modelo, int frecuencia) {
        super(referencia, marca, modelo);
        this.frecuencia = frecuencia;
    }

    //Métodos de acceso para el atributo adicional frecuencia
    public int getFrecuencia() {
        return frecuencia;
    }
    public void SetFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
}
