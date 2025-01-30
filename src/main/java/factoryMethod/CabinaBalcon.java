package factoryMethod;

public class CabinaBalcon extends Cabina {
    public CabinaBalcon(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "factoryMethod.Cabina con balcón, estado: " + estado;
    }
}
