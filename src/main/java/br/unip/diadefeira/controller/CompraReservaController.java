package br.unip.diadefeira.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.unip.diadefeira.controller.dto.BuscaPorDetalhesDaFeira;
import br.unip.diadefeira.controller.dto.BuscaProdutosPorFeira;
import br.unip.diadefeira.controller.dto.CompraDtoResumido;
import br.unip.diadefeira.controller.dto.CompraReservaDto;
import br.unip.diadefeira.controller.dto.CompraReservaResumidoDto;
import br.unip.diadefeira.controller.dto.ReservaDtoResumido;
import br.unip.diadefeira.controller.form.CompraReservaForm;
import br.unip.diadefeira.modelo.CompraReserva;
import br.unip.diadefeira.modelo.ListaProdutos;
import br.unip.diadefeira.repository.CompraReservaRepository;
import br.unip.diadefeira.repository.FeiraRepository;
import br.unip.diadefeira.repository.ListaProdutosRepository;
import br.unip.diadefeira.repository.ProdutoRepository;
import br.unip.diadefeira.repository.ProdutorRepository;
import br.unip.diadefeira.repository.UsuarioRepository;

@RestController
@RequestMapping("/CompraReserva")
public class CompraReservaController {
	@Autowired
	private CompraReservaRepository compraReservaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	@Autowired
	private FeiraRepository feiraRepository;
	
	@Autowired
	private ListaProdutosRepository listaProdutosRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<CompraReservaDto> cadastrar(@RequestBody @Valid CompraReservaForm form, UriComponentsBuilder uriBuilder) {
		CompraReserva compraReserva = form.converter(usuarioRepository, produtorRepository, feiraRepository, produtoRepository);
		compraReservaRepository.save(compraReserva);
		for (ListaProdutos listaProdutos : compraReserva.getListaProdutos()) {
			listaProdutosRepository.save(listaProdutos);
		}
		
		URI uri = uriBuilder.path("/CompraReserva/{id}").buildAndExpand(compraReserva.getIdCompraReserva()).toUri();
		return ResponseEntity.created(uri).body(new CompraReservaDto(compraReserva));
	}
	
	@PutMapping
	@Transactional
	public ResponseEntity<CompraReservaDto> atualizarDataVenda(@RequestBody @Valid CompraReservaForm form){
		CompraReserva compraReserva = form.atualizarDataVenda(compraReservaRepository);
		return ResponseEntity.ok(new CompraReservaDto(compraReserva));
	}
	
	@GetMapping("/detalhado/{idCompraReserva}")
	public CompraReservaDto listarCompraOuReservaDetalhado (@PathVariable Long idCompraReserva){
		CompraReserva compraReserva = compraReservaRepository.buscaCompraOuReserva(idCompraReserva);
		return new CompraReservaDto(compraReserva);
	}
	
	@GetMapping("/resumido/{email}")
	public List<?> listaProdutorEProdutosPorFeira(@PathVariable("email") String email){	
		List dadosDeRetorno = new ArrayList();
		
		List<CompraReserva> reservas = compraReservaRepository.buscaReservas(email);
		List<ReservaDtoResumido> reservasDto = ReservaDtoResumido.converterReservaDtoResumido(reservas);

		dadosDeRetorno.add(reservasDto);
		
		List<CompraReserva> compras = compraReservaRepository.buscaCompras(email);
		
		List<CompraDtoResumido> comprasDto = CompraDtoResumido.converterCompraDtoResumido(compras);
		dadosDeRetorno.add(comprasDto);
		
		return dadosDeRetorno;
	}
	
	
	@GetMapping("/resumidoProdutor/{email}")
	public List<?> listaProdutorEProdutosPorFeiraProdutor(@PathVariable("email") String email){	
		List dadosDeRetorno = new ArrayList();
		
		List<CompraReserva> reservas = compraReservaRepository.buscaReservasDoProdutor(email);
		List<ReservaDtoResumido> reservasDto = ReservaDtoResumido.converterReservaDtoResumido(reservas);

		dadosDeRetorno.add(reservasDto);
		
		List<CompraReserva> compras = compraReservaRepository.buscaComprasDoProdutor(email);
		
		List<CompraDtoResumido> comprasDto = CompraDtoResumido.converterCompraDtoResumido(compras);
		dadosDeRetorno.add(comprasDto);
		
		return dadosDeRetorno;
	}
	
}
