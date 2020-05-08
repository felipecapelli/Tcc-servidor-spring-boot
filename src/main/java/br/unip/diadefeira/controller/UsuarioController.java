package br.unip.diadefeira.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unip.diadefeira.controller.dto.ProdutorDto;
import br.unip.diadefeira.controller.dto.UsuarioDto;
import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.Usuario;
import br.unip.diadefeira.repository.ProdutorRepository;
import br.unip.diadefeira.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	@GetMapping("/{email}")
	public ResponseEntity<UsuarioDto>detalhar(@PathVariable String email){
		Optional<Produtor> produtor= produtorRepository.findById(email);
		if (produtor.isPresent()) {
			return ResponseEntity.ok(new ProdutorDto(produtor.get()));
		}else {
			Optional<Usuario> usuario= usuarioRepository.findById(email);
			if (usuario.isPresent()) {
				return ResponseEntity.ok(new UsuarioDto(usuario.get()));
			}
		}
		return ResponseEntity.notFound().build();
	}
	
}
