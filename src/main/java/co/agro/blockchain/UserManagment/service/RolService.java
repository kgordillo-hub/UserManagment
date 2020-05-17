package co.agro.blockchain.UserManagment.service;

import java.util.List;
import java.util.Optional;

import co.agro.blockchain.UserManagment.model.Rol;

public interface RolService{

	List<Rol> listarRoles();
	
	Optional<Rol> getRolById(final String rolId);
	
	Boolean agregarRol(final Rol rolAgregar);
	
	Boolean deleteRol(final String rolId);
	
	Boolean updateRol(final Rol rolActualizar);

}
