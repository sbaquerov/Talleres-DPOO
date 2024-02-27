package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private String fechaVuelo;
    
    public Vuelo(Ruta rutaVuelo, String fechaVuelo, Avion avionVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Ruta obtenerRutaVuelo() {
        return null;
    }

    public String obtenerFechaVuelo() {
        return fechaVuelo;
    }

    public Avion obtenerAvionVuelo() {
        return null;
    }

    public Collection<Tiquete> obtenerTiquetesVuelo() {
        return null;
    }

    public int venderTiquetesVuelo(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

