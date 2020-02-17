package br.unip.diadefeira.controller.dto;


import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produtor;

public class ProdutorNoLocalDto {
	private String email;
	private String nome;
	private String endereco;

	public ProdutorNoLocalDto() {}

	public ProdutorNoLocalDto(Produtor produtor) {
		this.email = produtor.getEmail();
		this.nome = produtor.getNome();
		this.endereco = produtor.getEndereco();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static List<ProdutorNoLocalDto> converter(List<Produtor> produtores) {
		return produtores.stream().map(ProdutorNoLocalDto::new).collect(Collectors.toList());
	}

}
