package br.unip.diadefeira.controller.dto;

import java.util.List;

import br.unip.diadefeira.modelo.CompraReserva;

public abstract class CompraReservaResumidoDto {
		private Long idCompraReserva;
		private Long idFeira;
		private String nomeFeira;
		private String emailProdutor;
		private String nomeProdutor;
		
		public CompraReservaResumidoDto(CompraReserva reserva) {
			this.idCompraReserva = reserva.getIdCompraReserva();
			this.idFeira = reserva.getFeira().getId();
			this.nomeFeira = reserva.getFeira().getNome();
			this.emailProdutor = reserva.getProdutor().getEmail();
			this.nomeProdutor = reserva.getProdutor().getNome();
		}
		
		public Long getIdCompraReserva() {
			return idCompraReserva;
		}

		public void setIdCompraReserva(Long idCompraReserva) {
			this.idCompraReserva = idCompraReserva;
		}

		public Long getIdFeira() {
			return idFeira;
		}

		public void setIdFeira(Long idFeira) {
			this.idFeira = idFeira;
		}
		
		public String getNomeFeira() {
			return nomeFeira;
		}

		public void setNomeFeira(String nomeFeira) {
			this.nomeFeira = nomeFeira;
		}

		public String getEmailProdutor() {
			return emailProdutor;
		}

		public void setEmailProdutor(String emailProdutor) {
			this.emailProdutor = emailProdutor;
		}
		
		public String getNomeProdutor() {
			return nomeProdutor;
		}
		
		public void setNomeProdutor(String nomeProdutor) {
			this.nomeProdutor = nomeProdutor;
		}
		
	}
