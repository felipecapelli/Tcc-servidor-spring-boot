package br.unip.diadefeira.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unip.diadefeira.controller.dto.BuscaPorDetalhesDaFeira;
import br.unip.diadefeira.controller.dto.BuscaPorProduto;
import br.unip.diadefeira.controller.dto.BuscaPorProdutorPorFeiraDto;
import br.unip.diadefeira.controller.dto.BuscaProdutoComPrecoDto;
import br.unip.diadefeira.controller.dto.BuscaProdutoresNumaFeiraComProdutoEspecificoDto;
import br.unip.diadefeira.controller.dto.BuscaProdutosPorFeira;
import br.unip.diadefeira.controller.dto.FeiraDto;
import br.unip.diadefeira.controller.dto.ProdutoDto;
import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.modelo.Produto;
import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.ProdutorProdutoFeira;
import br.unip.diadefeira.repository.FeiraRepository;
import br.unip.diadefeira.repository.ProdutoRepository;
import br.unip.diadefeira.repository.ProdutorProdutoFeiraRepository;
import br.unip.diadefeira.repository.ProdutorRepository;

@RestController
@RequestMapping("/produtorProdutoFeira")
public class ProdutorProdutoFeiraController {
	
	@Autowired
	private ProdutorProdutoFeiraRepository produtorProdutoFeiraRepository;
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private FeiraRepository feiraRepository;
	
	//Relatório 1
	@GetMapping("/porProduto/{nomeProduto}/{endereco}")
	public List<BuscaPorProduto> listaProdutorProdutoFeiraPorProduto(@PathVariable String nomeProduto, @PathVariable String endereco) {
		List<ProdutorProdutoFeira> listaProdutorProdutoFeira = produtorProdutoFeiraRepository.buscaProdutorProdutoFeiraPorProduto(nomeProduto, endereco);
		return BuscaPorProduto.converter(listaProdutorProdutoFeira);
	}
	
	//Relatório 2 A
	@GetMapping("/produtosPorFeira/{idFeira}")
	public List<BuscaProdutosPorFeira> listaProdutosPorFeira(@PathVariable("idFeira") Long idFeira){
		List<Long> listaDEIDsDeProdutosPelaFeira = produtorProdutoFeiraRepository.buscaPorProdutosPorFeira(idFeira);
		List<Produto> produtos = new ArrayList<Produto>();
		
		for(Long produto : listaDEIDsDeProdutosPelaFeira) {
			produtos.add(produtoRepository.findByIdProduto(produto));
		}
		
		return BuscaProdutosPorFeira.converter(produtos);
	}
	
	//Relatório 2 B
	@GetMapping("/produtorPorFeira/{idFeira}")
	public List<BuscaPorDetalhesDaFeira> listaPorDetalhesDaFeira(@PathVariable("idFeira") Long idFeira){
		List<String> listaPorDetalhesDaFeira = produtorProdutoFeiraRepository.buscaPorDetalhesDaFeira(idFeira);
		List<Produtor> produtores = new ArrayList<Produtor>();
		
		for (String produtor : listaPorDetalhesDaFeira) {
			produtores.add(produtorRepository.findByEmail(produtor));
		}
		
		//return listaPorDetalhesDaFeira; 
		return BuscaPorDetalhesDaFeira.converter(produtores);
	}
	
	//Relatório 3 - juntando o 2 A e 2 B
	@GetMapping("/detalhesDaFeira/{idFeira}/{nomeFeira}/{enderecoFeira}")//esse método usa os dois de baixo para juntar os resutados
	//PASSAR O ENDEREÇO E NOME DO OBJETO FEIRA!!!!!!!!!!!!!!!!!
	public List<?> listaProdutorEProdutosPorFeira(@PathVariable("idFeira") Long idFeira, @PathVariable("nomeFeira") String nomeFeira, @PathVariable("enderecoFeira") String enderecoFeira){	
		List dadosDeRetorno = new ArrayList();
		dadosDeRetorno.add(idFeira);
		dadosDeRetorno.add(nomeFeira);
		dadosDeRetorno.add(enderecoFeira);
		
		List<BuscaProdutosPorFeira> produtos = listaProdutosPorFeira(idFeira);

		dadosDeRetorno.add(produtos);
		
		List<BuscaPorDetalhesDaFeira> produtores = listaPorDetalhesDaFeira(idFeira);
		dadosDeRetorno.add(produtores);
		
		return dadosDeRetorno;
		//return produtos;
	}
	
	//Relatório 4
	@GetMapping("/porProdutorPorFeira/{usuarioEmail}/{idFeira}")
	public ResponseEntity<BuscaPorProdutorPorFeiraDto> listaPorProdutorPorFeira(@PathVariable String usuarioEmail, @PathVariable Long idFeira){
		List<ProdutorProdutoFeira> listaPorProdutorPorFeira;
		List<BuscaProdutoComPrecoDto> produtoComPrecoDto;
		try {
			listaPorProdutorPorFeira = produtorProdutoFeiraRepository.buscaPorProdutorPorFeira(usuarioEmail, idFeira);
			produtoComPrecoDto = BuscaProdutoComPrecoDto.converter(listaPorProdutorPorFeira);
			return ResponseEntity.ok(BuscaPorProdutorPorFeiraDto.converter(listaPorProdutorPorFeira.get(0), produtoComPrecoDto));
		} catch (IndexOutOfBoundsException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	//Relatório 5
	@GetMapping("/produtoresNumaFeiraProdutoEspecifico/{idFeira}/{idProduto}")
	public List<BuscaProdutoresNumaFeiraComProdutoEspecificoDto> listaProdutoresNumaFeiraComProdutoEspecifico(@PathVariable Long idFeira, @PathVariable Long idProduto){
		List<ProdutorProdutoFeira> listaProdutoresPorFeiraPorProduto = produtorProdutoFeiraRepository.listaProdutoresPorfeiraPorProduto(idFeira, idProduto);
		return BuscaProdutoresNumaFeiraComProdutoEspecificoDto.converter(listaProdutoresPorFeiraPorProduto);
	}
	
	//Relatório 6
	@GetMapping("/buscaFeirasEProdutosDoProdutor/{nomeProdutor}")
	public List<?> listaFeirasProdutosDoProdutor(@PathVariable String nomeProdutor){
		
		//busca por feiras
		List<FeiraDto> feirasDto = new ArrayList<FeiraDto>();
		List<Long> idsDasFeiras = produtorProdutoFeiraRepository.buscaFeirasFuturasDoProdutor(nomeProdutor);
		
		for (Long feira : idsDasFeiras) {
			FeiraDto objetoFeiraDto = new FeiraDto(feiraRepository.findById(feira).get());
			feirasDto.add(objetoFeiraDto);
		}
		
		//busca por produtos
		List<ProdutoDto> produtosDto = new ArrayList<ProdutoDto>();
		List<Long> idsDosProdutos = produtorProdutoFeiraRepository.buscaProdutosFuturosDoProdutor(nomeProdutor);
		
		for (Long produto : idsDosProdutos) {
			produtosDto.add(new ProdutoDto(produtoRepository.findById(produto).get()));
			
		}
		
		//Unindo os resultados
		List dadosDeRetorno = new ArrayList();
		dadosDeRetorno.add(feirasDto);
		dadosDeRetorno.add(produtosDto);
		
		return dadosDeRetorno;
	}
	
}
