/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Luciana
 *
 */
@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);

	@Override
	public void guardar() {
		// Accion ejecutada para guardar un objeto equipo en la BD
		LOG.info("El equipo fue guardado "+equipo.getNombre());
	}

	@Override
	public Equipo mostrar() {
		// Se recupera todos los datos del objeto equipo
		LOG.info("se mostrara los datos de equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se eliminara los datos de equipo
		LOG.info("El equipo fue eliminado "+ equipo.getNombre());

	}

	@Override
	public Equipo modificar() {
		// Se modificara de la BD  los datos de equipo
		LOG.info("el equipo fue modificado");
		return equipo;
	}

}
