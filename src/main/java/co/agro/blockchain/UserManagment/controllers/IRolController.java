package co.agro.blockchain.UserManagment.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.agro.blockchain.UserManagment.model.Rol;


public interface IRolController {
	
	List<?> listarTabla();
	
	Optional<?> consultarTablaById(final String id);
	
	ResponseEntity<?> agregarElemento(final Rol elemento);
	
	ResponseEntity<?> eliminarElemento(final String id);
	
	ResponseEntity<?> actualizarElemento(final Rol elemento);
}
