package factoryMethod;

import java.util.HashMap;
import java.util.Map;

public class CabinaFactory {
    private Map<String, CabinaFactory> factories = new HashMap<>();

    public void registerFactory(String tipo, CabinaFactory factory) {
        factories.put(tipo.toLowerCase(), factory);
    }

    public Cabina crearCabina(String tipo, String estado) {
        CabinaFactory factory = factories.get(tipo.toLowerCase());
        if (factory != null) {
            return factory.crearCabina(tipo, estado);
        } else {
            System.out.println("No se encontró una fábrica para el tipo: " + tipo);
            return null;
        }
    }
}
