package chainOfResponsibility;


public class ServicioTecnico implements SolucionReporteChain {
    private int id;
    private String nombre;
    private SolucionReporteChain solucion;


    public ServicioTecnico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
