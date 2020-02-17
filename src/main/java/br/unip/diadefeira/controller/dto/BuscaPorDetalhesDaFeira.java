package br.unip.diadefeira.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.Produtor;
import br.unip.diadefeira.modelo.ProdutorProdutoFeira;

public class BuscaPorDetalhesDaFeira {
	private String produtorEmail;
	private String produtorNome;

	public BuscaPorDetalhesDaFeira(Produtor produtor) {
		this.produtorEmail = produtor.getEmail();
		this.produtorNome = produtor.getNome();
	}
	
	public String getProdutorEmail() {
		return produtorEmail;
	}

	public void setProdutorEmail(String produtorEmail) {
		this.produtorEmail = produtorEmail;
	}

	public String getProdutorNome() {
		return produtorNome;
	}

	public void setProdutorNome(String produtorNome) {
		this.produtorNome = produtorNome;
	}

	public static List<BuscaPorDetalhesDaFeira> converter(List<Produtor> produtores) {
		return produtores.stream().map(BuscaPorDetalhesDaFeira::new).collect(Collectors.toList());
	}

}
