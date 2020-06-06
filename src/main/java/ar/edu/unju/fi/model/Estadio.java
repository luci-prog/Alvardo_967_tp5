/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * @author Alvarado Romero Luciana Andrea
 *
 */
@Component
public class Estadio {
	private String nombre;
	private LocalDate fechaFundacion;
	private String ciudad;
	private int capacidad;
	private String dirección;
	
	/**
	 * constructor sin parametros 
	 */
	public Estadio() {
		
	}
	//CONSTRUCTOR CON PARAMETROS 
	/**
	 * Constructor con parametros 
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param dirección
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String dirección) {
		super();
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.dirección = dirección;
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
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @return the dirección
	 */
	public String getDirección() {
		return dirección;
	}
	/**
	 * @param dirección the dirección to set
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

}
