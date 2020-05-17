package co.agro.blockchain.UserManagment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="DATOS_USUARIO", schema = "AGRO_CHAIN_PLATFORM")
public class DatosUsuario {

	@Id
	@Column(name = "ID_USUARIO")
	private String idUsuario;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_EMPRESA", nullable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Empresa empresa;
	@Column(name = "NOMBRE_USUARIO")
	private String nombreUsario;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "TELEFONO")
	private String telefono;
	@Column(name = "COD_DEPARTAMENTO")
	private String codDepartamento;
	@Column(name = "COD_MUNICIPIO")
	private String codMunicipio;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;
	@Column(name = "ESTADO_USUARIO")
	private Short estadoUsuario;
	
	public DatosUsuario() {
		//constructor basico
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsario() {
		return nombreUsario;
	}

	public void setNombreUsario(String nombreUsario) {
		this.nombreUsario = nombreUsario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Short getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(Short estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
