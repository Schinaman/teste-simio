package com.mercadolivre.testesimios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.entities.Stats;
import com.mercadolivre.testesimios.repositories.DNARepository;
import com.mercadolivre.testesimios.repositories.StatRepository;

@Service
public class StatService {

	@Autowired
	private StatRepository repository;
	@Autowired
	private DNARepository dRepository;
	
	
	public Stats insert(Stats obj) {
		return repository.save(obj);
	}
	
	public void delete(Stats obj) {
		repository.delete(obj);
	}
	
	public Stats getStats(){
		repository.deleteAll();
		List<DNA> dnas = dRepository.findAll();
		Stats stat = new Stats();			
		stat.setCount_mutant_dna(0);
		stat.setCount_human_dna(0);
		for(DNA dna : dnas){
			if (dna.isSimian() == true) stat.setCount_mutant_dna(stat.getCount_mutant_dna()+1);
			if (dna.isSimian() == false) stat.setCount_human_dna(stat.getCount_human_dna()+1);;
			}	
		stat.setRatio((double)stat.getCount_mutant_dna()/stat.getCount_human_dna());
		repository.save(stat);
		return stat;
	}
	


}
