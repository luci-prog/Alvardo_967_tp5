/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alvarado Romero Luciana Andrea
 *
 */
@Component
public class Equipo {
	
    private String nombre;
    @Autowired   //otra forma seria poner por separado solito un constructor con parametro de estadio "inyeccion de dependencia "
    private Estadio estadio;
    
    //CONSTRUCTOR POR DEFAULT
    /**
     * Constructor sin parametros 
	 */
    public Equipo() {
    	
    }
    
    //CONSTRUCTOR CON PARAMETRO
    
	/**
	 * Constructor con Parametros 
	 * @param nombre 
	 * @param estadio 
	 */
	public Equipo(String nombre, Estadio estadio) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	// DECLARACIONES DE GET Y SET

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	} 
	
	//METODOS

}
