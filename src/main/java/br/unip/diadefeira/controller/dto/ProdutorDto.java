package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produtor;

public class ProdutorDto{
	private UsuarioDto usuario;
	private String nomeSitio;
	private String endereco;
	private String entidadeSocial;

	public ProdutorDto(Produtor produtor) {
		this.usuario = new UsuarioDto(produtor);
		this.nomeSitio = produtor.getNomeSitio();
		this.endereco = produtor.getEndereco();
		this.entidadeSocial = produtor.getEntidadeSocial();
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public String getNomeSitio() {
		return nomeSitio;
	}

	public void setNomeSitio(String nomeSitio) {
		this.nomeSitio = nomeSitio;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEntidadeSocial() {
		return entidadeSocial;
	}

	public void setEntidadeSocial(String entidadeSocial) {
		this.entidadeSocial = entidadeSocial;
	}
	
	public static List<ProdutorDto> converter(List<Produtor> produtos) {
		return produtos.stream().map(ProdutorDto::new).collect(Collectors.toList());
	}

}
