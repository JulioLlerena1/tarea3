package observer;

import java.util.ArrayList;
import java.util.List;

public class GestorEstadoCabina {
    
private List<Observer> cabinasObserver = new ArrayList<>();

    public boolean agregarCabina(Observer cabina) {
        return cabinasObserver.add(cabina);
    }

    public boolean borrarCabina(Observer cabina) {
        return cabinasObserver.remove(cabina);
    }

    public void notificar(String estado) {
        for (Observer cabina : cabinasObserver) {
            cabina.update(estado);
        }
    }

}
