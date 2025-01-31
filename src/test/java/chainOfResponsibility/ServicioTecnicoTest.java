
package chainOfResponsibility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class ServicioTecnicoTest {
    @Tag("Creacion correcta del servicio tecnico y no lanza ninguna excepcion")
    @Test
    void creacionServicioTecnicoTest() {
            assertDoesNotThrow(() -> new ServicioTecnico(0001000,"Juan","0912345678"));
    }
    
    @Tag("Creacion incorrecta del servicio tecnico Id inválido")
    @Test
    void creacionServicioTecnicoIdFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new ServicioTecnico(-551,"Juan","0912345678"));
    }
    
    @Tag("Creacion incorrecta del servicio tecnico nombre inválido")
    @Test
    void creacionServicioTecnicoNombreFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new ServicioTecnico(0001000,"12345","0912345678"));
    }
    
    @Tag("Creacion incorrecta del servicio tecnico telefono inválido")
    @Test
    void creacionServicioTecnicoTelefonoFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new ServicioTecnico(0001000,"Juan","telefono"));
    }
}
