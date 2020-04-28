package br.unip.diadefeira.controller.form;

import br.unip.diadefeira.modelo.Produto;

public class ListaProdutosFom {
	
	private Long idProduto;
	
	public ListaProdutosFom() {}//nesse caso tem que ter o construtor padrão
	
	public ListaProdutosFom(Long idProduto) {
		this.idProduto = idProduto;
	}

	public ListaProdutosFom(Produto produto) {
		this.idProduto = produto.getIdProduto();
	}
		
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
}
