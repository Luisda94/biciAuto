package main;

import java.util.Scanner;

import modelo.Auto;
import modelo.Bicicleta;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si pedaleas mejoraras tu salud cardiovascular, además te saldrá gratis.");

        // Instancia de Auto y Bicicleta
        Auto miAuto = new Auto(4, 4, "Rojo", "Toyota");
        
      
        Bicicleta miBicicleta = new Bicicleta(2, "Eléctrica");
        miBicicleta.cargarBencina(); // Permite al usuario cargar el combustible
        miBicicleta.encender(); // Ahora debería encenderse correctamente

        int opcionPrincipal;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Interactuar con el Auto");
            System.out.println("2. Interactuar con la Bicicleta");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    int opcionAuto;
                    do {
                        System.out.println("\n--- Menú Auto ---");
                        System.out.println("1. Ver información del Auto");
                        System.out.println("2. Encender el Auto");
                        System.out.println("3. Apagar el Auto");
                        System.out.println("4. cargar bencina");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionAuto = scanner.nextInt();

                        switch (opcionAuto) {
                            case 1:
                                System.out.println(miAuto);
                                break;
                            case 2:
                                miAuto.encender();
                                break;
                            case 3:
                                miAuto.apagar();
                                break;
                            case 4:
                                System.out.println("Gracias por preferirnos bencina " + miAuto.tipoDeBencina()+" cargada");
                                break;
                            case 5:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida, intente nuevamente.");
                        }
                    } while (opcionAuto != 5);
                    break;

                case 2:
                    int opcionBici;
                    do {
                        System.out.println("\n--- Menú Bicicleta ---");
                        System.out.println("1. Ver información de la Bicicleta");
                        System.out.println("2. Empezar a pedalear");
                        System.out.println("3. Dejar de pedalear");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionBici = scanner.nextInt();

                        switch (opcionBici) {
                            case 1:
                                System.out.println(miBicicleta);
                                break;
                            case 2:
                            	miBicicleta.encender();
                                break;
                            case 3:
                            	miBicicleta.apagar();
                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida, intente nuevamente.");
                        }
                    } while (opcionBici != 4);
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcionPrincipal != 3);

        scanner.close();
    }

}
