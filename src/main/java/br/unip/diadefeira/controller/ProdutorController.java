package br.unip.diadefeira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unip.diadefeira.controller.dto.ProdutorNoLocalDto;
import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.repository.ProdutorRepository;

@RestController
@RequestMapping("/Produtor")
public class ProdutorController {
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	//Relatório 5
	@GetMapping("/buscaProdutoresPorEndereco/{endereco}")
	public ResponseEntity<List<ProdutorNoLocalDto>> BuscaProdutorPorEndereco(@PathVariable() String endereco){
		List<Produtor> produtores = produtorRepository.buscarProdutorPorEndereco(endereco);
		return ResponseEntity.ok(ProdutorNoLocalDto.converter(produtores));
	}
}
