package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ListaProdutosAssistencia implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	private AssistenciaTecnica assistenciaTecnica;
	@Id
	@ManyToOne
	private Produto produto;
	
	public AssistenciaTecnica getAssistenciaTecnica() {
		return assistenciaTecnica;
	}
	public void setAssistenciaTecnica(AssistenciaTecnica assistenciaTecnica) {
		this.assistenciaTecnica = assistenciaTecnica;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
