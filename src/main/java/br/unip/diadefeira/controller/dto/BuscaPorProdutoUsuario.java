package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Usuario;

public class BuscaPorProdutoUsuario {
	private String email;
	private String nome;
	
	public BuscaPorProdutoUsuario(Usuario usuario){
		this.email = usuario.getEmail();
		this.nome = usuario.getNome();
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

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
	
}
