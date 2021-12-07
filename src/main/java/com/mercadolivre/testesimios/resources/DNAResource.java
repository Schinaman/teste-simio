package com.mercadolivre.testesimios.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolivre.testesimios.entities.DNASequence;

@RestController
@RequestMapping (value = "/simian")
public class DNAResource {
	
	@GetMapping
	public ResponseEntity<DNASequence> retornaSequencia(){
		DNASequence seq = new DNASequence(1L, "x");
		return ResponseEntity.ok().body(seq);
	}
}
