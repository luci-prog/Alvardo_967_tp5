/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Luciana
 *
 */
public interface IResultado {
	
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
