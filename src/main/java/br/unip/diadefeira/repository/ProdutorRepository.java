package br.unip.diadefeira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.unip.diadefeira.modelo.Produtor;

public interface ProdutorRepository extends JpaRepository<Produtor, String>{

	Produtor findByEmail(@Param("email") String produtor);//usado no relatório 2-Bdo produtorProdutoFeiraController
	
	@Query("select p from Produtor p where p.endereco like %:endereco%")
	List<Produtor> buscarProdutorPorEndereco(@Param("endereco") String endereco);
	
}
