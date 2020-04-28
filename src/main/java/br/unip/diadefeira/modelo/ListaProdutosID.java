package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ListaProdutosID implements Serializable{
	
	@ManyToOne
	private CompraReserva compraReserva;
	@ManyToOne
	private Produto produto;
	
	public CompraReserva getCompraReserva() {
		return compraReserva;
	}
	public void setCompraReserva(CompraReserva compraReserva) {
		this.compraReserva = compraReserva;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
