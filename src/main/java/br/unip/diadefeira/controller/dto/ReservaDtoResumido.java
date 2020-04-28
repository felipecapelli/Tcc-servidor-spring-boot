package br.unip.diadefeira.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.CompraReserva;

public class ReservaDtoResumido extends CompraReservaResumidoDto{
	private LocalDateTime dataReserva;
	
	public ReservaDtoResumido(CompraReserva reserva) {
		super(reserva);
		this.dataReserva = reserva.getDataReserva();
	}

	public LocalDateTime getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(LocalDateTime dataReserva) {
		this.dataReserva = dataReserva;
	}

	public static List<ReservaDtoResumido> converterReservaDtoResumido(List<CompraReserva> compraReserva) {
		return compraReserva.stream().map(ReservaDtoResumido::new).collect(Collectors.toList());
	}
	
}
