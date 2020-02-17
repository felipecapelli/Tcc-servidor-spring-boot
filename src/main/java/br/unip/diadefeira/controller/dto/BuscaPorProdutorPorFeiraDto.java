package br.unip.diadefeira.controller.dto;

import java.util.List;

import br.unip.diadefeira.modelo.ProdutorProdutoFeira;

public class BuscaPorProdutorPorFeiraDto {
	private String produtorEmail;
	private String produtorNome;
	private Long feiraId;
	private String feiraNome;
	private String feiraEndereco;
	private List<BuscaProdutoComPrecoDto> produtos;
	
	public BuscaPorProdutorPorFeiraDto(ProdutorProdutoFeira produtorProdutoFeira , List<BuscaProdutoComPrecoDto> produtoComPrecoDto) {
		this.produtorEmail = produtorProdutoFeira.getIdChaveComposta().getProdutor().getEmail();
		this.produtorNome = produtorProdutoFeira.getIdChaveComposta().getProdutor().getNome();
		this.feiraId = produtorProdutoFeira.getIdChaveComposta().getFeira().getId();
		this.feiraNome = produtorProdutoFeira.getIdChaveComposta().getFeira().getNome();
		this.feiraEndereco = produtorProdutoFeira.getIdChaveComposta().getFeira().getEndereco();
		this.produtos = produtoComPrecoDto;
	}
	
	public String getProdutorEmail() {
		return produtorEmail;
	}

	public void setProdutorEmail(String produtorEmail) {
		this.produtorEmail = produtorEmail;
	}

	public String getProdutorNome() {
		return produtorNome;
	}

	public void setProdutorNome(String produtorNome) {
		this.produtorNome = produtorNome;
	}

	public Long getFeiraId() {
		return feiraId;
	}

	public void setFeiraId(Long feiraId) {
		this.feiraId = feiraId;
	}

	public String getFeiraNome() {
		return feiraNome;
	}

	public void setFeiraNome(String feiraNome) {
		this.feiraNome = feiraNome;
	}
	
	public String getFeiraEndereco() {
		return feiraEndereco;
	}

	public void setFeiraEndereco(String feiraEndereco) {
		this.feiraEndereco = feiraEndereco;
	}

	public List<BuscaProdutoComPrecoDto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<BuscaProdutoComPrecoDto> produtos) {
		this.produtos = produtos;
	}

	public static BuscaPorProdutorPorFeiraDto converter(ProdutorProdutoFeira listaPorProdutorPorFeira, List<BuscaProdutoComPrecoDto> produtoComPrecoDto) {
		return new BuscaPorProdutorPorFeiraDto(listaPorProdutorPorFeira, produtoComPrecoDto);
	}

}
