package co.agro.blockchain.UserManagment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
public class UsuarioLoginPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7321739196723121451L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_USUARIO",referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
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
