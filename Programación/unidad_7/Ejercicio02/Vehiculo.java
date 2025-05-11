package unidad_7.Ejercicio02;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private double precio;
    private boolean estaArrancado;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estaArrancado = false;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean estaArrancado() {
        return estaArrancado;
    }
    public void arrancar() {
        this.estaArrancado = true;

        if (this instanceof Coche) {
            System.out.println("El coche está arrancado");
        } else if (this instanceof Moto) {
            System.out.println("La moto está arrancada");
        } else {
            System.out.println("El vehículo está arrancado");
        }

    }
    public void parar() {
        this.estaArrancado = false;

    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", estaArrancado=" + estaArrancado +
                '}';
    }
}
