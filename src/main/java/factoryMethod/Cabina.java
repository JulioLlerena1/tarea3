package factoryMethod;

import observer.Observer;

public abstract class Cabina implements Observer {
    protected String tipo;
    protected String estado;

    public Cabina(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public abstract String obtenerDescripcion();

    @Override
    public void update(String estado) {
        this.estado = estado;
        System.out.println("Actualizado a estado: " + estado);
    }
}
