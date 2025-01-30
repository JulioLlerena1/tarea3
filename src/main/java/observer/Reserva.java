package observer;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private static int idCounter = 1;
    private int id;
    private List<Observer> cabinasReservadasObserver;

    public Reserva() {
        this.id = idCounter++;
        cabinasReservadasObserver = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addObserver(Observer observer) {
        cabinasReservadasObserver.add(observer);
    }

    public void removeObserver(Observer observer) {
        cabinasReservadasObserver.remove(observer);
    }

    public void notifyObservers(String estado) {
        for (Observer observer : cabinasReservadasObserver) {
            observer.update(estado);
        }
    }

}
