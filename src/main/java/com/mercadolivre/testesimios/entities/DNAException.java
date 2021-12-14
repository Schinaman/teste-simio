package com.mercadolivre.testesimios.entities;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DNAException  {

	private final String message;
	private final HttpStatus httpStatus;
	
	
	public DNAException(String message, HttpStatus httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}


}
