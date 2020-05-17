package co.agro.blockchain.UserManagment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.agro.blockchain.UserManagment.model.Rol;
import co.agro.blockchain.UserManagment.repository.IRolRepo;
import co.agro.blockchain.UserManagment.service.RolService;
import co.agro.blockchain.UserManagment.utils.Utils;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	IRolRepo rolRepo;

	@Override
	public List<Rol> listarRoles() {
		return rolRepo.findAll();
	}

	@Override
	public Optional<Rol> getRolById(String rolId) {
		return rolRepo.findById(rolId);
	}

	@Override
	public Boolean agregarRol(Rol rolAgregar) {
		if (rolAgregar != null && !rolRepo.findById(rolAgregar.getIdRol()).isPresent()) {
			rolRepo.save(rolAgregar);
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteRol(String rolId) {
		Optional<Rol> optionalRol = rolRepo.findById(rolId);
		if (!optionalRol.isPresent()) {
			rolRepo.delete(optionalRol.get());
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateRol(final Rol rolActualizar) {
		Optional<Rol> optionalRol = rolRepo.findById(rolActualizar.getIdRol());
		if (rolActualizar != null && !optionalRol.isPresent()) {
			Utils.copyNonNullProperties(rolActualizar, optionalRol.get());
			rolRepo.save(rolActualizar);
			return true;
		}
		return false;
	}

}
