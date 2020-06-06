package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Usuario;

@Service
@Repository("usuarioImp")    //esta anotación está indicando que se trata 
                             //de un bean de Spring que se encargará de 
                             //manipular los datos almacenados en algún repositorio (ej BD)
public class UsuarioImp implements IUsuario {
	
	//-----------------    -----------------------------------------------------
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);
	
	//------------------------------------------------------------------------------

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("El usuario fue guardado "+ usuario.getApellido()+ ", "+ usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// accion ejecutada para eliminar un objeto usuario en la base de datos
		LOG.info("el usuario fue eliminado "+ usuario.getApellido()+", "+ usuario.getNombre());

	}

	@Override
	public Usuario modificar() {
		// se modifican todos los datos del usuario
		LOG.info("modificar los datos del usuario");
		return usuario;
	}

}
