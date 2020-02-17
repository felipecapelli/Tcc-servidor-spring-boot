package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="email")
public class Produtor extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nomeSitio;
	private String endereco;
	private String entidadeSocial;
	
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
	
}
