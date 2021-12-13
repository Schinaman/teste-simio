package com.mercadolivre.testesimios.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.entities.DNARequestException;

class DNAServiceTest {

	@Test
	void testThrowsRequestExceptionSizeLessThan4() {
		DNAService dnaService = new DNAService();
		DNA dna = new DNA(Arrays.asList("ATGCTA", "CAGTTC", "TTATTT"));
		DNARequestException exception = Assertions.assertThrows(DNARequestException.class, () -> dnaService.insert(dna));
		Assertions.assertEquals("EXCEPTION: Dimensão da Matriz menor que 4", exception.getMessage());
	}
	
	@Test
	void testThrowsRequestExceptionNotSquaredMatrix() {
		DNAService dnaService = new DNAService();
		DNA dna = new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TAATGT", "AGACTG", "ACGCAA", "TCACG"));
		DNARequestException exception = Assertions.assertThrows(DNARequestException.class, () -> dnaService.insert(dna));
		Assertions.assertEquals("EXCEPTION: A Matriz não é quadrada", exception.getMessage());
	}
	
	@Test
	void testThrowsRequestExceptionNotAllowedChar() {
		DNAService dnaService = new DNAService();
		DNA dna = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TZATGT", "AGAXYG", "AQDVZA", "TCACTG"));
		DNARequestException exception = Assertions.assertThrows(DNARequestException.class, () -> dnaService.insert(dna));
		Assertions.assertEquals("EXCEPTION: Caracteres precisam ser 'A', 'C', 'T' ou 'G' ", exception.getMessage());
	}


}
