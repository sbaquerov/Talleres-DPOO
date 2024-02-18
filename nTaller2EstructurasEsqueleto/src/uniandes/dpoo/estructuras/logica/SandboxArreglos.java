package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copia_enteros = arregloEnteros.clone();
    	return copia_enteros;
    
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copia_cadenas = arregloCadenas.clone();
    	return copia_cadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int cantidad_enteros = arregloEnteros.length;
    	return cantidad_enteros;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int cantidad_cadenas = arregloCadenas.length;
    	return cantidad_cadenas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int aumentar_tamanio_enteros = arregloEnteros.length + 1;
    	int[] arreglo_int = new int[aumentar_tamanio_enteros];
    	System.arraycopy(arregloEnteros, 0, arreglo_int, 0, arregloEnteros.length);
        arreglo_int[aumentar_tamanio_enteros - 1] = entero;
        arregloEnteros = arreglo_int;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena ) {
        int aumentar_tamanio_cadena = arregloCadenas.length + 1;
        String[] arreglo_cad = new String[aumentar_tamanio_cadena];
        System.arraycopy(arregloCadenas, 0, arreglo_cad, 0, arregloCadenas.length);
        arreglo_cad[aumentar_tamanio_cadena - 1] = cadena;
        arregloCadenas = arreglo_cad;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int j = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != valor) {
                arregloEnteros[j++] = arregloEnteros[i];
            }
        }
        int[] nuevo_arreglo_int = new int[j];
        System.arraycopy(arregloEnteros, 0, nuevo_arreglo_int, 0, j);
        arregloEnteros = nuevo_arreglo_int;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	
    	int j = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (!arregloCadenas[i].equals(cadena)) {
                arregloCadenas[j++] = arregloCadenas[i];
            }
        }
        String[] nuevo_arreglo_cadena = new String[j];
        System.arraycopy(arregloCadenas, 0, nuevo_arreglo_cadena, 0, j);
        arregloCadenas = nuevo_arreglo_cadena;

    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int aumentar_tamanio = arregloEnteros.length + 1;
        posicion = Math.max(0, Math.min(posicion, arregloEnteros.length));
        int[] nuevo_arreglo_int = new int[aumentar_tamanio];        
        System.arraycopy(arregloEnteros, 0, nuevo_arreglo_int, 0, posicion);        
        nuevo_arreglo_int[posicion] = entero;        
        System.arraycopy(arregloEnteros, posicion, nuevo_arreglo_int, posicion + 1, arregloEnteros.length - posicion);
        arregloEnteros = nuevo_arreglo_int;

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion < 0 || posicion >= arregloEnteros.length) {
            return;
        }
        int reducir_tamanio = arregloEnteros.length - 1;
        int[] nuevo_arreglo_int = new int[reducir_tamanio];
        System.arraycopy(arregloEnteros, 0, nuevo_arreglo_int, 0, posicion);
        System.arraycopy(arregloEnteros, posicion + 1, nuevo_arreglo_int, posicion, arregloEnteros.length - posicion - 1);
        arregloEnteros = nuevo_arreglo_int;

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros(double[] valores) {
        int[] nuevo_arreglo_int = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            int rounded_int = (int) Math.round(valores[i]);
            nuevo_arreglo_int[i] = rounded_int;
        }
        arregloEnteros = nuevo_arreglo_int;
    }


    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    
    public void reiniciarArregloCadenas(Object[] objetos) {
        String[] nuevo_arreglo_cadena = new String[objetos.length];
        int indice = 0;
        for (Object objeto : objetos) {
        	nuevo_arreglo_cadena[indice++] = objeto.toString();
        }
        arregloCadenas = nuevo_arreglo_cadena;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    
    
    public void volverPositivos() {
        int[] nuevo_arreglo_int = new int[arregloEnteros.length];
        for (int i = 0; i < arregloEnteros.length; i++) {
        	nuevo_arreglo_int[i] = Math.abs(arregloEnteros[i]);
        }
        arregloEnteros = nuevo_arreglo_int;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	
    	Arrays.sort(arregloCadenas);

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    
    
    public int contarAparicionesInt(int valor) {
        int contador = 0;
        for (int num : arregloEnteros) {
            if (num == valor) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    

    public int contarAparicionesCadena(String cadena) {
        int contador = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i].equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador;
    }
    
    
   

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero(int valor) {
        int apariciones = 0;

        for (int num : arregloEnteros) {
            if (num == valor) {
            	apariciones++;
            }
        }

        int[] nuevo_arreglo_int = new int[apariciones];

        int indice_pos = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
            	nuevo_arreglo_int[indice_pos++] = i;
            }
        }

        return nuevo_arreglo_int;
    }


    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros() {
        if (arregloEnteros == null || arregloEnteros.length == 0) {
            int[] arreglo_vacio = new int[0];
            return arreglo_vacio;
        }

        int rango = 2;
        int[] nuevo_arreglo_int = new int[rango];
        int min = arregloEnteros[0];
        int max = arregloEnteros[0];

        for (int i = 1; i < arregloEnteros.length; i++) {
            if (min > arregloEnteros[i]) {
                min = arregloEnteros[i];
            }
            if (max < arregloEnteros[i]) {
                max = arregloEnteros[i];
            }
        }

        nuevo_arreglo_int[0] = min;
        nuevo_arreglo_int[1] = max;
        return nuevo_arreglo_int;
    }


    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        return null;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        return -1;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        return false;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
        return false;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {

    }

}
