package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

public interface INoticia {
	
	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();


}
