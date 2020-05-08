package br.unip.diadefeira.controller.form;

import java.math.BigDecimal;

public class ListaDeProdutosform {
	private Long idProduto;
	private BigDecimal preco;
	
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
}
