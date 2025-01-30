package observer;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private static int idCounter = 1;
    private int id;
    private Cliente cliente;
    private List<Observer> cabinasReservadasObserver = new ArrayList<>();

    public Reserva(Cliente cliente) {
        this.cliente = cliente;
        this.id = idCounter++;
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
