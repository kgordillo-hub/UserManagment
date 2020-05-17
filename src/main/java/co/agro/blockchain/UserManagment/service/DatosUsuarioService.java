package co.agro.blockchain.UserManagment.service;

import java.util.List;
import java.util.Optional;

import co.agro.blockchain.UserManagment.model.DatosUsuario;

public interface DatosUsuarioService {

	List<DatosUsuario> listarDatosUsuario();

	Optional<DatosUsuario> getDatosUsuarioById(final String id);

	Boolean agregarDatosUsuario(final DatosUsuario datos);

	Boolean deleteDatosUsuario(final String id);

	Boolean updateDatosUsuario(final DatosUsuario datos);
}
