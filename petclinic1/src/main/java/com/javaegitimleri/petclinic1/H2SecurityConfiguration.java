/*package com.javaegitimleri.petclinic1;

import org.springframework.context.annotation.Configuration;

@Configuration
@Order(value=0)
public class H2SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//h2-console ile başlayan web  resource'ları için devreye girecek
		http.antMatcher("/h2-console/**").authorizeRequests().anyRequest().permitAll();
		http.csrf().disable();
		http.headers.frameOptions.disable();
	}
	
}
*/