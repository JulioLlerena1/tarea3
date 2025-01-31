package factoryMethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class CabinaFamiliarFactoryTest {
    @Tag("Creacion de una cabina nula")
    @Test
    void creacionDeCabinaFamiliarNull() {
        CabinaFactory factoria = new CabinaFamiliarFactory();
        Cabina cabina = factoria.crearCabina("", "");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos aleatorios")
    @Test
    void creacionDeCabinaFamiliarDatosAleatorios() {
        CabinaFactory factoria = new CabinaFamiliarFactory();
        Cabina cabina = factoria.crearCabina("asads", "asdasd");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos correctos")
    @Test
    void creacionDeCabinaFamiliarDatosCorrectos() {
        CabinaFactory factoria = new CabinaFamiliarFactory();
        Cabina cabina = factoria.crearCabina("Familiar", "Disponible");
        Object esperado = CabinaFamiliar.class;
                
        assertEquals(esperado, cabina.getClass());
    }
}
