package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.ProdutorProdutoFeira;

public class BuscaPorProduto {
	//private BuscaPorProdutoId idChaveComposta;
	//produtor
	private String emailProdutor;
	private String nomeProdutor;
	
	//feira
	private Long idFeira;
	private String nomeFeira;
	private String enderecoFeira;
	
	
	public BuscaPorProduto(ProdutorProdutoFeira produtorProdutoFeira) {
		this.emailProdutor = produtorProdutoFeira.getIdChaveComposta().getProdutor().getEmail();
		this.nomeProdutor = produtorProdutoFeira.getIdChaveComposta().getProdutor().getNome();
		
		this.idFeira = produtorProdutoFeira.getIdChaveComposta().getFeira().getId();
		this.nomeFeira = produtorProdutoFeira.getIdChaveComposta().getFeira().getNome();
		this.enderecoFeira = produtorProdutoFeira.getIdChaveComposta().getFeira().getEndereco();
	}
	
	public String getEmailProdutor() {
		return emailProdutor;
	}

	public void setEmailProdutor(String emailProdutor) {
		this.emailProdutor = emailProdutor;
	}

	public String getNomeProdutor() {
		return nomeProdutor;
	}

	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}

	public Long getIdFeira() {
		return idFeira;
	}

	public void setIdFeira(Long idFeira) {
		this.idFeira = idFeira;
	}

	public String getNomeFeira() {
		return nomeFeira;
	}

	public void setNomeFeira(String nomeFeira) {
		this.nomeFeira = nomeFeira;
	}

	public String getEnderecoFeira() {
		return enderecoFeira;
	}

	public void setEnderecoFeira(String enderecoFeira) {
		this.enderecoFeira = enderecoFeira;
	}

	public static List<BuscaPorProduto> converter(List<ProdutorProdutoFeira> produtorProdutoFeira) {
		return produtorProdutoFeira.stream().map(BuscaPorProduto::new).collect(Collectors.toList());
	}

}
