package co.agro.blockchain.UserManagment.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.agro.blockchain.UserManagment.model.UsuarioLogin;
import co.agro.blockchain.UserManagment.model.UsuarioLoginPk;


public interface IUsuarioLoginController {
	
	List<?> listarTabla();
	
	Optional<?> consultarTablaById(final UsuarioLoginPk id);
	
	ResponseEntity<?> agregarElemento(final UsuarioLogin elemento);
	
	ResponseEntity<?> eliminarElemento(final UsuarioLoginPk id);
	
	ResponseEntity<?> actualizarElemento(final UsuarioLogin elemento);
}
