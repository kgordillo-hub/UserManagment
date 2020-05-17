package co.agro.blockchain.UserManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.agro.blockchain.UserManagment.model.UsuarioLogin;
import co.agro.blockchain.UserManagment.model.UsuarioLoginPk;

public interface IUsuarioLoginRepo extends JpaRepository<UsuarioLogin, UsuarioLoginPk>{

}
