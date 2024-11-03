package modelo;

import java.util.Scanner;

import interfaces.interfazVehiculo;

public class Auto  extends Vehiculo implements interfazVehiculo {
	//aribuos de auto
    private String color;
    private String modelo;
	private boolean tieneBencina;

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
    public void cargarBencina() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de bencina que desea (95 octanos, 91 octanos): ");
        String tipoBencina = scanner.nextLine();
        
        this.setTieneBencina(true); // Indicar que el auto ahora tiene bencina
        System.out.println("Bencina de tipo " + tipoBencina + " cargada exitosamente.");
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

	@Override
	public String tipoDeBencina() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isTieneBencina() {
		return tieneBencina;
	}

	public void setTieneBencina(boolean tieneBencina) {
		this.tieneBencina = tieneBencina;
	}

}
