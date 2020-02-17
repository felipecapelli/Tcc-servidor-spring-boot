package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ListaProdutos implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	private CompraReserva compraReserva;
	@Id
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
