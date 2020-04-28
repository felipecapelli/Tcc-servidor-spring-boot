package br.unip.diadefeira.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.unip.diadefeira.modelo.CompraReserva;

public interface CompraReservaRepository  extends JpaRepository<CompraReserva, Long>{
	
	Optional<CompraReserva> findByIdCompraReserva(@Param("IdCompraReserva") Long IdCompraReserva);
	
	@Query("select r from CompraReserva r where r.dataVenda = null and usuario.email = :email")
	List<CompraReserva> buscaReservas(@Param("email") String email);
	
	@Query("select r from CompraReserva r where r.dataVenda <> null and usuario.email = :email")
	List<CompraReserva> buscaCompras(@Param("email") String email);
	
	@Query("select cr from CompraReserva cr where cr.idCompraReserva = :idCompraReserva")
	CompraReserva buscaCompraOuReserva(@Param("idCompraReserva") Long idCompraReserva);
}
