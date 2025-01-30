package observer;

import factoryMethod.Cabina;
import factoryMethod.CabinaFactory;
import java.util.*;

public class GestorReservas {
    private List<Reserva> reservas = new ArrayList<>();
    private Map<String, Integer[]> disponibilidad = new HashMap<>();

    public GestorReservas() {
        // Simulación de disponibilidad inicial
        disponibilidad.put("Interior", new Integer[]{5, 3, 2}); // {disponible, ocupada, mantenimiento}
        disponibilidad.put("Familiar", new Integer[]{3, 1, 1});
        disponibilidad.put("Balcón", new Integer[]{4, 2, 0});
        disponibilidad.put("Suite", new Integer[]{2, 1, 1});
    }

    public void imprimirDisponibilidadCabinas() {
        System.out.println("\nDisponibilidad de cabinas:");
        disponibilidad.forEach((tipo, estados) -> {
            System.out.printf("%s - Disponible: %d, Ocupada: %d, Mantenimiento: %d\n",
                    tipo, estados[0], estados[1], estados[2]);
        });
    }

    public void gestionarMenuReservas(
            CabinaFactory factoryManager,
            GestorEstadoCabina gestorEstado,
            Scanner scanner) {
        System.out.println("\nOpciones de Gestión de Reservas:");
        System.out.println("1. Añadir Reserva");
        System.out.println("2. Cancelar Reserva");

        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                realizarReserva(factoryManager, gestorEstado, scanner);
                break;
            case 2:
                cancelarReserva(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    private void realizarReserva
            (CabinaFactory factoryManager,
            GestorEstadoCabina gestorEstado,
            Scanner scanner) {

        imprimirDisponibilidadCabinas();

        System.out.print("Ingrese el tipo de cabina que desea reservar: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su cédula: ");
        int cedula = Integer.parseInt(scanner.nextLine());

        Integer[] estados = disponibilidad.get(tipo);
        if (estados == null || estados[0] <= 0) {
            System.out.println("No hay cabinas disponibles de este tipo.");
            return;
        }

        Cabina nuevaCabina = factoryManager.crearCabina(tipo, "Reservada");
        if (nuevaCabina != null) {
            Reserva reserva = new Reserva(new Cliente(nombre, cedula));
            reserva.addObserver((Observer) nuevaCabina);
            reservas.add(reserva);
            gestorEstado.agregarCabina((Observer) nuevaCabina);

            estados[0]--; // Reducir disponibles
            estados[1]++; // Incrementar ocupadas

            System.out.printf("Reserva creada con éxito a nombre de %s (Cédula: %d). ID de reserva: %d\n",
                    nombre, cedula, reserva.getId());
        } else {
            System.out.println("No se pudo crear la reserva. Intente nuevamente.");
        }
    }
    private void cancelarReserva(Scanner scanner) {
        System.out.print("Ingrese el ID de la reserva que desea cancelar: ");
        int idReserva = Integer.parseInt(scanner.nextLine());

        Reserva reservaACancelar = reservas.stream()
                .filter(reserva -> reserva.getId() == idReserva)
                .findFirst()
                .orElse(null);

        if (reservaACancelar != null) {
            reservas.remove(reservaACancelar);
            System.out.println("Reserva cancelada con éxito.");
        } else {
            System.out.println("No se encontró ninguna reserva con el ID proporcionado.");
        }
    }
}
