package chainOfResponsibility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class GerenciaTest {
    @Tag("Creacion correcta de la gerencia y no lanza ninguna excepcion")
    @Test
    void creacionGerenciaTest() {
            assertDoesNotThrow(() -> new Gerencia(0001000,"Juan","0912345678"));
    }
    
    @Tag("Creacion incorrecta de la gerencia ruc inválido")
    @Test
    void creacionGerenciaRucFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new Gerencia(-551,"Juan","0912345678"));
    }
    
    @Tag("Creacion incorrecta de la gerencia nombre inválido")
    @Test
    void creacionGerenciaNombreFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new Gerencia(0001000,"12345","0912345678"));
    }
    
    @Tag("Creacion incorrecta de la gerencia telefono inválido")
    @Test
    void creacionGerenciaTelefonoFallidaTest() {
            assertThrows(IllegalArgumentException.class,() -> new Gerencia(0001000,"Juan","telefono"));
    }
}
