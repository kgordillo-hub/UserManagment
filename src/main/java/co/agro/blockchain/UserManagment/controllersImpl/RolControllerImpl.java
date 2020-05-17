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

import co.agro.blockchain.UserManagment.controllers.IRolController;
import co.agro.blockchain.UserManagment.model.Rol;
import co.agro.blockchain.UserManagment.service.RolService;

@RestController
public class RolControllerImpl implements IRolController {

	@Autowired
	RolService rolService;

	@Override
	@RequestMapping(value = "/roles", method = RequestMethod.GET, produces = "application/json")
	public List<?> listarTabla() {
		return rolService.listarRoles();
	}

	@Override
	@RequestMapping(value = "/roles/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<?> consultarTablaById(@PathVariable String id) {
		return rolService.getRolById(id);
	}

	@Override
	@PostMapping(value = "/roles/add")
	public ResponseEntity<?> agregarElemento(@RequestBody Rol elemento) {
		if (rolService.agregarRol(elemento)) {
			return ResponseEntity.ok("Rol agregado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Rol previamente creado");
	}

	@Override
	@RequestMapping(value = "/roles/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> eliminarElemento(@PathVariable String id) {
		if (rolService.deleteRol(id)) {
			return ResponseEntity.ok("Rol eliminado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Rol no existe");
	}

	@Override
	@PostMapping(value = "/roles/update")
	public ResponseEntity<?> actualizarElemento(@RequestBody Rol elemento) {
		if(rolService.updateRol(elemento)) {
			return ResponseEntity.ok("Rol actualizado correctamente");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Rol no existe");
	}

}
