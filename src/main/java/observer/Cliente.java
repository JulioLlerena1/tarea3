package observer;

public class Cliente {

    private String nombreCliente;
    private int cedulaCliente;

    public Cliente(String nombreCliente, int cedulaCliente) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }
    
}
