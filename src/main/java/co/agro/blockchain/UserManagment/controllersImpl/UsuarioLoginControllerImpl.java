package co.agro.blockchain.UserManagment.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.agro.blockchain.UserManagment.controllers.IUsuarioLoginController;
import co.agro.blockchain.UserManagment.model.UsuarioLogin;
import co.agro.blockchain.UserManagment.model.UsuarioLoginPk;
import co.agro.blockchain.UserManagment.service.UsuarioLoginService;

@RestController
public class UsuarioLoginControllerImpl implements IUsuarioLoginController {

	@Autowired
	UsuarioLoginService usuarioService;

	@Override
	@RequestMapping(value = "/usuarios-login", method = RequestMethod.GET, produces = "application/json")
	public List<?> listarTabla() {
		return usuarioService.listarUsuarioLogin();
	}

	@Override
	@PostMapping(value = "/usuarios-login/getUser")
	public Optional<?> consultarTablaById(@RequestBody UsuarioLoginPk id) {
		return usuarioService.getUsuarioLoginById(id);
	}

	@Override
	@PostMapping(value = "/usuarios-login/add")
	public ResponseEntity<?> agregarElemento(@RequestBody UsuarioLogin elemento) {
		if (usuarioService.agregarUsuarioLogin(elemento)) {
			return ResponseEntity.ok("Usuario de loggeo agregado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario de loggeo previamente creado");
	}

	@Override
	@PostMapping(value = "/usuarios-login/delete/{id}")
	public ResponseEntity<?> eliminarElemento(@RequestBody UsuarioLoginPk id) {
		if (usuarioService.deleteUsuarioLogin(id)) {
			return ResponseEntity.ok("Usuario de loggeo eliminado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario de loggeo no existe");
	}

	@Override
	@PostMapping(value = "/usuarios-login/update")
	public ResponseEntity<?> actualizarElemento(@RequestBody UsuarioLogin elemento) {
		if (usuarioService.updateUsuarioLogin(elemento)) {
			return ResponseEntity.ok("Usuario de loggeo actualizado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario de loggeo no existe");
	}

}
