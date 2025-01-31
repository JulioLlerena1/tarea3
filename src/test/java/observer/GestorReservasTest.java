package observer;

import factoryMethod.CabinaFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GestorReservasTest {
    private GestorReservas gestorReservas;
    private GestorEstadoCabina gestorEstado;
    private GestorDisponibilidad gestorDisponibilidad;
    private CabinaFactory factoryManager;
    private List<Reserva> reservas = new ArrayList<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        gestorReservas = new GestorReservas();
        gestorEstado = new GestorEstadoCabina();
        gestorDisponibilidad = new GestorDisponibilidad();
        factoryManager = new CabinaFactory();

        Map<String, Integer[]> disponibilidad = new HashMap<>();
        disponibilidad.put("Suite", new Integer[]{5, 0, 0});
        disponibilidad.put("CabinaBalcon", new Integer[]{0, 0, 0});
        gestorDisponibilidad.setDisponibilidad(disponibilidad);

        System.setOut(new PrintStream(outContent));
    }

    @Tag("Cancelacion de una reserva con un id inválido ")
    @Test
    void cancelarReservaIdInvalidoTest(){
        Scanner scanner = new Scanner("999\n"); // ID inexistente
        gestorReservas.cancelarReserva(scanner);
        assertTrue(outContent.toString().contains("No se encontró ninguna reserva con el ID proporcionado."));
    }
    @Tag("Creacion de una reserva exitosa")
    @Test
    void testAñadirReservaExitosa() {
        Scanner scanner = new Scanner("Suite\nJose\n0999995840\n");
        gestorReservas.realizarReserva(factoryManager, gestorEstado, scanner, gestorDisponibilidad);
        assertTrue(outContent.toString().contains("Reserva creada con éxito a nombre de Jose"));
    }
    @Tag("Creacion de una reserva tipo inválido")
    @Test
    void testAñadirReservaTipoInvalido() {
        Scanner scanner = new Scanner("Premium\nJohn\n0934995840\n");
        gestorReservas.realizarReserva(factoryManager, gestorEstado, scanner, gestorDisponibilidad);
        assertTrue(outContent.toString().contains("No hay cabinas disponibles de este tipo."));
    }
}