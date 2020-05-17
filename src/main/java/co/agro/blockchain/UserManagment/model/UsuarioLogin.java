package co.agro.blockchain.UserManagment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "USUARIO_LOGIN", schema = "AGRO_CHAIN_PLATFORM")
public class UsuarioLogin {

	
	@EmbeddedId
    private UsuarioLoginPk usuarioLoginPk;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ROL", nullable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Rol rol;
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
	
	public UsuarioLoginPk getUsuarioLoginPk() {
		return usuarioLoginPk;
	}
	public void setUsuarioLoginPk(UsuarioLoginPk usuarioLoginPk) {
		this.usuarioLoginPk = usuarioLoginPk;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
