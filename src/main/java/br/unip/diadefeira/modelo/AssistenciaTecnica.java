package br.unip.diadefeira.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AssistenciaTecnica implements Serializable{
	@Id
	private Long idAssitenciaTecnica;
	@ManyToOne
	private Produtor produtor;
	@ManyToOne
	private Extencionista extencionista;
	private LocalDateTime dataVisita;
	private String Orientacoes;
	private Double avaliacaoProdutor;
	private Double avaliacaoExtencionista;
	
	public Long getIdAssitenciaTecnica() {
		return idAssitenciaTecnica;
	}
	public void setIdAssitenciaTecnica(Long idAssitenciaTecnica) {
		this.idAssitenciaTecnica = idAssitenciaTecnica;
	}
	public Produtor getProdutor() {
		return produtor;
	}
	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}
	public Extencionista getExtencionista() {
		return extencionista;
	}
	public void setExtencionista(Extencionista extencionista) {
		this.extencionista = extencionista;
	}
	public LocalDateTime getDataVisita() {
		return dataVisita;
	}
	public void setDataVisita(LocalDateTime dataVisita) {
		this.dataVisita = dataVisita;
	}
	public String getOrientacoes() {
		return Orientacoes;
	}
	public void setOrientacoes(String orientacoes) {
		Orientacoes = orientacoes;
	}
	public Double getAvaliacaoProdutor() {
		return avaliacaoProdutor;
	}
	public void setAvaliacaoProdutor(Double avaliacaoProdutor) {
		this.avaliacaoProdutor = avaliacaoProdutor;
	}
	public Double getAvaliacaoExtencionista() {
		return avaliacaoExtencionista;
	}
	public void setAvaliacaoExtencionista(Double avaliacaoExtencionista) {
		this.avaliacaoExtencionista = avaliacaoExtencionista;
	}
	
}
