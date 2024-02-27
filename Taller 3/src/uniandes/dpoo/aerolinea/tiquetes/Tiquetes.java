package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteAerolinea;

public class TiqueteAerolinea {
    
    private String codigoTiquete;
    private int tarifaTiquete;
    private boolean tiqueteUsado;
    private Vuelo vueloAsociado;
    private ClienteAerolinea clienteComprador;

    public TiqueteAerolinea(String codigo, Vuelo vuelo, ClienteAerolinea clienteComprador, int tarifa) {
        this.codigoTiquete = codigo;
        this.vueloAsociado = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifaTiquete = tarifa;
    }

    public ClienteAerolinea obtenerCliente() {
        return clienteComprador;
    }

    public Vuelo obtenerVuelo() {
        return vueloAsociado;
    }

    public String obtenerCodigo() {
        return codigoTiquete;
    }

    public int obtenerTarifa() {
        return tarifaTiquete;
    }

    public void marcarComoUsado() {
        tiqueteUsado = true;
    }

    public boolean fueUsado() {
        return tiqueteUsado;
    }
}
