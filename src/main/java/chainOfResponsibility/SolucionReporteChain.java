package chainOfResponsibility;

public interface SolucionReporteChain {

    void setNextChain(SolucionReporteChain solucion);

    void procesarReporte();
    
}