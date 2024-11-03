package modelo;

import java.util.Scanner;

import interfaces.interfazVehiculo;

public class Bicicleta extends Vehiculo implements interfazVehiculo{
	//un solo atribuo a consideracion. 
    private String tipoBicicleta;
  //  private String tipoCombustible; // Electricidad, Bencina, o Fuerza de las piernas
    Scanner scanner = new Scanner(System.in);

    // Constructor									//String tipoCombustible
    public Bicicleta(int numeroRuedas, String tipoBicicleta) {
        super(numeroRuedas, 0);// se pone 0 porque las bicis no tienen ventanas
        this.tipoBicicleta = tipoBicicleta;
//        this.tipoCombustible = null; // Inicializamos como null hasta que se cargue
    }
    
	@Override
	public void cargarBencina() {
		switch (tipoBicicleta.toLowerCase()) {
        case "motor a bencina":
            System.out.println("Ingrese el tipo de combustible (95 octanos, 91 octanos): ");
            String tipoCombustible = scanner.nextLine();
            System.out.println("Combustible de tipo " + tipoCombustible + " cargado exitosamente.");
            break;
        case "eléctrica":
            System.out.println("La bicicleta eléctrica se está cargando. Por favor, espere.");
            break;
        default:
            System.out.println("Si pedaleas mejorarás tu salud cardiovascular, además te saldrá gratis.");
            break;}
    }
    // Implementación de los métodos abstractos
    @Override
    public void encender() {
        switch (tipoBicicleta.toLowerCase()) {
        case "eléctrica":
            System.out.println("La bicicleta eléctrica está encendida. ¡Listo para pedalear con asistencia!");
            break;
        case "motor a bencina":
            System.out.println("La bicicleta con motor a bencina está encendida.");
            break;
        default:
            System.out.println("Las bicicletas mecánicas no se encienden, ¡empieza a pedalear!");
            break;    }
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




}
