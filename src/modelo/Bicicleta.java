package modelo;

import interfaces.interfazVehiculo;

public class Bicicleta extends Vehiculo implements interfazVehiculo{
	//un solo atribuo a consideracion. 
    private String tipoBicicleta;

    // Constructor
    public Bicicleta(int numeroRuedas, int cantidadVentanas, String tipoBicicleta) {
        super(numeroRuedas, cantidadVentanas);
        this.tipoBicicleta = tipoBicicleta;
    }
    

    // Implementación de los métodos abstractos
    @Override
    public void encender() {
        System.out.println("Estás listo para pedalear.");
    }

    @Override
    public void apagar() {
        System.out.println("Has terminado de pedalear.");
    }

    // Getters y Setters
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta tipo " + tipoBicicleta + ", " + super.toString();
    }


	@Override
	public String tipoDeBencina() {
		// TODO Auto-generated method stub
		return null;
	}

}
