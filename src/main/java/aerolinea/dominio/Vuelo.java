package aerolinea.dominio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import aerolinea.dominio.repositorio.VueloRespositorio;

@Repository("aerolinea.dominio.Vuelo")
public class Vuelo {

	@Autowired
	@Qualifier("aerolinea.dominio.repositorio.VueloRepositorio")
	VueloRespositorio vueloRepositorio;
	

}
