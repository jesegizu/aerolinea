package aerolinea.dominio.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aerolinea.dominio.entidades.VueloEntidad;

@Repository("aerolinea.dominio.repositorio.VueloRepositorio")
public interface VueloRespositorio extends JpaRepository<VueloEntidad, Serializable> {
	public abstract VueloEntidad findByIdVuelo(int id);
	public abstract List<VueloEntidad> findByIdUsuario(String idUsuario);
	public abstract VueloEntidad findByIdUsuarioAndDia(String idUsuario, String dia);
	public abstract List<VueloEntidad> findAll();

}
