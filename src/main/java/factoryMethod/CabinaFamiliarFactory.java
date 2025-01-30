package factoryMethod;

public class CabinaFamiliarFactory implements CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new CabinaFamiliar(tipo, estado);
    }
}
