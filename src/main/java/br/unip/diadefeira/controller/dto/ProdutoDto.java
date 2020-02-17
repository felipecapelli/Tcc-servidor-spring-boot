package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produto;

public class ProdutoDto {
	
	private Long idProduto;
	private String nomeProduto;

	public ProdutoDto(Produto produto) {
		this.idProduto = produto.getIdProduto();
		this.nomeProduto = produto.getNome();
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

	public static List<ProdutoDto> converter(List<Produto> produtos) {
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
	}
	
}
