package br.unip.diadefeira.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.unip.diadefeira.modelo.Feira;
import br.unip.diadefeira.modelo.Produtor;

public interface FeiraRepository extends JpaRepository<Feira, Long>{
	
	@Query("select f from Feira f where f.endereco like %:endereco%")
	List<Feira>buscaFeiraPorEndereco(@Param("endereco") String endereco);
	
	Optional<Feira> findById(@Param("IdFeira") Long IdFeira);

}
