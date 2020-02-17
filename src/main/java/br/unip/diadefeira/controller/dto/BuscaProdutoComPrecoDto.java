package br.unip.diadefeira.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.ProdutorProdutoFeira;
import br.unip.diadefeira.modelo.Tipo;

public class BuscaProdutoComPrecoDto {
	private Long idProduto;
	private String nomeProduto;
	private BigDecimal preco;
	private Tipo tipo;
	private boolean organico;
	private String unidade;
	
	public BuscaProdutoComPrecoDto(ProdutorProdutoFeira produtorProdutoFeira) {
		this.idProduto = produtorProdutoFeira.getIdChaveComposta().getProduto().getIdProduto();
		this.nomeProduto = produtorProdutoFeira.getIdChaveComposta().getProduto().getNome();
		this.preco = produtorProdutoFeira.getPreco();
		this.tipo  = produtorProdutoFeira.getIdChaveComposta().getProduto().getTipo();
		this.organico = produtorProdutoFeira.getIdChaveComposta().getProduto().isOrganico();
		this.unidade = produtorProdutoFeira.getIdChaveComposta().getProduto().getUnidade();
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public static List<BuscaProdutoComPrecoDto> converter(List<ProdutorProdutoFeira> listaPorProdutorPorFeira) throws IndexOutOfBoundsException{
		return listaPorProdutorPorFeira.stream().map(BuscaProdutoComPrecoDto::new).collect(Collectors.toList());
	}
	
}
