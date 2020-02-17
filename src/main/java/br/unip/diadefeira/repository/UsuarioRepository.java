package br.unip.diadefeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unip.diadefeira.modelo.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	
}
