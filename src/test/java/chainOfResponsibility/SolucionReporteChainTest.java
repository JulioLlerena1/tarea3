/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResponsibility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leo
 */
public class SolucionReporteChainTest {
    private ServicioTecnico servicioTecnico;
    private Gerencia gerencia;
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private PrintStream originalOut = System.out;
    private PrintStream originalErr = System.err;
    String saltoDeLinea = System.lineSeparator();
    
    @BeforeEach
    public void setUp() {
        servicioTecnico = new ServicioTecnico(0001000,"Juan","0912345678");
    }
    
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @Tag("Verificar que sea ya no haya solucion")
    @Test
    void reportesSinSolucion() {
        setUpStreams();
        servicioTecnico.procesarReporte();
        
        assertEquals("Tu petición será revisada. Procesando reporte..." + saltoDeLinea +
"No hay más niveles para escalar el problema.", outContent.toString().trim());
    }
    @Tag("Verificar que se procesa correctamente el reporte")
    @Test
    void reporteConSolucion(){
        setUpStreams();
        servicioTecnico.procesarReporte();

        assertEquals("Tu petición será revisada. Procesando reporte..." + saltoDeLinea +
                "No hay más niveles para escalar el problema.", outContent.toString().trim());
 }
}
