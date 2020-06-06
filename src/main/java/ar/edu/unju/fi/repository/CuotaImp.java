package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Alvarado967Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Alvarado967Tp5Application.class);
	

	@Override
	public void guardar() {
		// Accion de guardar un objeto cuota en la BD
		LOG.info("La cuota se guardo "+ cuota.getMonto());

	}

	@Override
	public Cuota mostrar() {
		// Accion de recuperar datos de la BD 
		LOG.info("muestra los datos de la cuota");
		return cuota;
		
	}

	@Override
	public void eliminar() {
		// Se eliminara los datos de la cuota de la BD
		LOG.info("La cuota fue eliminada "+ cuota.getMonto());

	}

	@Override
	public Cuota modificar() {
		//es la accion  de modificar lacuota de la BD
		LOG.info("Modificar los datos de cuota" );
		return cuota;
	}

}
