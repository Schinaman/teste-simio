package com.mercadolivre.testesimios.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		
//		String[] a = new String[] {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
//		List<String> list = new ArrayList<>();
//		list = Arrays.asList(a);
//		System.out.println(list.size()  +"XXXX" + list);
//		
//		DNA d1 = new DNA(list);
//		DNA d2 = new DNA(Arrays.asList(a));
//		DNA d3 = new DNA(Arrays.asList(a));
//		DNA d4 = new DNA(Arrays.asList(a));
//		
//		
//		dnaRepository.saveAll(Arrays.asList(d1,d2,d3,d4));
//		System.out.println(list.size());
//		System.out.println(list.get(0).length());
//		System.out.println(d1);
		
		
		
	}
}
	


