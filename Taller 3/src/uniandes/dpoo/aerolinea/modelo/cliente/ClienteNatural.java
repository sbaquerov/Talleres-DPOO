package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends ClienteAerolinea {
    
    public static final String TIPO_CLIENTE_NATURAL = "Natural";
    
    private String nombreCliente;
    
    public ClienteNatural(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    @Override
    public String obtenerIdentificador() {
        return TIPO_CLIENTE_NATURAL;
    }

    @Override
    public String obtenerTipoCliente() {
        return TIPO_CLIENTE_NATURAL;
    }
}
