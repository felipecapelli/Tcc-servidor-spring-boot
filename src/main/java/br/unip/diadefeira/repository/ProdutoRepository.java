package br.unip.diadefeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unip.diadefeira.modelo.Produto;

public interface ProdutoRepository   extends JpaRepository<Produto, Long>{

	public Produto findByIdProduto(Long produto);
}
