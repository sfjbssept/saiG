package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
	
		http.httpBasic().and().authorizeRequests()
		.antMatchers(HttpMethod.POST, "/post").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/put").hasAnyRole("ADMIN","USER")
		.antMatchers(HttpMethod.GET, "/get/**").hasAnyRole("USER").and().csrf().disable().headers()
		.frameOptions().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("sai").password("sai123").roles("USER").and()
		.withUser("saiadmin").password("sai123").roles("ADMIN").and()
		.withUser("saiuser").password("sai123").roles("USER").and().passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	
	
}
