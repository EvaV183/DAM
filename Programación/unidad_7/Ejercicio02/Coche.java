package unidad_7.Ejercicio02;

public class Coche extends Vehiculo {
    public Coche(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void arrancar() {
        super.arrancar();
    }

    @Override
    public void parar() {
        super.parar();
    }

    @Override
    public String toString() {
        return "Coche [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" +
                getPrecio() + ", estaArrancado=" + estaArrancado() + "]";
    }
}
