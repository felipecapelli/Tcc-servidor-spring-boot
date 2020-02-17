package br.unip.diadefeira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unip.diadefeira.controller.dto.FeiraDto;
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
}
