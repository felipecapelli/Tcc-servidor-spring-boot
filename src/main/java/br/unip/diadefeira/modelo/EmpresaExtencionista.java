package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;


@Entity
public class EmpresaExtencionista implements Serializable{
	
	@Id
	private Long idEmpresa;
	private String nome;
	@Enumerated(EnumType.STRING)
	private PublicaParticular publicaOuParticular;
	
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PublicaParticular getPublicaOuParticular() {
		return publicaOuParticular;
	}
	public void setPublicaOuParticular(PublicaParticular publicaOuParticular) {
		this.publicaOuParticular = publicaOuParticular;
	}
	
}
