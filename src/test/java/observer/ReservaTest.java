package observer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


import factoryMethod.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Leo
 */
public class ReservaTest {
    Reserva reserva;
    GestorReservas gestorReservas;
    CabinaFactory factoryManager;
    GestorEstadoCabina gestorEstado;

    @BeforeEach
    public void setUp() {
        reserva = new Reserva();
        gestorReservas = new GestorReservas();
        factoryManager = new CabinaFamiliarFactory();
        gestorEstado = new GestorEstadoCabina();
        
    }
    
    @Tag("Reserva correcta de cabina")
    @Test
    void reservarCabinaTest() {
        try {
            //gestorReservas.gestionarMenuReservas(factoryManager, gestorEstado, scanner);
            Cabina cabina = factoryManager.crearCabina("Familiar", "Disponible");
            reserva.addObserver(cabina);
            gestorEstado.agregarCabina(cabina);
            reserva.notifyObservers("Reservada");
            assertEquals("factoryMethod.Cabina familiar, estado: Reservada", cabina.obtenerDescripcion(), "factoryMethod.Cabina familiar, estado: Reservada");
        } catch (Exception ex) {
            Logger.getLogger(ReservaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Tag("Reserva null de cabina")
    @Test
    void reservarCabinaNullTest() {
        Cabina cabina = null;
        assertThrows(NullPointerException.class,
            ()->{
            reserva.addObserver(cabina);
            });
    }
    
    @Tag("Reserva con estado invalido aaaa")
    @Test
    void reservarEstadoInvalido() {
        Cabina cabina = factoryManager.crearCabina("Familiar", "Disponible");
        reserva.addObserver(cabina);
        gestorEstado.agregarCabina(cabina);
        assertThrows(Exception.class,
            ()->{
            reserva.notifyObservers("aaaaaaaa");
            });
    }
}
