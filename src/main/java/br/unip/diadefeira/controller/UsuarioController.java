package br.unip.diadefeira.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unip.diadefeira.controller.dto.UsuarioDto;
import br.unip.diadefeira.modelo.Usuario;
import br.unip.diadefeira.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/{email}")//Retorna todos os dados do usuário (um teste para referência, não usar na homologação)
	public ResponseEntity<UsuarioDto>detalhar(@PathVariable String email){
		Optional<Usuario> usuario= usuarioRepository.findById(email);
		if (usuario.isPresent()) {
			return ResponseEntity.ok(new UsuarioDto(usuario.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
}
