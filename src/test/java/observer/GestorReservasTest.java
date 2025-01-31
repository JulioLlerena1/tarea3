package observer;

import factoryMethod.CabinaFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GestorReservasTest {
    private CabinaFactory factoryManager;
    private GestorReservas gestorReservas;
    private GestorEstadoCabina gestorEstado;
    private GestorDisponibilidad gestor;
    private Scanner scanner;
    @Tag("Cancelación de una reserva con un id inválido ")
    @Test
    void reservaIdInvalidoTest(){

    }
}