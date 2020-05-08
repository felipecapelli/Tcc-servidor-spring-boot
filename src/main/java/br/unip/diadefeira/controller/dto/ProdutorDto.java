package br.unip.diadefeira.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.Usuario;

public class ProdutorDto extends UsuarioDto{
	private String nomeSitio;
	private String endereco;
	private String entidadeSocial;

	public ProdutorDto(Usuario usuario) {
		super(usuario);
		Produtor produtor = (Produtor) usuario;
		this.nomeSitio = produtor.getNomeSitio();
		this.endereco = produtor.getEndereco();
		this.entidadeSocial = produtor.getEntidadeSocial();
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
	
	public static List<UsuarioDto> converter(List<Usuario> usuariosProdutores) {
		List<UsuarioDto> listaDeProdutores = new ArrayList<UsuarioDto>();
		for (Usuario usuarioProdutores : usuariosProdutores) {
			listaDeProdutores.add(new ProdutorDto(usuarioProdutores));
		}
		
		return listaDeProdutores;
	}

}
