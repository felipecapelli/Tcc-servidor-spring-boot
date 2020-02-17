package br.unip.diadefeira.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CompraReserva implements Serializable{
	
	@Id
	private Long idCompraReserva;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Produtor produtor;
	@ManyToOne
	private Feira feira;
	private LocalDateTime dataReserva;
	private LocalDateTime dataVenda;
	private Double avaliacaoProdutor;
	private Double avaliacaoCliente;
	
	public Long getIdCompraReserva() {
		return idCompraReserva;
	}
	public void setIdCompraReserva(Long idCompraReserva) {
		this.idCompraReserva = idCompraReserva;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	public LocalDateTime getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDateTime dataReserva) {
		this.dataReserva = dataReserva;
	}
	public LocalDateTime getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Double getAvaliacaoProdutor() {
		return avaliacaoProdutor;
	}
	public void setAvaliacaoProdutor(Double avaliacaoProdutor) {
		this.avaliacaoProdutor = avaliacaoProdutor;
	}
	public Double getAvaliacaoCliente() {
		return avaliacaoCliente;
	}
	public void setAvaliacaoCliente(Double avaliacaoCliente) {
		this.avaliacaoCliente = avaliacaoCliente;
	}
	
}
