package factoryMethod;

public class SuiteFactory implements CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new Suite(tipo, estado);
    }
}
