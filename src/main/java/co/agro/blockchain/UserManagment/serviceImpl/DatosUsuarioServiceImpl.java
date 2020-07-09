package co.agro.blockchain.UserManagment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.agro.blockchain.UserManagment.model.DatosUsuario;
import co.agro.blockchain.UserManagment.repository.IDatosUsuarioRepo;
import co.agro.blockchain.UserManagment.service.DatosUsuarioService;
import co.agro.blockchain.UserManagment.utils.Utils;

@Service
public class DatosUsuarioServiceImpl implements DatosUsuarioService {

	@Autowired
	IDatosUsuarioRepo datosUsuarioRepo;

	@Override
	public List<DatosUsuario> listarDatosUsuario() {
		return datosUsuarioRepo.findAll();
	}

	@Override
	public Optional<DatosUsuario> getDatosUsuarioById(final String id) {
		return datosUsuarioRepo.findById(id);
	}

	@Override
	public Boolean agregarDatosUsuario(DatosUsuario datos) {
		if (datos != null && !datosUsuarioRepo.findById(datos.getIdUsuario()).isPresent()) {
			datosUsuarioRepo.save(datos);
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteDatosUsuario(String id) {
		final Optional<DatosUsuario> optionalDatosUser = datosUsuarioRepo.findById(id);
		if (!optionalDatosUser.isPresent()) {
			datosUsuarioRepo.delete(optionalDatosUser.get());
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateDatosUsuario(DatosUsuario datos) {
		final Optional<DatosUsuario> optionalDatosUser = datosUsuarioRepo.findById(datos.getIdUsuario());
		if (datos != null && optionalDatosUser.isPresent()) {
			Utils.copyNonNullProperties(datos, optionalDatosUser.get());
			datosUsuarioRepo.save(datos);
			return true;
		}
		return false;
	}

}
