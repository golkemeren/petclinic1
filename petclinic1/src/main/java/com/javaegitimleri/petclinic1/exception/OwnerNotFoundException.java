package com.javaegitimleri.petclinic1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class OwnerNotFoundException extends RuntimeException {

	public OwnerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
