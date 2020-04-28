package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ListaProdutos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ListaProdutosID listaProdutosID;
	
	public ListaProdutos() {}
	
	public ListaProdutos(CompraReserva compraReserva, Produto produto) {
		listaProdutosID = new ListaProdutosID();
		this.listaProdutosID.setCompraReserva(compraReserva);
		this.listaProdutosID.setProduto(produto);
	}

	public ListaProdutosID getListaProdutosID() {
		return listaProdutosID;
	}

	public void setListaProdutosID(ListaProdutosID listaProdutosID) {
		this.listaProdutosID = listaProdutosID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
