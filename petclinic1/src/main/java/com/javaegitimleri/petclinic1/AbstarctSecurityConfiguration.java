/*package com.javaegitimleri.petclinic1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public  abstract class AbstarctSecurityConfiguration extends WebSecurityConfigurerAdapter{
 
	@Autowired
	private DataSource dataSource;
	
	@Override 
	protected void configure(AuthenticationManagerBuild auth) throws Exception {
		auth.jdbcAuthentication().dataSoruce(dataSource);
	}
}
*/
