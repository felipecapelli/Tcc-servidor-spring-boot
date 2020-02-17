package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProdutorProdutoFeiraID implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Produtor produtor;
	@ManyToOne
	private Feira feira;
	@ManyToOne
	private Produto produto;
	
	public ProdutorProdutoFeiraID() {}
	
	public ProdutorProdutoFeiraID(Produtor produtor, Feira feira, Produto produto) {
		this.produtor = produtor;
		this.feira = feira;
		this.produto = produto;
	}

	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	public Feira getFeira() {
		return feira;
	}
	public void setFeira(Feira feira) {
		this.feira = feira;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
