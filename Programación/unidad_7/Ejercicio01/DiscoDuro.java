package unidad_7.Ejercicio01;

public class DiscoDuro extends Componente{
    //Atributo adicional
    int capacidad;

    //Metodo toString
    @Override
    public String toString() {
        return "DiscoDuro{" +
                "capacidad=" + capacidad +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", referencia=" + getReferencia() +
                '}';
    }

    //Constructor
    public DiscoDuro(long referencia, String marca, String modelo, int capacidad) {
        super(referencia, marca, modelo);
        this.capacidad = capacidad;
    }

    //Métodos de acceso para el atributo adicional capacidad
    public int getCapacidad() {
        return capacidad;
    }
    public void SetCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
