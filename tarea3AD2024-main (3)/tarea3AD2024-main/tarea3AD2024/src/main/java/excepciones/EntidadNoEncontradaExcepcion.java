/**
 *Clase EntidadNoEncontradaExcepcion.java
 * 
 *@author Guillermo Martin Fueyo
 *@version 1.0
 */



package excepciones;

public class EntidadNoEncontradaExcepcion extends RuntimeException{

	public EntidadNoEncontradaExcepcion (String mensaje) {
		super(mensaje);
	}
}
