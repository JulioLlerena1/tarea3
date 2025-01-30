package chainOfResponsibility;
import Utils.Entidad;
import Utils.InputHelper;
public class Gerencia extends Entidad implements SolucionReporteChain {
    private String telefono;
    private SolucionReporteChain solucion;

    public Gerencia(int cedula, String nombre, String telefono) {
        super(cedula, nombre);
        this.telefono = telefono;
    }

    @Override
    public void procesarReporte() {

        String input = InputHelper.readLine("¿Está satisfecho con la solución ofrecida por chainOfResponsibility.Gerencia? (S/N): ");

        if (solucion != null) {
            solucion.procesarReporte();
            
        } else {
            verificarSolucion(input);
        }
    }

    public void verificarSolucion(String respuesta){

        if(respuesta.equalsIgnoreCase("S")){
            System.out.println("Gracias por su paciencia. Problema resuelto.");
        }else {
            System.out.println("No hay más niveles para escalar el problema.");
        }
        
    }

    @Override
    public void setNextChain(SolucionReporteChain nextChain) {
        this.solucion = nextChain;
    }
}