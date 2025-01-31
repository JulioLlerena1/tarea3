package factoryMethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class CabinaInteriorFactoryTest {
    @Tag("Creacion de una cabina nula")
    @Test
    void creacionDeCabinaInteriorNull() {
        CabinaFactory factoria = new CabinaInteriorFactory();
        Cabina cabina = factoria.crearCabina("", "");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos aleatorios")
    @Test
    void creacionDeCabinaInteriorDatosAleatorios() {
        CabinaFactory factoria = new CabinaInteriorFactory();
        Cabina cabina = factoria.crearCabina("asads", "asdasd");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos correctos")
    @Test
    void creacionDeCabinaInteriorDatosCorrectos() {
        CabinaFactory factoria = new CabinaInteriorFactory();
        Cabina cabina = factoria.crearCabina("Familiar", "Disponible");
        Object esperado = CabinaInterior.class;
                
        assertEquals(esperado, cabina.getClass());
    }
}
