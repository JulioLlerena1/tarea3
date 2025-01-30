package factoryMethod;

public class CabinaFamiliarFactory extends CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new CabinaFamiliar(tipo, estado);
    }
}
