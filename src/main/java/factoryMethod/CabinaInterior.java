package factoryMethod;

public class CabinaInterior extends Cabina {
    public CabinaInterior(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "factoryMethod.Cabina interior, estado: " + estado;
    }
}
