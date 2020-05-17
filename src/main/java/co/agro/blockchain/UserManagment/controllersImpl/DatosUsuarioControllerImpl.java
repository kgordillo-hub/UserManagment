package co.agro.blockchain.UserManagment.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.agro.blockchain.UserManagment.controllers.IDatosUsuarioController;
import co.agro.blockchain.UserManagment.model.DatosUsuario;
import co.agro.blockchain.UserManagment.service.DatosUsuarioService;

@RestController
public class DatosUsuarioControllerImpl implements IDatosUsuarioController {

	@Autowired
	DatosUsuarioService service;

	@Override
	@RequestMapping(value = "/DatosUsuarios", method = RequestMethod.GET, produces = "application/json")
	public List<?> listarTabla() {
		return service.listarDatosUsuario();
	}

	@Override
	@RequestMapping(value = "/DatosUsuarios/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<?> consultarTablaById(@PathVariable String id) {
		return service.getDatosUsuarioById(id);
	}

	@Override
	@PostMapping(value = "/DatosUsuarios/add")
	public ResponseEntity<?> agregarElemento(@RequestBody DatosUsuario elemento) {
		if (service.agregarDatosUsuario(elemento)) {
			return ResponseEntity.ok("Datos de usuario agregados correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos de usuario previamente creados");
	}

	@Override
	@RequestMapping(value = "/DatosUsuarios/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> eliminarElemento(@PathVariable String id) {
		if (service.deleteDatosUsuario(id)) {
			return ResponseEntity.ok("Datos de usuario eliminados correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos de usuario no existen");
	}

	@Override
	@PostMapping(value = "/DatosUsuarios/update")
	public ResponseEntity<?> actualizarElemento(@RequestBody DatosUsuario elemento) {
		if(service.updateDatosUsuario(elemento)) {
			return ResponseEntity.ok("Datos de usuario actualizados correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos de usuario no existen");
	}

}
