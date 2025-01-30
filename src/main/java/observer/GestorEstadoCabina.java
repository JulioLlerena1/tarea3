package observer;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GestorEstadoCabina {
    
private List<Observer> cabinasObserver = new ArrayList<>();

    public void agregarCabina(Observer cabina) {
        cabinasObserver.add(cabina);
    }

    public void borrarCabina(Observer cabina) {
        cabinasObserver.remove(cabina);
    }

    public void notificar(String estado) {
        for (Observer cabina : cabinasObserver) {
            cabina.update(estado);
        }
    }

}
