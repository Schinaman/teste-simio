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
import com.mercadolivre.testesimios.services.DNAService;

@RestController
public class DNAResource {

	
	@Autowired
	private DNAService service;
	
	@RequestMapping (value = "/stats")
	@GetMapping
	public ResponseEntity<List<DNA>> retornaSequencia(){
		List<DNA> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping (value = "/simian")
	@PostMapping
	public ResponseEntity<DNA> insert(@RequestBody DNA obj){
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
		//ResponseEntity.created(location)
	}
	
	// "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
	// {"count_mutant_dna": 40, "count_human_dna": 100: "ratio": 0.4}
}

//"id": 1
//"isSimio": "x"
//"sequencia": "x"