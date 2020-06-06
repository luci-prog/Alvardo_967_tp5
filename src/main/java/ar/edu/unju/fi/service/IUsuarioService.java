/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author Luciana
 *
 */
public interface IUsuarioService {
	//En esta clase declararemos los métodos necesarios que 
	//serán implementados por la lógica de negocios de nuestro proyecto
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
