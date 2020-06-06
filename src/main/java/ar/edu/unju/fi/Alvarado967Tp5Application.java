package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Alvarado967Tp5Application implements CommandLineRunner {
	
	//es lo q aumente
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;
	@Autowired
	Resultado resultado2;
	
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	@Autowired
	Equipo equipo2;
	
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;
	
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	
	
	
	//-------------------

	public static void main(String[] args) {
		SpringApplication.run(Alvarado967Tp5Application.class, args);
	}
	
	//-----------------USUARIO--------------------
	
	@Override
	public void run(String... args) throws Exception{
		//Inicializo la variables de mi objeto usuario
		usuario.setApellido("perez");
		usuario.setDireccion("av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("Socio");
		
		usuarioService.guardar();
		
		
		//----------------NOTICIA------------------------
		noticia.setFecha(LocalDate.of(2020,1-1, 20 ));
		noticia.setTitulo("el triunfo de river");
		noticia.setResumen("el equipo de river gano el partido gracias a un milagro");
		
		noticiaService.guardar();
		
		//---------------ESTADIO---------------------------------
		estadio.setNombre("river");
		estadio.setFechaFundacion(LocalDate.of(1980,3-1, 20));
		estadio.setDirección("en bs as");
		estadio.setCiudad("Bs As");
		estadio.setCapacidad(1000);
		
		estadioService.guardar();
		

		//------------------EQUIPO-------------------------
		equipo.setNombre("river");
		//equipo2.setNombre("boca");
		//equipo.setEstadio(estadio);
		
		equipoService.guardar();
		
		//-------------------CUOTA-------------------------
		cuota.setEstado("deudor");
		cuota.setFechaPago(LocalDate.of(2020, 2-1, 20));
	    cuota.setId(4);
	    cuota.setMonto(2000.99);
	    cuota.setPeriodo("20");
	    //profe como se llama cuando la variable esta definida con una clase y esa clase
	    //varias variables
	    //cuota.setUsuario(usuario);
	    
	    cuotaService.guardar();
		
		//----------------RESULTADO--------------------
		
		//Inicializando la variable de mi objeto resultado
		
		//resultado.setEquipo1(equipo);
		//resultado.setEquipo2(equipo2);
		resultado.setFecha(LocalDate.of(2020, 2-1, 23));
		resultado.setGolesEquipo1(3);
		resultado.setGolesEquipo2(2);
		
		
		resultadoService.guardar();
		
		
		
	}
	
	
}
