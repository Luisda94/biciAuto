package modelo;

public abstract class Vehiculo {
	//atributos
    private int numeroRuedas;
    private int cantidadVentanas;

    // Constructor
    public Vehiculo(int numeroRuedas, int cantidadVentanas) {
        this.numeroRuedas = numeroRuedas;
        this.cantidadVentanas = cantidadVentanas;
    }

    // Métodos abstractos
    public abstract void encender();
    public abstract void apagar();

    // Getters y Setters
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getCantidadVentanas() {
        return cantidadVentanas;
    }

    public void setCantidadVentanas(int cantidadVentanas) {
        this.cantidadVentanas = cantidadVentanas;
    }

    @Override
    public String toString() {
        return "Vehiculo con " + numeroRuedas + " ruedas y " + cantidadVentanas + " ventanas.";
    }
}
