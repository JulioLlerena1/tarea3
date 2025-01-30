package observer;

import java.util.HashMap;
import java.util.Map;

public class GestorDisponibilidad {
    
        private Map<String, Integer[]> disponibilidad = new HashMap<>();

    public GestorDisponibilidad() {
        // Simulación de disponibilidad inicial
        disponibilidad.put("Interior", new Integer[]{5, 3, 2}); // {disponible, ocupada, mantenimiento}
        disponibilidad.put("Familiar", new Integer[]{3, 1, 1});
        disponibilidad.put("Balcón", new Integer[]{4, 2, 0});
        disponibilidad.put("Suite", new Integer[]{2, 1, 1});
    }

    public boolean comprobarDisponibilidad(Integer[] estados) {

        if (estados == null || estados[0] <= 0) {
            System.out.println("No hay cabinas disponibles de este tipo.");
            return false;
        }

        return true;

    }

    public Map<String, Integer[]> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Map<String, Integer[]> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
