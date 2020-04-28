package br.unip.diadefeira.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.CompraReserva;

public class CompraDtoResumido extends CompraReservaResumidoDto{
	
	private LocalDateTime dataVenda;

	public CompraDtoResumido(CompraReserva compra) {
		super(compra);
		this.dataVenda = compra.getDataVenda();
	}

	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public static List<CompraDtoResumido> converterCompraDtoResumido(List<CompraReserva> compraReserva) {
		return compraReserva.stream().map(CompraDtoResumido::new).collect(Collectors.toList());
	}
	
}
