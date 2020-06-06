/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Resultado;


/**
 * @author Luciana
 *
 */
@Service
@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	
	//----------------------------------------------------------------------------
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);

	//------------------------------------------------------------------------
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto resultado en la BD
		LOG.info("El resultado fue guardado "+ resultado.getGolesEquipo1()+ ", "+ resultado.getGolesEquipo2());

	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos del resultado
		LOG.info("Mostrar los resultados del equipo");
		return resultado;
	}

	@Override
	public void eliminar() {
		// accion ejecutada para eliminar un objeto resultado en la BD
		LOG.info("el resultado fue eliminado " + resultado.getEquipo1()+ ", " + resultado.getEquipo2());

	}

	@Override
	public Resultado modificar() {
		// Se modifica todos los datos del resultado
	    LOG.info("modificar los datos del resultado");
		return resultado;
	}

}
