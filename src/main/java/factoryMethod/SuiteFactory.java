package factoryMethod;

public class SuiteFactory extends CabinaFactory {
    @Override
    public Cabina crearCabina(String tipo, String estado) {
        return new Suite(tipo, estado);
    }
}
