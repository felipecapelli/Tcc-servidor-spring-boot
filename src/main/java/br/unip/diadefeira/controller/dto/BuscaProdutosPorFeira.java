package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produto;

public class BuscaProdutosPorFeira {
	private Long idProduto;
	private String nome;

	public BuscaProdutosPorFeira(Produto produto) {
		this.idProduto = produto.getIdProduto();
		this.nome = produto.getNome();
	}
	
	
	public Long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public static List<BuscaProdutosPorFeira> converter(List<Produto> produtos) {
		return produtos.stream().map(BuscaProdutosPorFeira::new).collect(Collectors.toList());
	}

}
