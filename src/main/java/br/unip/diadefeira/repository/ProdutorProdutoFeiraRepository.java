package br.unip.diadefeira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.unip.diadefeira.modelo.ProdutorProdutoFeira;
import br.unip.diadefeira.modelo.ProdutorProdutoFeiraID;

public interface ProdutorProdutoFeiraRepository extends JpaRepository<ProdutorProdutoFeira, ProdutorProdutoFeiraID>{
	
	@Query("select ppf from ProdutorProdutoFeira ppf\n" +
			"inner join Produto pd on ppf.idChaveComposta.produto.idProduto = pd.idProduto\n" + 
			"inner join Feira f on ppf.idChaveComposta.feira.id = f.id\n" + 
			"where pd.nome like %:nomeProduto%\n" + 
			"and f.endereco like %:endereco%\n" +
			"and f.data >= current_date")
	public List<ProdutorProdutoFeira>buscaProdutorProdutoFeiraPorProduto(@Param("nomeProduto") String nomeProduto, @Param("endereco") String endereco);
	
	@Query("select ppf from ProdutorProdutoFeira ppf\n" + 
			"inner join Produtor p on p.email = ppf.idChaveComposta.produtor.email\n" + 
			"where ppf.idChaveComposta.produtor.email = :usuarioEmail\n" + 
			"and ppf.idChaveComposta.feira.id = :idFeira")
	public List<ProdutorProdutoFeira> buscaPorProdutorPorFeira(@Param("usuarioEmail") String usuarioEmail,@Param("idFeira") Long idFeira) throws IndexOutOfBoundsException;

	@Query("select distinct ppf.idChaveComposta.produtor.email from ProdutorProdutoFeira ppf\n" + 
			"inner join Produtor p on p.email = ppf.idChaveComposta.produtor.email\n" + 
			"inner join Usuario u on u.email = p.email\n" + 
			"where ppf.idChaveComposta.feira.id = :idFeira")
	public List<String> buscaPorDetalhesDaFeira(@Param("idFeira")Long idFeira);//esse aqui tem o DISTINCT
	
	@Query("select distinct ppf.idChaveComposta.produto.idProduto from ProdutorProdutoFeira ppf\n" + 
			"inner join Produto pdto on pdto.idProduto = ppf.idChaveComposta.produto.idProduto\n" +
			"where ppf.idChaveComposta.feira.id = :idFeira")
	public List<Long> buscaPorProdutosPorFeira(@Param("idFeira") Long idFeira);
	
	@Query("select ppf from ProdutorProdutoFeira ppf\n" +
			"inner join Feira f on ppf.idChaveComposta.feira.id = f.id\n" +
			"inner join Produto pdto on pdto.idProduto = ppf.idChaveComposta.produto.idProduto\n" +
			"where ppf.idChaveComposta.feira.id = :idFeira\n" +
			"and ppf.idChaveComposta.produto.idProduto = :idProduto")
	public List<ProdutorProdutoFeira> listaProdutoresPorfeiraPorProduto(@Param("idFeira")Long idFeira, @Param("idProduto") Long idProduto);
	
	@Query("select distinct ppf.idChaveComposta.feira.id from ProdutorProdutoFeira ppf\n" +
			"inner join Feira f on ppf.idChaveComposta.feira.id = f.id\n" +
			"inner join Produtor p on p.email = ppf.idChaveComposta.produtor.email\n" +
			"where ppf.idChaveComposta.produtor.nome like %:usuarioNome%\n" +
			"and f.data >= current_date")
	public List<Long> buscaFeirasFuturasDoProdutor(@Param("usuarioNome") String usuarioNome);//o resultado desse selecte sera usado no FeiraRepository - Relatório 6
	
	@Query("select distinct ppf.idChaveComposta.produto.idProduto from ProdutorProdutoFeira ppf\n" +
			"inner join Produto p on ppf.idChaveComposta.produto.idProduto = p.idProduto\n" +
			"inner join Produtor p on p.email = ppf.idChaveComposta.produtor.email\n" +
			"inner join Feira f on ppf.idChaveComposta.feira.id = f.id\n" + //para mostrar apenas os produtos com data atual
			"where ppf.idChaveComposta.produtor.nome like %:usuarioNome%\n" +
			"and f.data >= current_date")
	public List<Long> buscaProdutosFuturosDoProdutor(@Param("usuarioNome") String usuarioNome);//o resultado desse select será usado no ProdutorRepository - Relatório 6
}
