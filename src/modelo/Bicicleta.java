package modelo;

import java.util.Scanner;

import interfaces.interfazVehiculo;

public class Bicicleta extends Vehiculo implements interfazVehiculo{
	//un solo atribuo a consideracion. 
    private String tipoBicicleta;
    private String tipoCombustible; // Electricidad, Bencina, o Fuerza de las piernas
	private Scanner scanner;

    // Constructor
    public Bicicleta(int numeroRuedas, String tipoBicicleta,String tipoCombustible) {
        super(numeroRuedas, 0);// se pone 0 porque las bicis no tienen ventanas
        this.tipoBicicleta = tipoBicicleta;
        this.tipoCombustible = null; // Inicializamos como null hasta que se cargue
    }
    
	@Override
	public void cargarBencina() {
        if (tipoBicicleta.equalsIgnoreCase("eléctrica") || tipoBicicleta.equalsIgnoreCase("motor a bencina")) {
            System.out.println("Ingrese el tipo de combustible (electricidad o bencina): ");
            this.tipoCombustible = scanner.nextLine();
            System.out.println("Gracias por preferirnos, " + tipoCombustible + " cargada.");
        } else if (tipoBicicleta.equalsIgnoreCase("mecánica")) {
            this.tipoCombustible = "fuerza de las piernas";
            System.out.println("No necesitas combustible para una bicicleta mecánica, ¡solo pedalea!");
        } else {
            System.out.println("Tipo de bicicleta no válido.");
        }
    }
    // Implementación de los métodos abstractos
    @Override
    public void encender() {
        if (tipoBicicleta.equalsIgnoreCase("eléctrica") || tipoBicicleta.equalsIgnoreCase("motor a bencina")) {
            if (tipoCombustible == null || tipoCombustible.isEmpty()) {
                System.out.println("Primero debes cargar el tipo de combustible.");
                return;
            }

            if (tipoCombustible.equalsIgnoreCase("electricidad")) {
                System.out.println("La bicicleta eléctrica está encendida.");
            } else if (tipoCombustible.equalsIgnoreCase("bencina")) {
                System.out.println("La bicicleta con motor a bencina está encendida.");
            } else {
                System.out.println("Tipo de combustible no válido.");
            }
        } else if (tipoBicicleta.equalsIgnoreCase("mecánica")) {
            System.out.println("Las bicicletas mecánicas no se encienden, ¡empieza a pedalear!");
        } else {
            System.out.println("Tipo de bicicleta no válido.");
    }
}
    

    @Override
    public void apagar() {
        System.out.println("Has terminado de pedalear ó se te acabo la energia.");
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

	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public String setTipoCombustible(String tipoCombustible) {
	       return "Bicicleta tipo " + tipoBicicleta + " que funciona con " + tipoCombustible + ", " + super.toString();
	    }

}
