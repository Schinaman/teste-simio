package com.mercadolivre.testesimios.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.repositories.DNARepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {

	@Autowired	
	private DNARepository dnaRepository;

	@Override
	public void run(String... args) throws Exception { 
		//DNA d1 = new DNA();
		DNA d1 = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"));
		DNA d2 = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"));
		DNA d3 = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"), true);
		DNA d4 = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"), true);
		dnaRepository.saveAll(Arrays.asList(d1,d2,d3,d4));
	}
}
