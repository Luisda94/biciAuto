package modelo;

import java.util.Scanner;

import interfaces.interfazVehiculo;

public class Bicicleta extends Vehiculo implements interfazVehiculo{
	//un solo atribuo a consideracion. 
    private String tipoBicicleta;
    private String tipoCombustible; // Electricidad, Bencina, o Fuerza de las piernas

    // Constructor
    public Bicicleta(int numeroRuedas, String tipoBicicleta,String tipoCombustible) {
        super(numeroRuedas, 0);// se pone 0 porque las bicis no tienen ventanas
        this.tipoBicicleta = tipoBicicleta;
        this.tipoCombustible = null; // Inicializamos como null hasta que se cargue
    }
    
	@Override
	public void cargarBencina() {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de combustible (electricidad, bencina, fuerza de las piernas): ");
        this.tipoCombustible = scanner.nextLine();
        System.out.println("Gracias por preferirnos, " + tipoCombustible + " cargada.");
    }

    // Implementación de los métodos abstractos
    @Override
    public void encender() {
        if (tipoCombustible == null) {//La condicion en null que incializamos al principio,
            System.out.println("Primero debes cargar el tipo de combustible.");
            return;}
    	switch (tipoCombustible.toLowerCase()) {
        case "electricidad":
            System.out.println("La bicicleta eléctrica está encendida.");
            break;
        case "bencina":
            System.out.println("La bicicleta con motor a bencina está encendida.");
            break;
        default:
            System.out.println("Las bicicletas mecánicas no se encienden, ¡empieza a pedalear!");
            break;
    }
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

	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public String setTipoCombustible(String tipoCombustible) {
	       return "Bicicleta tipo " + tipoBicicleta + " que funciona con " + tipoCombustible + ", " + super.toString();
	    }

}
