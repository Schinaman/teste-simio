package com.mercadolivre.testesimios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.entities.Stats;
import com.mercadolivre.testesimios.services.DNAService;

@RestController
public class DNAResource {

	
	@Autowired
	private DNAService service;
	
	@RequestMapping (value = "/simian")
	@PostMapping
	public ResponseEntity<DNA> insert(@RequestBody DNA obj){
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
	
}
