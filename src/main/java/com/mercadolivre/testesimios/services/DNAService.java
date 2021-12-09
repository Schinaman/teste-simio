package com.mercadolivre.testesimios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.entities.Stats;
import com.mercadolivre.testesimios.repositories.DNARepository;

@Service
public class DNAService {

	@Autowired
	private DNARepository repository;
	
	public List<DNA> findAll(){
		return repository.findAll();
	}
	
	public DNA insert(DNA obj) {
		return repository.save(obj);
	}
}
