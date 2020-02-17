package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Usuario;

public class UsuarioDto {
	private String email;
	private String nome;
	private String senha;
	private String fotografia;
	private Double avaliacaoMedia;
	private String telefone;
	
	public UsuarioDto(Usuario usuario){
		this.email = usuario.getEmail();
		this.nome = usuario.getNome();
		this.senha = usuario.getSenha();
		this.fotografia = usuario.getFotografia();
		this.avaliacaoMedia = usuario.getAvaliacaoMedia();
		this.telefone = usuario.getTelefone();
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public Double getAvaliacaoMedia() {
		return avaliacaoMedia;
	}

	public void setAvaliacaoMedia(Double avaliacaoMedia) {
		this.avaliacaoMedia = avaliacaoMedia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
	
}
