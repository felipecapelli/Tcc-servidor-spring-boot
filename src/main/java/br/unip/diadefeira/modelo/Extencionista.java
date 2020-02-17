package br.unip.diadefeira.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="email")
public class Extencionista extends Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@OneToOne
	private EmpresaExtencionista empresa;
	private Long idEmpresa;
	private String profissao;
	
	public EmpresaExtencionista getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaExtencionista empresa) {
		this.empresa = empresa;
	}
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
