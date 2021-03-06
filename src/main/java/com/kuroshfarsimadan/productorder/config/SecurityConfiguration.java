package com.kuroshfarsimadan.productorder.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;


/**
 * @author Kurosh Farsi Madan
 *
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Value(value = "${auth0.apiAudience}")
	private String apiAudience;
	@Value(value = "${auth0.issuer}")
	private String issuer;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    JwtWebSecurityConfigurer
        .forRS256(apiAudience, issuer)
        .configure(http)
        .authorizeRequests()
        .antMatchers(HttpMethod.POST, "/api/v1/products").permitAll()
        .antMatchers(HttpMethod.GET, "/api/v1/products").hasAuthority("view:products")
        .antMatchers(HttpMethod.GET, "/api/v1/products/**").hasAuthority("view:product")
        .anyRequest().authenticated();
	}

}

