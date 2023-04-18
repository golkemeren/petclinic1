package com.javaegitimleri.petclinic1;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="petclinic")
public class PetClinicProperties {

	private  boolean displayOwnerWithPets=true;

	public boolean isDisplayOwnerWithPets() {
		return displayOwnerWithPets;
	}

	public void setDisplayOwnerWithPets(boolean displayOwnerWithPets) {
		this.displayOwnerWithPets = displayOwnerWithPets;
	}
	
	
}
