package co.agro.blockchain.UserManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.agro.blockchain.UserManagment.model.Rol;

public interface IRolRepo extends JpaRepository<Rol, String>{

}
