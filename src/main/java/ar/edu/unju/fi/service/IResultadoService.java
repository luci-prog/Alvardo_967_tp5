/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Luciana
 *
 */
public interface IResultadoService {
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
