package br.unip.diadefeira.controller.dto;



import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


import br.unip.diadefeira.modelo.Feira;

public class FeiraDto{
	//@JsonProperty("idFeira")
	private Long idFeira;
	//@JsonProperty("nomeFeira")
	private String nomeFeira;
	//@JsonProperty("enderecoFeira")
	private String enderecoFeira;
	//@JsonProperty("dataFeira")
	private LocalDateTime dataFeira;
	
	public FeiraDto(Feira feira) {
		this.idFeira = feira.getId();
		this.nomeFeira = feira.getNome();
		this.enderecoFeira = feira.getEndereco();
		this.dataFeira = feira.getData();
	}

	public Long getId() {
		return idFeira;
	}

	public void setId(Long id) {
		this.idFeira = id;
	}
	
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

	public LocalDateTime getData() {
		return dataFeira;
	}

	public void setData(LocalDateTime data) {
		this.dataFeira = data;
	}
	
	public static List<FeiraDto> converter(List<Feira> feiras) {
		return feiras.stream().map(FeiraDto::new).collect(Collectors.toList());
	}

}
