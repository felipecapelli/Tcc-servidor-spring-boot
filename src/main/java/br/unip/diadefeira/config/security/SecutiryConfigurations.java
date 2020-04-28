package br.unip.diadefeira.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import br.unip.diadefeira.repository.UsuarioRepository;

@Configuration
@EnableWebSecurity
public class SecutiryConfigurations extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/feiras/buscaPorEndereco/*").permitAll()
		.antMatchers(HttpMethod.GET, "/Produtor/buscaProdutoresPorEndereco/*").permitAll()
		.antMatchers(HttpMethod.GET, "/produtorProdutoFeira/porProduto/*/*").permitAll()
		.antMatchers(HttpMethod.GET, "/produtorProdutoFeira/detalhesDaFeira/*").permitAll()
		.antMatchers(HttpMethod.GET, "/produtorProdutoFeira/porProdutorPorFeira/*/*").permitAll()
		.antMatchers(HttpMethod.GET, "/produtorProdutoFeira/produtoresNumaFeiraProdutoEspecifico/*/*").permitAll()
		.antMatchers(HttpMethod.GET, "/produtorProdutoFeira/buscaFeirasEProdutosDoProdutor/*").permitAll()
		.antMatchers(HttpMethod.GET, "/usuarios/*").permitAll()
		.antMatchers(HttpMethod.POST, "/autenticacao").permitAll()
		.anyRequest().authenticated()
		.and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}
}