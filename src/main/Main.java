package main;

import java.util.Scanner;
import modelo.Auto;
import modelo.Bicicleta;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si pedaleas mejoraras tu salud cardiovascular, además te saldrá gratis.");

        Auto miAuto = null;
        Bicicleta miBicicleta = null;
        int opcionPrincipal;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear Auto");
            System.out.println("2. Crear Bicicleta");
            System.out.println("3. Interactuar con el Auto");
            System.out.println("4. Interactuar con la Bicicleta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcionPrincipal) {
            case 1:
                // Crear un Auto
                System.out.println("Ingrese el número de ruedas del auto: ");
                int numeroRuedas = scanner.nextInt();

                System.out.println("Ingrese el número de ventanas del auto: ");
                int cantidadVentanas = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("Ingrese el color del auto: ");
                String color = scanner.nextLine();

                System.out.println("Ingrese la marca o modelo del auto: ");
                String modelo = scanner.nextLine();

                miAuto = new Auto(numeroRuedas, cantidadVentanas, color, modelo);
                System.out.println("¡Auto creado exitosamente!");
                break;

            case 2:
                // Crear una Bicicleta
                System.out.println("Ingrese el tipo de bicicleta (eléctrica, motor a bencina, mecánica): ");
                String tipoBicicleta = scanner.nextLine();

                miBicicleta = new Bicicleta(2, tipoBicicleta);
                System.out.println("¡Bicicleta creada exitosamente!");
                break;



            case 3:
                // Interactuar con el Auto
            	if (miAuto != null) {
                        int opcionAuto;
                        do {
                            System.out.println("\n--- Menú Auto ---");
                            System.out.println("1. Ver información del Auto");
                            System.out.println("2. Encender el Auto");
                            System.out.println("3. Apagar el Auto");
                            System.out.println("4. Cargar Bencina");
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
                                    miAuto.cargarBencina();
                                    break;
                                case 5:
                                    System.out.println("Regresando al menú principal...");
                                    break;
                                default:
                                    System.out.println("Opción inválida, intente nuevamente.");
                            }
                        } while (opcionAuto != 5);
                    } else {
                        System.out.println("Primero debe crear un Auto.");
                    }
                    break;

                case 4:
                    if (miBicicleta != null) {
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
                    } else {
                        System.out.println("Primero debe crear una Bicicleta.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcionPrincipal != 5);

        scanner.close();
    }
}
