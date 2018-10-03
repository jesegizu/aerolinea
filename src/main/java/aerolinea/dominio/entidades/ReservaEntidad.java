package aerolinea.dominio.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class ReservaEntidad {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idReserva;
	
	@Column(nullable=false)
	private int idVuelo;
	
	@Column(nullable=false)
	private String idUsuario;
	
	
	@Column(nullable=false)
	private String dia;
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public ReservaEntidad(String idUsuario, String dia) {
		this.idUsuario = idUsuario;
		this.dia = dia;
	}
	public ReservaEntidad(String idUsuario, String dia, int idVuelo) {
		this.idUsuario = idUsuario;
		this.dia = dia;
		this.idVuelo = idVuelo;
	} 
	
	
	
}
