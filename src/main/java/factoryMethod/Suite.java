package factoryMethod;

public class Suite extends Cabina {
    public Suite(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "factoryMethod.Suite con estado: " + estado;
    }
}
