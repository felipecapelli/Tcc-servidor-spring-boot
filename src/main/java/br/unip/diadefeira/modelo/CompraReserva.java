package br.unip.diadefeira.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.unip.diadefeira.controller.form.CompraReservaForm;

@Entity
public class CompraReserva implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@OneToMany(mappedBy = "listaProdutosID.compraReserva")
	private List<ListaProdutos> listaProdutos;

	public CompraReserva() {}
	
	public CompraReserva(CompraReservaForm compraReservaForm, Usuario usuario, Produtor produtor, Feira feira, LocalDateTime dataReserva) {
		this.usuario = usuario;
		this.produtor = produtor;
		this.feira = feira;
		this.dataReserva = dataReserva;
	}
	public List<ListaProdutos> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<ListaProdutos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
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
