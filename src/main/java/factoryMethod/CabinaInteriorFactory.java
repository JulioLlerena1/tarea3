package factoryMethod;

public class CabinaInteriorFactory extends CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new CabinaInterior(tipo, estado);
    }
}
