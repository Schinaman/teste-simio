package com.mercadolivre.testesimios.entities;

public class DNARequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;


	public DNARequestException(String message) {
		super(message);
	}


	public DNARequestException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
