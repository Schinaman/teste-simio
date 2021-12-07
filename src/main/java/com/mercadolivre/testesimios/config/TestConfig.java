package com.mercadolivre.testesimios.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mercadolivre.testesimios.entities.DNASequence;
import com.mercadolivre.testesimios.repositories.DNARepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {

	@Autowired	
	private DNARepository dnaRepository;

	@Override
	public void run(String... args) throws Exception { 
		DNASequence d1 = new DNASequence(null, "x");
		DNASequence d2 = new DNASequence(null, "x");
	
		dnaRepository.saveAll(Arrays.asList(d1,d2));
	}
}
