
package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BasicSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("user").password("{noop}user123").roles("USER").and().withUser("admin")
				.password("{noop}admin123").roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET, "/api/emp/employees").hasRole("USER")
				.antMatchers(HttpMethod.POST, "/api/emp/createEmployee").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST, "/api/emp/createEmployeeusingmybatis").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET, "/api/emp/employeesusingmybatis").hasRole("USER")
				.antMatchers(HttpMethod.GET, "/api/emp/getById/{id}").hasRole("USER")
				.antMatchers(HttpMethod.GET, "/api/emp/employeeswithroles").hasRole("USER").and().csrf().disable()
				.formLogin().disable();
	}
}
