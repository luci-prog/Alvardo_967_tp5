/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Luciana
 *
 */
@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);


	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto estadio en la BD
		LOG.info("El estadio fue guardado "+ estadio.getNombre()+", "+ estadio.getCiudad());

	}

	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos del estadio
		LOG.info("muestra los datos del estadio ");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto de la BD
		LOG.info("el estadio fue eliminado "+ estadio.getNombre()+", " + estadio.getCiudad());

	}

	@Override
	public Estadio modificar() {
		//Se modificara los datos del estadio
		LOG.info("Modificara los datos del estadio ");
		return estadio;
	}

}
