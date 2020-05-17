package co.agro.blockchain.UserManagment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROL", schema = "AGRO_CHAIN_PLATFORM")
public class Rol extends EntidadEstandar{

	@Id
	@Column(name = "ID_ROL")
	private String idRol;
	@Column(name = "DESCRIPCION")
	private String descripcion;

	public Rol() {
		// Constructor por defecto
	}

	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
