package co.agro.blockchain.UserManagment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
public class UsuarioLoginPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7321739196723121451L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_USUARIO", nullable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private DatosUsuario idUsuario;
	@Column(name = "USERNAME")
	private String username;
	
	public UsuarioLoginPk() {
		//Constructor basico
	}


	public DatosUsuario getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(DatosUsuario idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
