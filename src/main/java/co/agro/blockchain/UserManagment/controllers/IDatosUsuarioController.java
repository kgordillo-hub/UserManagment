package co.agro.blockchain.UserManagment.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.agro.blockchain.UserManagment.model.DatosUsuario;


public interface IDatosUsuarioController {
	
	List<?> listarTabla();
	
	Optional<?> consultarTablaById(final String id);
	
	ResponseEntity<?> agregarElemento(final DatosUsuario elemento);
	
	ResponseEntity<?> eliminarElemento(final String id);
	
	ResponseEntity<?> actualizarElemento(final DatosUsuario elemento);
}
