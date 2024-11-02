package modelo;

import interfaces.interfazVehiculo;

public class Auto  extends Vehiculo implements interfazVehiculo {
	//aribuos de auto
    private String color;
    private String modelo;

    // Constructor
    public Auto(int numeroRuedas, int cantidadVentanas, String color, String modelo) {
        super(numeroRuedas, cantidadVentanas);
        this.color = color;
        this.modelo = modelo;
    }

    // Implementación de los métodos abstractos
    @Override
    public void encender() {
        System.out.println("El auto está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado.");
    }

    // Implementación del método de la interfaz
    @Override
    public String tipoDeBencina() {
        return "Gasolina";
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto " + modelo + " de color " + color + ", " + super.toString();
    }

}
