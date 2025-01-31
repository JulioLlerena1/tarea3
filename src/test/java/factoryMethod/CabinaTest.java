/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leo
 */
public class CabinaTest {

    @Tag("Verificar que muestre la descripcion de la cabina")
    @Test
    void verificarDescripcionCabina() {
        Cabina cabina = new CabinaInterior("Interior", "Disponible");
        
        assertTrue(cabina.obtenerDescripcion().contains("factoryMethod.Cabina interior, estado:"));
    }
}
