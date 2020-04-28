package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.ListaProdutos;

public class ListaProdutosDto {
	private Long idProduto;
	private String nomeProduto;
	
	public ListaProdutosDto(ListaProdutos listaProdutos) {
		this.idProduto = listaProdutos.getListaProdutosID().getProduto().getIdProduto();
		this.nomeProduto = listaProdutos.getListaProdutosID().getProduto().getNome();
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

	public static List<ListaProdutosDto> converter(List<ListaProdutos> listaProdutos) {
		return listaProdutos.stream().map(ListaProdutosDto::new).collect(Collectors.toList());
	}
}
