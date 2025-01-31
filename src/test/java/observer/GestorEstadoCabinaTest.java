
package observer;
import factoryMethod.Cabina;
import factoryMethod.CabinaFactory;
import factoryMethod.CabinaFamiliarFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class GestorEstadoCabinaTest {
    Reserva reserva;
    GestorReservas gestorReservas;
    CabinaFactory factoryManager;
    GestorEstadoCabina gestorEstado;
    Cabina cabina;
    @BeforeEach
    public void setUp() {
        reserva = new Reserva();
        gestorReservas = new GestorReservas();
        factoryManager = new CabinaFamiliarFactory();
        gestorEstado = new GestorEstadoCabina();
        cabina = factoryManager.crearCabina("Familiar", "Disponible");
        
    }
    
    @Tag("Agregar cabina correctamente a la lista de cabinas")
    @Test
    void agregarCabinaTest() {
        assertTrue(gestorEstado.agregarCabina(cabina));
    }
    
    @Tag("Agregar cabina incorrectaamente a la lista de cabinas")
    @Test
    void agregarCabinaNullTest() {
        assertFalse(gestorEstado.agregarCabina(null));
    }
    
    @Tag("Borrar cabina correctamente a la lista de cabinas")
    @Test
    void removerCabinaTest() {
        assertTrue(gestorEstado.borrarCabina(cabina));
    }
    
    @Tag("Borrar cabina incorrectamente a la lista de cabinas")
    @Test
    void removerCabinaNullTest() {
        assertFalse(gestorEstado.borrarCabina(null));
    }
}
