package chainOfResponsibility;

import Utils.Entidad;
import factoryMethod.Cabina;

import java.util.ArrayList;
import java.util.List;

class Crucero extends Entidad {
    private List<Cabina> cabinas;

    public Crucero(int id, String nombre) {
        super(id, nombre);
        this.cabinas = new ArrayList<>();
    }

    public void agregarCabina(Cabina cabina) {
        cabinas.add(cabina);
    }

    public void listarCabinas() {
        for (Cabina cabina : cabinas) {
            System.out.println(cabina.obtenerDescripcion());
        }
    }
}