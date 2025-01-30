package chainOfResponsibility;
import factoryMethod.Cabina;

import java.util.ArrayList;
import java.util.List;

class Crucero{

    private int id;
    private List<Cabina> cabinas;

    public Crucero(int id) {
        this.id = id;
        this.cabinas = new ArrayList<>();
    }

    public void listarCabinas() {
        for (Cabina cabina : cabinas) {
            System.out.println(cabina.obtenerDescripcion());
        }
    }

     // Getters
     public int getId() {
        return id;
    }

    public List<Cabina> getCabinas() {
        return cabinas;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCabinas(List<Cabina> cabinas) {
        this.cabinas = cabinas;
    }
}