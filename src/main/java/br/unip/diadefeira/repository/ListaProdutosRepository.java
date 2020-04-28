package br.unip.diadefeira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unip.diadefeira.modelo.CompraReserva;
import br.unip.diadefeira.modelo.ListaProdutos;
import br.unip.diadefeira.modelo.ListaProdutosID;

public interface ListaProdutosRepository  extends JpaRepository<ListaProdutos, ListaProdutosID>{

	List<ListaProdutos> findByListaProdutosIDCompraReservaIdCompraReserva(Long idCompraReserva);

}
