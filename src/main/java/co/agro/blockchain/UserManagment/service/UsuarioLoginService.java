package co.agro.blockchain.UserManagment.service;

import java.util.List;
import java.util.Optional;

import co.agro.blockchain.UserManagment.model.UsuarioLogin;
import co.agro.blockchain.UserManagment.model.UsuarioLoginPk;

public interface UsuarioLoginService {

	
	List<UsuarioLogin> listarUsuarioLogin();

	Optional<UsuarioLogin> getUsuarioLoginById(final UsuarioLoginPk id);

	Boolean agregarUsuarioLogin(final UsuarioLogin datos);

	Boolean deleteUsuarioLogin(final UsuarioLoginPk id);

	Boolean updateUsuarioLogin(final UsuarioLogin datos);
}
