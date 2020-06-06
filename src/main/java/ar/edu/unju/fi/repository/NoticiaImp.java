/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Noticia;


/**
 * @author Luciana
 *
 */
@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar los datos del objeto noticia a la BD
		LOG.info("La noticia fue guardada "+ noticia.getTitulo()+", " + noticia.getFecha());

	}

	@Override
	public Noticia mostrar() {
		// Se recupera todos los datos de la noticia
		LOG.info("mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto noticia de la BD
		LOG.info("la noticia fue eliminada " + noticia.getTitulo()+noticia.getFecha());

	}

	@Override
	public Noticia modificar() {
		// Se modificara el objeto noticia de la BD
		LOG.info("modificara los datoss de noticia");
		return noticia;
	}

}
