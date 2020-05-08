package br.unip.diadefeira.controller.form;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.modelo.Produto;
import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.ProdutorProdutoFeira;
import br.unip.diadefeira.modelo.ProdutorProdutoFeiraID;
import br.unip.diadefeira.repository.FeiraRepository;
import br.unip.diadefeira.repository.ProdutoRepository;
import br.unip.diadefeira.repository.ProdutorRepository;

public class ProdutorProdutoFeiraForm {
	
	private String emailProdutor;
	private Long idFeira;
	
	@JsonProperty("listaProdutos") //como vai vir no json
	private List<ListaDeProdutosform> listaProdutos = new ArrayList<ListaDeProdutosform>();
	
	public String getEmailProdutor() {
		return emailProdutor;
	}
	public void setEmailProdutor(String emailProdutor) {
		this.emailProdutor = emailProdutor;
	}
	public Long getIdFeira() {
		return idFeira;
	}
	public void setIdFeira(Long idFeira) {
		this.idFeira = idFeira;
	}
	public List<ListaDeProdutosform> getProduto() {
		return listaProdutos;
	}
	public void setProduto(List<ListaDeProdutosform> produto) {
		this.listaProdutos = produto;
	}
	public List<ProdutorProdutoFeira> converter(FeiraRepository feiraRepository, ProdutoRepository produtoRepository, ProdutorRepository produtorRepository) {
		List<ProdutorProdutoFeira> listaProdutorProdutoFeira = new ArrayList<ProdutorProdutoFeira>();
		
		Produtor produtorEncontrado = produtorRepository.findByEmail(this.emailProdutor);
		Feira feiraEncontrada = feiraRepository.findById(this.idFeira).get();
		
		for (ListaDeProdutosform itemListaProduto : listaProdutos) {
			Produto produtoEncontrado = produtoRepository.findByIdProduto(itemListaProduto.getIdProduto());
			ProdutorProdutoFeiraID idChaveComposta = new ProdutorProdutoFeiraID(produtorEncontrado, feiraEncontrada, produtoEncontrado);
			ProdutorProdutoFeira produtorProdutoFeira = new ProdutorProdutoFeira();
			produtorProdutoFeira.setIdChaveComposta(idChaveComposta);
			produtorProdutoFeira.setPreco(itemListaProduto.getPreco());
			
			listaProdutorProdutoFeira.add(produtorProdutoFeira);
		}
		
		return listaProdutorProdutoFeira;
	}
	
	
	
}
