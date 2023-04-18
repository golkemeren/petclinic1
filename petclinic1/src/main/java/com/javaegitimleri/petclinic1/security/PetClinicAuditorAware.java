package com.javaegitimleri.petclinic1.security;

import java.util.Optional;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class PetClinicAuditorAware implements AuditorAware<String> {

	
	@Override
	public Optional<String> getCurrentAuditor() {
		
		Autentication auth =SecurityContextHolder.getContext().getAuthentication();
           
		return Optional.ofNullable(auth!=null?auth.getName():null);
	}

}
