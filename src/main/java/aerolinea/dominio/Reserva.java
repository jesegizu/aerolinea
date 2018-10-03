package aerolinea.dominio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import aerolinea.dominio.entidades.ReservaEntidad;
import aerolinea.dominio.entidades.VueloEntidad;
import aerolinea.dominio.repositorio.ReservaRepositorio;
import aerolinea.dominio.repositorio.VueloRespositorio;


@Repository("aerolinea.dominio.Reserva")
public class Reserva{
	
	@Autowired
	@Qualifier("aerolinea.dominio.repositorio.ReservaRepositorio")
	ReservaRepositorio reservaRepositorio;
	
	@Autowired
	@Qualifier("aerolinea.dominio.repositorio.VueloRepositorio")
	VueloRespositorio vueloRepositorio;
	
	public void hacerReserva(VueloEntidad reserva){
		if((existeReserva(reserva))){
			if(reserva.getDia().equals("Viernes") || reserva.getDia().equals("Sabado") || reserva.getDia().equals("Domingo") || (reserva.getHora()>7 & reserva.getHora()<12)){
				reserva.setPrecio(reserva.getPrecio()* 1.5);
			}
			vueloRepositorio.save(reserva);
			VueloEntidad vueloBuscar = vueloRepositorio.findByIdVuelo(reserva.getIdVuelo());
			ReservaEntidad vueloGuardar = new ReservaEntidad(vueloBuscar.getIdUsuario(), vueloBuscar.getDia(), vueloBuscar.getIdVuelo());
			reservaRepositorio.save(vueloGuardar);
		}
	}
	
	public boolean existeReserva(VueloEntidad reservaBuscar){
		return (vueloRepositorio.findByIdUsuarioAndDia(reservaBuscar.getIdUsuario(), reservaBuscar.getDia())) != null ? false : true;
	}
	
	public List<VueloEntidad> consultarReserva(String id){
		return vueloRepositorio.findByIdUsuario(id);
	}
	
	public List<VueloEntidad> consultarTodos(){
		return vueloRepositorio.findAll();
	}
	
	
	
}
