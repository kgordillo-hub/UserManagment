package co.agro.blockchain.UserManagment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.agro.blockchain.UserManagment.model.UsuarioLogin;
import co.agro.blockchain.UserManagment.model.UsuarioLoginPk;
import co.agro.blockchain.UserManagment.repository.IUsuarioLoginRepo;
import co.agro.blockchain.UserManagment.service.UsuarioLoginService;
import co.agro.blockchain.UserManagment.utils.Utils;

@Service
public class UsuarioLoginImpl implements UsuarioLoginService {

	@Autowired
	IUsuarioLoginRepo usuarioLoginRepo;

	@Override
	public List<UsuarioLogin> listarUsuarioLogin() {
		return usuarioLoginRepo.findAll();
	}

	@Override
	public Optional<UsuarioLogin> getUsuarioLoginById(UsuarioLoginPk id) {
		final List<UsuarioLoginPk> pkList = new ArrayList<UsuarioLoginPk>();
		pkList.add(id);
		final List<UsuarioLogin> user = usuarioLoginRepo.findAllById(pkList);
		if (user != null && !user.isEmpty()) {
			return Optional.of(user.get(0));
		}
		return Optional.ofNullable(null);
	}

	@Override
	public Boolean agregarUsuarioLogin(UsuarioLogin datos) {
		if (datos != null && !usuarioLoginRepo.findById(datos.getUsuarioLoginPk()).isPresent()) {
			usuarioLoginRepo.save(datos);
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteUsuarioLogin(UsuarioLoginPk id) {
		Optional<UsuarioLogin> optionalUsuario = usuarioLoginRepo.findById(id);
		if (!optionalUsuario.isPresent()) {
			usuarioLoginRepo.delete(optionalUsuario.get());
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateUsuarioLogin(UsuarioLogin datos) {
		Optional<UsuarioLogin> optionalUsuario = usuarioLoginRepo.findById(datos.getUsuarioLoginPk());
		if (!optionalUsuario.isPresent()) {
			Utils.copyNonNullProperties(datos, optionalUsuario.get());
			usuarioLoginRepo.save(datos);
			return true;
		}
		return false;
	}

}
