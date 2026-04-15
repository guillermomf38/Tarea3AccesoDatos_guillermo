/**
 *Clase ValidacionExcepcion.java
 * 
 *@author Guillermo Martin Fueyo
 *@version 1.0
 */



package excepciones;

public class ValidacionExcepcion extends RuntimeException {
	public ValidacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
