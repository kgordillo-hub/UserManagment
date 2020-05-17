package co.agro.blockchain.UserManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.agro.blockchain.UserManagment.model.DatosUsuario;

public interface IDatosUsuarioRepo extends JpaRepository<DatosUsuario, String>{

}
