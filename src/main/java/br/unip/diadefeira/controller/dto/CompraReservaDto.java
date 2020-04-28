package br.unip.diadefeira.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.unip.diadefeira.modelo.CompraReserva;
import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.modelo.ListaProdutos;

public class CompraReservaDto {
	private Long idCompraReserva;
	private String usuarioEmail;
	private String usuarioNome;
	private String produtorEmail;
	private String produtorNome;
	private Feira feira;
	private LocalDateTime dataReserva;
	private LocalDateTime dataVenda;
	private Double avaliacaoProdutor;
	private Double avaliacaoCliente;
	private List<ListaProdutosDto> listaProdutosDto;
	
	
	public CompraReservaDto(CompraReserva compraReserva) {
		this.idCompraReserva = compraReserva.getIdCompraReserva();
		this.usuarioEmail = compraReserva.getUsuario().getEmail();
		this.usuarioNome = compraReserva.getUsuario().getNome();
		this.produtorEmail = compraReserva.getProdutor().getEmail();
		this.produtorNome = compraReserva.getProdutor().getNome();
		this.feira = compraReserva.getFeira();
		this.dataReserva = compraReserva.getDataReserva();
		this.dataVenda = compraReserva.getDataVenda();
		this.avaliacaoProdutor = compraReserva.getAvaliacaoProdutor();
		this.avaliacaoCliente = compraReserva.getAvaliacaoCliente();
		
		this.listaProdutosDto = ListaProdutosDto.converter(compraReserva.getListaProdutos());
	}
	
	public Long getIdCompraReserva() {
		return idCompraReserva;
	}

	public void setIdCompraReserva(Long idCompraReserva) {
		this.idCompraReserva = idCompraReserva;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getProdutorEmail() {
		return produtorEmail;
	}

	public void setProdutorEmail(String produtorEmail) {
		this.produtorEmail = produtorEmail;
	}

	public String getProdutorNome() {
		return produtorNome;
	}

	public void setProdutorNome(String produtorNome) {
		this.produtorNome = produtorNome;
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
	
	public List<ListaProdutosDto> getListaProdutosDto() {
		return listaProdutosDto;
	}

	public void setListaProdutosDto(List<ListaProdutosDto> listaProdutosDto) {
		this.listaProdutosDto = listaProdutosDto;
	}
}
