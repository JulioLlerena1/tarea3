package chainOfResponsibility;
import java.util.Scanner;
public class Gerencia implements SolucionReporteChain {
    private int ruc;
    private String nombre;
    private String telefono;
    private SolucionReporteChain solucion;

    public Gerencia(int ruc, String nombre, String telefono) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public void procesarReporte() {

        Scanner input = new Scanner(System.in);

        System.out.println("¿Está satisfecho con la solución ofrecida por chainOfResponsibility.Gerencia? (S/N): ");
        String sol = input.nextLine(); //scanner
        input.close();

        if (solucion != null) {
            solucion.procesarReporte();
            
        } else {
            verificarSolucion(sol);
        }
    }

    public void verificarSolucion(String respuesta){

        if(respuesta.equalsIgnoreCase("S")){
            System.out.println("Gracias por su paciencia. Problema resuelto.");
        }else {
            System.out.println("No hay más niveles para escalar el problema.");
        }
        
    }


    // Getters
    public int getRuc() {
        return ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters
    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public void setNextChain(SolucionReporteChain nextChain) {
        this.solucion = nextChain;
    }
}