package br.unip.diadefeira.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ProdutorProdutoFeira implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ProdutorProdutoFeiraID idChaveComposta;
	private BigDecimal preco;
	
	public ProdutorProdutoFeiraID getIdChaveComposta() {
		return idChaveComposta;
	}
	public void setIdChaveComposta(ProdutorProdutoFeiraID idChaveComposta) {
		this.idChaveComposta = idChaveComposta;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
