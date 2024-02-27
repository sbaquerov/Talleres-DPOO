package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class ClienteAerolinea {
    
    public ClienteAerolinea() {
        
    }
    
    public String obtenerTipoCliente() {
        return null;
    }
    
    public String obtenerIdentificador() {
        return null;
    }
    
    public void agregarTiquete(Tiquete tiquete) {
        
    }
    
    public int calcularValorTotalTiquetes() {
        return 0;
    }
    
    public void usarTiquetes(Vuelo vuelo) {
        
    }
}
