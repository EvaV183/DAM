package unidad_7.Ejercicio02;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void arrancar() {
        super.arrancar();
    }

    @Override
    public String toString() {
        return "Moto [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" +
                getPrecio() + ", estaArrancado=" + estaArrancado() + "]";
    }
}
