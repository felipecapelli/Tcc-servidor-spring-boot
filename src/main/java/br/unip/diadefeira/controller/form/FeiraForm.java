package br.unip.diadefeira.controller.form;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import br.unip.diadefeira.controller.dto.FeiraDto;
import br.unip.diadefeira.modelo.Feira;

public class FeiraForm {

	private String nomeFeira;
	private String enderecoFeira;
	private String dataFeira;

	public String getNome() {
		return nomeFeira;
	}

	public void setNome(String nome) {
		this.nomeFeira = nome;
	}

	public String getEndereco() {
		return enderecoFeira;
	}

	public void setEndereco(String endereco) {
		this.enderecoFeira = endereco;
	}

	public String getData() {
		return dataFeira;
	}

	public void setData(String data) {
		this.dataFeira = data;
	}
	
	public static Feira converter(FeiraForm feiraRecebida) {
		
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime time = LocalDateTime.from(LocalDate.parse(feiraRecebida.getData(), formatter).atStartOfDay());
		return new Feira(feiraRecebida.getNome(), feiraRecebida.getEndereco(), time);
	}

}
