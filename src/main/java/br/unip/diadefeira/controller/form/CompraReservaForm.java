package br.unip.diadefeira.controller.form;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.unip.diadefeira.controller.dto.CompraDtoResumido;
import br.unip.diadefeira.modelo.CompraReserva;
import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.modelo.ListaProdutos;
import br.unip.diadefeira.modelo.Produto;
import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.Usuario;
import br.unip.diadefeira.repository.CompraReservaRepository;
import br.unip.diadefeira.repository.FeiraRepository;
import br.unip.diadefeira.repository.ProdutoRepository;
import br.unip.diadefeira.repository.ProdutorRepository;
import br.unip.diadefeira.repository.UsuarioRepository;

public class CompraReservaForm {
	private Long idCompraReserva;
	private String emailUsuario;
	private String emailProdutor;
	private Long IdFeira;
	private LocalDateTime dataVenda;
	
	@JsonProperty("produtosDto")
	private List<ListaProdutosFom> listaProdutosDto = new ArrayList<>();
	
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getEmailProdutor() {
		return emailProdutor;
	}
	public void setEmailProdutor(String emailProdutor) {
		this.emailProdutor = emailProdutor;
	}
	public Long getIdFeira() {
		return IdFeira;
	}
	public void setIdFeira(Long idFeira) {
		IdFeira = idFeira;
	}
	public List<ListaProdutosFom> getProdutosDto() {
		return listaProdutosDto;
	}
	public void setProdutosDto(List<ListaProdutosFom> produtosDto) {
		this.listaProdutosDto = produtosDto;
	}
	public Long getIdCompraReserva() {
		return idCompraReserva;
	}
	public void setIdCompraReserva(Long idCompraReserva) {
		this.idCompraReserva = idCompraReserva;
	}
	public String getUsuario() {
		return emailUsuario;
	}
	public void setUsuario(String usuario) {
		this.emailUsuario = usuario;
	}
	public String getProdutor() {
		return emailProdutor;
	}
	public void setProdutor(String produtor) {
		this.emailProdutor = produtor;
	}
	public Long getFeira() {
		return IdFeira;
	}
	public void setFeira(Long feira) {
		this.IdFeira = feira;
	}
	public LocalDateTime getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}

	public CompraReserva converter(UsuarioRepository usuarioRepository, ProdutorRepository produtorRepository, FeiraRepository feiraRepository, ProdutoRepository produtoRepository) {
		Usuario usuario = usuarioRepository.findByEmail(emailUsuario).get();
		Produtor produtor = produtorRepository.findByEmail(emailProdutor);
		Feira feira = feiraRepository.findById(Long.valueOf(4)).get();
		
		CompraReserva compraReserva = new CompraReserva(CompraReservaForm.this, usuario, produtor, feira, LocalDateTime.now());//o ultimo parametro é a data da reserva (o sistema pega a data atual)
		
		List<ListaProdutos> listaProdutos = new ArrayList<ListaProdutos>();
		for (ListaProdutosFom listaProdutosFom : listaProdutosDto) {
			listaProdutos.add(new ListaProdutos(compraReserva, produtoRepository.findByIdProduto(listaProdutosFom.getIdProduto())));
		}
		compraReserva.setListaProdutos(listaProdutos);
		return compraReserva;
	}
	
	public CompraReserva atualizarDataVenda(CompraReservaRepository compraReservaRepository) {
		CompraReserva compraReserva = compraReservaRepository.getOne(this.idCompraReserva);
		compraReserva.setDataVenda(this.dataVenda);
		return compraReserva;
	}
}
