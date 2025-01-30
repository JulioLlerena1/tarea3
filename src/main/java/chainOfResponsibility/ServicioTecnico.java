package chainOfResponsibility;
import Utils.Entidad;

public class ServicioTecnico extends Entidad implements SolucionReporteChain {
    private SolucionReporteChain solucion;

    public ServicioTecnico(int cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public void procesarReporte() {
        System.out.println("Tu petición será revisada. Procesando reporte...");
        if (solucion != null) {
            solucion.procesarReporte();
        } else {
            System.out.println("No hay más niveles para escalar el problema.");
        }
    }

    @Override
    public void setNextChain(SolucionReporteChain nextChain) {
        this.solucion = nextChain;
    }
}
