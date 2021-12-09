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
import com.mercadolivre.testesimios.services.StatService;

@RestController
public class StatResource {

	
	@Autowired
	private StatService service;
	
	
	@RequestMapping (value = "/stats")
	@GetMapping
	public ResponseEntity<Stats> getStats(){
		return ResponseEntity.ok().body(service.getStats());
	}
	
	
}
