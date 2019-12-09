package com.mackenzie.estacionei.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	// configuracoes de autenticacao
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	}
	
	// configuracoes de autorizacao
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/clientes").permitAll()
		.antMatchers(HttpMethod.GET, "/clientes/*").permitAll()
		.antMatchers(HttpMethod.POST, "/clientes/*").permitAll()
		.antMatchers(HttpMethod.PUT, "/clientes/*").permitAll()
		.anyRequest().permitAll(); // TODO FIX SECURITY
		http.csrf().disable(); // TODO FIX SECURITY
	}
	
	// configuracoes de recursos estaticos
	@Override
	public void configure(WebSecurity web) throws Exception {

	}

}
