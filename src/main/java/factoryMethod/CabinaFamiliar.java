package factoryMethod;

public class CabinaFamiliar extends Cabina {
    public CabinaFamiliar(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "factoryMethod.Cabina familiar, estado: " + estado;
    }
}
