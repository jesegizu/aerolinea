package aerolinea.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aerolinea.dominio.Reserva;
import aerolinea.dominio.entidades.VueloEntidad;
import aerolinea.dominio.repositorio.ReservaRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/controller")
public class ReservaControlador {

	@Autowired
	@Qualifier("aerolinea.dominio.Reserva")
	Reserva reservar;
	

	@Autowired
	@Qualifier("aerolinea.dominio.repositorio.ReservaRepositorio")
	ReservaRepositorio reservaRepositorio;
	
	@PostMapping("/ingresarReserva")
	private void ingresarReserva(@RequestBody VueloEntidad reserva)throws Exception{
		reservar.hacerReserva(reserva);
	}
	
	@GetMapping("/consultar/{idUsuario}")
	public List<VueloEntidad>consultarReserva(@PathVariable("idUsuario")String idUsuario){
		return reservar.consultarReserva(idUsuario);
	}
	
	@GetMapping("/consultar")
	public List<VueloEntidad>consultarTodos(){
		return reservar.consultarTodos();
	}
	
	
}
