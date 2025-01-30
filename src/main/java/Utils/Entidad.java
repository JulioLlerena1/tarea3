package Utils;

public abstract class Entidad {
    private int cedula;
    private String nombre;

    public Entidad(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
}
