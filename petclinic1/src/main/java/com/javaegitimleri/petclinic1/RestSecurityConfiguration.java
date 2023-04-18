/*package com.javaegitimleri.petclinic1;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Order(value=1)  // bu değer sayesinde restsecurityconfiguration diğer security sınıflarından daha önce yüklencek 
@Configuration
public class RestSecurityConfiguration extends AbstarctSecurityConfiguration {

	@Override 
	protected void configure(HttpSecurity http) throws Exception {
		
		super.configure(http);
		http.antMatcher("/rest/**");
		http.authorizeRequests().antMatchers("/rest/**".access("hasRole('EDITOR')"));
	     http.csrf().disable();
	      http.httpBasic();
	}
}
*/
