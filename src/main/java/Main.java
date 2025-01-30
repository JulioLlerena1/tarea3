
import chainOfResponsibility.Gerencia;
import chainOfResponsibility.ServicioTecnico;
import factoryMethod.*;
import observer.GestorEstadoCabina;
import observer.GestorReservas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEstadoCabina gestorEstado = new GestorEstadoCabina();
        GestorReservas gestorReservas = new GestorReservas();
        ServicioTecnico servicioTecnico = new ServicioTecnico(5678, "Servicio Técnico");
        Gerencia gerencia = new Gerencia(4321, "Gerencia del Crucero", "123-456-789");
        Scanner scanner = new Scanner(System.in);

        servicioTecnico.setNextChain(gerencia);

        CabinaFactoryManager factoryManager = new CabinaFactoryManager();
        factoryManager.registerFactory("Interior", new CabinaInteriorFactory());
        factoryManager.registerFactory("Familiar", new CabinaFamiliarFactory());
        factoryManager.registerFactory("Balcón", new CabinaBalconFactory());
        factoryManager.registerFactory("Suite", new SuiteFactory());

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Gestionar Reservas");
            System.out.println("2. Reportar Incidentes");
            System.out.println("3. Salir");

            System.out.println("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    gestorReservas.gestionarMenuReservas(factoryManager, gestorEstado, scanner);
                    break;
                case 2:
                    System.out.println("Describa el incidente: ");
                    String descripcion = scanner.nextLine();
                    System.out.println("Incidente reportado: " + descripcion);
                    servicioTecnico.procesarReporte();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            scanner.close();
        }
    }
}

