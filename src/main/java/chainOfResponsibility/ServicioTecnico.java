package chainOfResponsibility;

import Utils.Personal;

public class ServicioTecnico extends Personal implements SolucionReporteChain {

    private SolucionReporteChain solucion;


    public ServicioTecnico(int id, String nombre, String telefono) {
        super(id, nombre, telefono);
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
