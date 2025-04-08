package unidad_7.Ejercicio01;

public class Componente {
    //Atributos
    private long referencia;
    private String marca;
    private String modelo;

    //Metodo toString
    @Override
    public String toString() {
        return "Componente{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    //Constructor
    public Componente(long referencia, String marca, String modelo) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

}
