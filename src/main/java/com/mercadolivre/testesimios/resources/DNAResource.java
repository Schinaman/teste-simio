package com.mercadolivre.testesimios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.services.DNAService;

@RestController
@RequestMapping (value = "/simian")
public class DNAResource {

	
	@Autowired
	private DNAService service;
	
	@GetMapping
	public ResponseEntity<List<DNA>> retornaSequencia(){
		List<DNA> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
}
