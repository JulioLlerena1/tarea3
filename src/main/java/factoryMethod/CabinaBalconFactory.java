package factoryMethod;

public class CabinaBalconFactory implements CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new CabinaBalcon(tipo, estado);
    }
}
