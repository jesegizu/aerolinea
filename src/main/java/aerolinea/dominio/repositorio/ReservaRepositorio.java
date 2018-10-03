package aerolinea.dominio.repositorio;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aerolinea.dominio.entidades.ReservaEntidad;

@Repository("aerolinea.dominio.repositorio.ReservaRepositorio")
public interface ReservaRepositorio extends JpaRepository<ReservaEntidad, Serializable>{
	
	public abstract ReservaEntidad findByIdUsuario(String id);
	public abstract ReservaEntidad findByIdUsuarioAndDia(String id, String dia);

}
