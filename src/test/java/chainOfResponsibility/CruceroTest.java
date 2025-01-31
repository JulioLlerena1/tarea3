
package chainOfResponsibility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class CruceroTest {
    @Tag("Creacion correcta del crucero y no lanza ninguna excepcion")
    @Test
    void creacionCruceroTest() {
            assertDoesNotThrow(() -> new Crucero(1));
    }
    
    @Tag("Creacion incorrecta del crucero con un id negativo y lanza ninguna excepcion")
    @Test
    void creacionCruceroFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new Crucero(-1));
    }
    
    @Tag("Comprobar que la cantidad de cabinas cuando el crucero se creé sea 0")
    @Test
    void cabinasVaciasCruceroTest() {
        Crucero crucero =  new Crucero(1);
        assertEquals(0,crucero.getCabinas().size());
    }
}
