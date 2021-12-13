package com.mercadolivre.testesimios.entities;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DNAExceptionHandler {
		
		@ExceptionHandler(value = {DNARequestException.class})
		public ResponseEntity<Object> handleException(DNARequestException e){
			HttpStatus forbidden = HttpStatus.FORBIDDEN;
			
			DNAException dnaException = new DNAException(e.getMessage(),forbidden);
			return new ResponseEntity<>(dnaException,forbidden);
		}
}