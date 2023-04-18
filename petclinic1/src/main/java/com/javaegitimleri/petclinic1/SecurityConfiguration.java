/*package com.javaegitimleri.petclinic1;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true,prePostEnabled=true,jsr250Enabled=true)
public class SecurityConfiguration extends AbstractSecurityConfiguration {
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("//favicon.ico", "/css/**", "js/**", "/images/**", "/webjars/**", "/login.html").permitAll()
				.antMatchers("/actuator/**").access("hasRole('ADMIN')")
				.anyRequest().authenticated();
		http.formLogin().loginPage("/login.html").loginProcessingUrl("/login")
				.failureUrl("/login.html?loginFailed=true");

		http.rememberMe().userDetailsService(userDetailsService);
	
	      	}
}
*/
