package uniandes.dpoo.aerolinea.modelo;

public class Avion {
    
    private String nombreAeronave;
    
    private int capacidadAsientos;
    
    public Avion(String nombreAeronave, int capacidadAsientos) {
        this.nombreAeronave = nombreAeronave;
        this.capacidadAsientos = capacidadAsientos;
    }

    public String obtenerNombreAeronave() {
        return nombreAeronave;
    }

    public int obtenerCapacidadAsientos() {
        return capacidadAsientos;
    }
}
