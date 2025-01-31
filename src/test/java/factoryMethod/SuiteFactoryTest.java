package factoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leo
 */
public class SuiteFactoryTest {
    @Tag("Creacion de una cabina nula")
    @Test
    void creacionDeSuiteNull() {
        CabinaFactory factoria = new SuiteFactory();
        Cabina cabina = factoria.crearCabina("", "");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos aleatorios")
    @Test
    void creacionDeSuiteDatosAleatorios() {
        CabinaFactory factoria = new SuiteFactory();
        Cabina cabina = factoria.crearCabina("asads", "asdasd");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos correctos")
    @Test
    void creacionDeSuiteDatosCorrectos() {
        CabinaFactory factoria = new SuiteFactory();
        Cabina cabina = factoria.crearCabina("Familiar", "Disponible");
        Object esperado = Suite.class;
                
        assertEquals(esperado, cabina.getClass());
    }
}
