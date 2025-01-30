package factoryMethod;

public class CabinaBalconFactory extends CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new CabinaBalcon(tipo, estado);
    }
}
