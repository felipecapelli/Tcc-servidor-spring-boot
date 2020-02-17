package br.unip.diadefeira.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PlanejamentoProducao implements Serializable{
	
	@Id
	private Long idPlanejamentoProducao;
	@ManyToOne
	private Produtor produtor;
	@ManyToOne
	private Produto produto;
	private Long qtdePrevista;
	private LocalDateTime dataPrevista;
	
	public Long getIdPlanejamentoProducao() {
		return idPlanejamentoProducao;
	}
	public void setIdPlanejamentoProducao(Long idPlanejamentoProducao) {
		this.idPlanejamentoProducao = idPlanejamentoProducao;
	}
	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getQtdePrevista() {
		return qtdePrevista;
	}
	public void setQtdePrevista(Long qtdePrevista) {
		this.qtdePrevista = qtdePrevista;
	}
	public LocalDateTime getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(LocalDateTime dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	
}
