package br.unip.diadefeira.controller.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.unip.diadefeira.modelo.ProdutorProdutoFeira;
import br.unip.diadefeira.modelo.Tipo;

public class BuscaProdutoresNumaFeiraComProdutoEspecificoDto implements Serializable{
	
	//dados do produtor (mas somente com dados da tabela usuario)
	private String email;
	private String nomeProdutor;
	
	//dados da feira
	private Long idFeira;
	private String nomeFeira;
	private String enderecoFeira;
	
	//dados do Produto
	private Long idProduto;
	private String nomeDoProduto;
	private Tipo tipo;
	private boolean organico;
	private String unidade;
	
	private BigDecimal preco;
	
	public BuscaProdutoresNumaFeiraComProdutoEspecificoDto() {}

	public BuscaProdutoresNumaFeiraComProdutoEspecificoDto(ProdutorProdutoFeira produtorPorFeiraPorProduto) {
		this.email = produtorPorFeiraPorProduto.getIdChaveComposta().getProdutor().getEmail();
		this.nomeProdutor = produtorPorFeiraPorProduto.getIdChaveComposta().getProdutor().getNome();
		
		this.idFeira = produtorPorFeiraPorProduto.getIdChaveComposta().getFeira().getId();
		this.nomeFeira = produtorPorFeiraPorProduto.getIdChaveComposta().getFeira().getNome();
		this.enderecoFeira = produtorPorFeiraPorProduto.getIdChaveComposta().getFeira().getEndereco();
		
		this.idProduto = produtorPorFeiraPorProduto.getIdChaveComposta().getProduto().getIdProduto();
		this.nomeDoProduto = produtorPorFeiraPorProduto.getIdChaveComposta().getProduto().getNome();
		this.tipo = produtorPorFeiraPorProduto.getIdChaveComposta().getProduto().getTipo();
		this.organico = produtorPorFeiraPorProduto.getIdChaveComposta().getProduto().isOrganico();
		this.unidade = produtorPorFeiraPorProduto.getIdChaveComposta().getProduto().getUnidade();
		this.preco = produtorPorFeiraPorProduto.getPreco();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeProdutor() {
		return nomeProdutor;
	}

	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}

	public Long getIdFeira() {
		return idFeira;
	}

	public void setIdFeira(Long idFeira) {
		this.idFeira = idFeira;
	}

	public String getNomeFeira() {
		return nomeFeira;
	}

	public void setNomeFeira(String nomeFeira) {
		this.nomeFeira = nomeFeira;
	}

	public String getEnderecoFeira() {
		return enderecoFeira;
	}

	public void setEnderecoFeira(String enderecoFeira) {
		this.enderecoFeira = enderecoFeira;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public static List<BuscaProdutoresNumaFeiraComProdutoEspecificoDto> converter(List<ProdutorProdutoFeira> listaProdutoresPorFeiraPorProduto) {
		return listaProdutoresPorFeiraPorProduto.stream().map(BuscaProdutoresNumaFeiraComProdutoEspecificoDto::new).collect(Collectors.toList());
	}

}
