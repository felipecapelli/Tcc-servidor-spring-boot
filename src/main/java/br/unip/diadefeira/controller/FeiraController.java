package br.unip.diadefeira.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.unip.diadefeira.controller.dto.CompraReservaDto;
import br.unip.diadefeira.controller.dto.FeiraDto;
import br.unip.diadefeira.controller.form.CompraReservaForm;
import br.unip.diadefeira.controller.form.FeiraForm;
import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.repository.FeiraRepository;

@RestController
@RequestMapping("/feiras")
public class FeiraController {
	
	@Autowired
	private FeiraRepository feiraRepository;
	
	//Relatório 0
	@GetMapping("/buscaPorEndereco/{endereco}")//aqui vai listar as feiras que irão acontecer no endereço que o usuario quiser saber
	public List<FeiraDto> listaPorEndereco (@PathVariable String endereco){
		List<Feira> feiras = feiraRepository.buscaFeiraPorEndereco(endereco);
		return FeiraDto.converter(feiras);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<FeiraDto> cadastrarNovaFeira(@RequestBody @Valid FeiraForm form, UriComponentsBuilder uriBuilder) {
		Feira feira = FeiraForm.converter(form);
		feiraRepository.save(feira);
		
		URI uri = uriBuilder.path("/buscaPorEndereco/{endereco}").buildAndExpand(feira.getEndereco()).toUri();
		return ResponseEntity.created(uri).body(new FeiraDto(feira));
	}
}
