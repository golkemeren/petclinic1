package com.javaegitimleri.petclinic1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PetClinicConfiguration {
@Autowired
 private PetClinicProperties petClinicProperties;
@PostConstruct
public void init() { 
	System.out.println("Display owners with pets :" +petClinicProperties.isDisplayOwnerWithPets());
	
}


}
