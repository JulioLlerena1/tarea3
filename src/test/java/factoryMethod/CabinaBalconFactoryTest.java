package factoryMethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leo
 */
public class CabinaBalconFactoryTest {
    @Tag("Creacion de una cabina nula")
    @Test
    void creacionDeCabinaBalconNull() {
        CabinaFactory factoria = new CabinaBalconFactory();
        Cabina cabina = factoria.crearCabina("", "");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos aleatorios")
    @Test
    void creacionDeCabinaBalconDatosAleatorios() {
        CabinaFactory factoria = new CabinaBalconFactory();
        Cabina cabina = factoria.crearCabina("asads", "asdasd");
        Cabina esperado = null;
        assertEquals(esperado, cabina);
    }
    
    @Tag("Creacion de una cabina con datos correctos")
    @Test
    void creacionDeCabinaBalconDatosCorrectos() {
        CabinaFactory factoria = new CabinaBalconFactory();
        Cabina cabina = factoria.crearCabina("Balcon", "Disponible");
        Object esperado = CabinaBalcon.class;
                
        assertEquals(esperado, cabina.getClass());
    }
}
