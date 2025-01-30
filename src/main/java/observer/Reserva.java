package observer;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private static int idCounter = 1;
    private int id;
    private String nombreCliente;
    private int cedulaCliente;
    private List<Observer> cabinasReservadasObserver = new ArrayList<>();

    public Reserva(String nombreCliente, int cedulaCliente) {
        this.id = idCounter++;
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
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
