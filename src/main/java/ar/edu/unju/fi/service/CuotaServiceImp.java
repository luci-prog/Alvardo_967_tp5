/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

/**
 * @author Luciana
 *
 */
@Repository

public class CuotaServiceImp implements ICuotaService {
	
	@Autowired
	private ICuota icuota;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		icuota.guardar();

	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		icuota.eliminar();

	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
