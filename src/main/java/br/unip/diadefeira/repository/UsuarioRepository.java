package br.unip.diadefeira.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.unip.diadefeira.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	
	Optional<Usuario> findByEmail(String usuario);
	
}
