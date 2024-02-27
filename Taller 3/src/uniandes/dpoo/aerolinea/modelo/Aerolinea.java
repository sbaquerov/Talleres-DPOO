package uniandes.dpoo.aerolinea.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.persistencia.CentralPersistencia;
import uniandes.dpoo.aerolinea.persistencia.IPersistenciaAerolinea;
import uniandes.dpoo.aerolinea.persistencia.IPersistenciaTiquetes;
import uniandes.dpoo.aerolinea.persistencia.TipoInvalidoException;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * En esta clase se organizan todos los aspectos relacionados con una Aerolínea.
 * 
 * Por un lado, esta clase cumple un rol central como estructurador para todo el resto de elementos: directa o indirectamente, todos están contenidos y se pueden acceder a
 * través de la clase Aerolínea.
 * 
 * Por otro lado, esta clase implementa algunas funcionalidades adicionales a su rol como estructurador, para lo cual se apoya en las otras clases que hacen parte del
 * proyecto.
 */
public class Aerolinea {
    
    private List<Avion> flotaAviones;
    
    private Map<String, Ruta> mapaRutas;
    
    private List<Vuelo> listaVuelos;
    
    private Map<String, Cliente> mapaClientes;

    /**
     * Construye una nueva aerolínea con un nombre e inicializa todas las contenedoras con estructuras vacías
     */
    public Aerolinea() {
        flotaAviones = new LinkedList<Avion>();
        mapaRutas = new HashMap<String, Ruta>();
        listaVuelos = new LinkedList<Vuelo>();
        mapaClientes = new HashMap<String, Cliente>();
    }

    // ************************************************************************************
    //
    // Estos son los métodos que están relacionados con la manipulación básica de los atributos
    // de la aerolínea (consultar, agregar)
    //
    // ************************************************************************************

    /**
     * Agrega una nueva ruta a la aerolínea
     * @param ruta
     */
    public void agregarRuta(Ruta ruta) {
        this.mapaRutas.put(ruta.getCodigoRuta(), ruta);
    }

    /**
     * Agrega un nuevo avión a la aerolínea
     * @param avion
     */
    public void agregarAvion(Avion avion) {
        this.flotaAviones.add(avion);
    }

    /**
     * Agrega un nuevo cliente a la aerolínea
     * @param cliente
     */
    public void agregarCliente(Cliente cliente) {
        this.mapaClientes.put(cliente.getIdentificador(), cliente);
    }

    /**
     * Verifica si ya existe un cliente con el identificador dado
     * @param identificadorCliente
     * @return Retorna true si ya existía un cliente con el identificador, independientemente de su tipo
     */
    public boolean existeCliente(String identificadorCliente) {
        return this.mapaClientes.containsKey(identificadorCliente);
    }

    /**
     * Busca el cliente con el identificador dado
     * @param identificadorCliente
     * @return Retorna el cliente con el identificador, o null si no existía
     */
    public Cliente obtenerCliente(String identificadorCliente) {
        return this.mapaClientes.get(identificadorCliente);
    }

    /**
     * Retorna todos los aviones de la aerolínea
     * @return
     */
    public Collection<Avion> obtenerAviones() {
        return flotaAviones;
    }

    /**
     * Retorna todas las rutas disponibles para la aerolínea
     * @return
     */
    public Collection<Ruta> obtenerRutas() {
        return mapaRutas.values();
    }

    /**
     * Retorna la ruta de la aerolínea que tiene el código dado
     * @param codigoRuta El código de la ruta buscada
     * @return La ruta con el código, o null si no existe una ruta con ese código
     */
    public Ruta obtenerRuta(String codigoRuta) {
        return mapaRutas.get(codigoRuta);
    }

    /**
     * Retorna todos los vuelos de la aerolínea
     * @return
     */
    public Collection<Vuelo> obtenerVuelos() {
        return listaVuelos;
    }

    /**
     * Busca un vuelo dado el código de la ruta y la fecha del vuelo.
     * @param codigoRuta
     * @param fechaVuelo
     * @return Retorna el vuelo que coincide con los parámetros dados. Si no lo encuentra, retorna null.
     */
    public Vuelo obtenerVuelo(String codigoRuta, String fechaVuelo) {
        for (Vuelo vuelo : listaVuelos) {
            String ruta = vuelo.obtenerRuta().getCodigoRuta();
            String fecha = vuelo.obtenerFechaVuelo();
            if (ruta.equals(codigoRuta) && fecha.equals(fechaVuelo)) {
                return vuelo;
            }
        }
        return null;
    }

    /**
     * Retorna todos los clientes de la aerolínea
     * @return
     */
    public Collection<Cliente> obtenerClientes() {
        return mapaClientes.values();
    }

    /**
     * Retorna todos los tiquetes de la aerolínea, los cuales se recolectan vuelo por vuelo
     * @return
     */
    public Collection<Tiquete> obtenerTiquetes() {
        // TODO implementar
        return null;
    }

    // ************************************************************************************
    //
    // Estos son los métodos que están relacionados con la persistencia de la aerolínea
    //
    // ************************************************************************************

    /**
     * Carga toda la información de la aerolínea a partir de un archivo
     * @param archivo El nombre del archivo.
     * @param tipoArchivo El tipo del archivo. Puede ser CentralPersistencia.JSON o CentralPersistencia.PLAIN.
     * @throws TipoInvalidoException Se lanza esta excepción si se indica un tipo de archivo inválido
     * @throws IOException Lanza esta excepción si hay problemas leyendo el archivo
     * @throws InformacionInconsistenteException Lanza esta excepción si durante la carga del archivo se encuentra información que no es consistente
     */
    public void cargarAerolinea(String archivo, String tipoArchivo) throws TipoInvalidoException, IOException, InformacionInconsistenteException {
        // TODO implementar
    }

    /**
     * Salva la información de la aerlínea en un archivo
     * @param archivo El nombre del archivo.

