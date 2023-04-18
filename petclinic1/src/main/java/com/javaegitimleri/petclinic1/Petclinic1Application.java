package com.javaegitimleri.petclinic1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableJpaAuditing(auditorAwareRef="petClinicAuditorAware")
@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value=PetClinicProperties.class)
public class Petclinic1Application {

	public static void main(String[] args) {
		SpringApplication.run(Petclinic1Application.class, args);
	

	}

}
