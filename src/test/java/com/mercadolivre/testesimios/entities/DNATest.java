package com.mercadolivre.testesimios.entities;

import static org.junit.jupiter.api.Assertions.fail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DNATest {
	
//	Primeiro TesteBasico:
//		["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"] = Retorna true
//		["ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"] = retorna false 
	//Essas duas 
	
//Diagonal Secundaria
	@Test
	void testHasNoSecondDiagonalCombination() {
		DNA dna = new DNA(Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"));
		Assertions.assertEquals(false, dna.hasSecondDiagonalCombination());
	}
	@Test
	void testHasSecondDiagonalCombination() {
		DNA dna = new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGC", "AGAACG", "GCCCTA", "TCCCTG"));
		Assertions.assertEquals(true, dna.hasSecondDiagonalCombination());
	}

//Diagonal principal
	@Test
	void testHasNoMainDiagonalCombination() {
		DNA dna = new DNA(Arrays.asList("ATGCGA", "CGGTGC", "TTATGC", "AGAACG", "CCCCTA", "TCCCTG"));
		Assertions.assertEquals(false, dna.hasMainDiagonalCombination());
	}
	@Test
	void testHasMainDiagonalCombination() {
		DNA dna = new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGT", "ATATCG", "CCTCTA", "TCATTG"));
		Assertions.assertEquals(true, dna.hasMainDiagonalCombination());
	}
	
//Horizontal	
	@Test
	void testHasNoHorizontalCombination() {
		DNA dna = new DNA(Arrays.asList("ATGCTA", "CAGTTC", "TTATTT", "AGAATG", "CTCTTA", "TCTCTG"));
		Assertions.assertEquals(false, dna.hasHorizontalCombination());
	}
	@Test
	void testHasHorizontalCombination() {
		DNA dna = new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGC", "AGAACG", "CCCCTA", "TCGCTG"));
		Assertions.assertEquals(true, dna.hasHorizontalCombination());
	}

//Vertical
	@Test
	void testHasNoVertialCombination() {
		DNA dna = new DNA(Arrays.asList("ATGCGA", "CAGTTC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"));
		Assertions.assertEquals(false, dna.hasVerticalCombination());
	}
	@Test
	void testVerticalCombination() {
		DNA dna = new DNA(Arrays.asList("ATGCGA", "CCGTGC", "TTATGC", "AGAAGG", "CTCCTA", "TCCCTG"));
		Assertions.assertEquals(true, dna.hasVerticalCombination());
	}
	
//		for (int j = 0; j < dna.getDna().size(); j++) {
//			for (int i = 0; i < dna.getDna().size(); i++) {
//				System.out.print(dna.getDna().get(j).charAt(i) + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
	
	@Test
	void testIsSimian() {
		DNA dna1 = new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGC", "AGAACG", "GCCCTA", "TCCCTG")); //só tem secundaria
		DNA dna2= new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGT", "ATATCG", "CCTCTA", "TCATTG")); //só tem principal
		DNA dna3= new DNA(Arrays.asList("TTGCGA", "CAGTGC", "TTATGC", "AGAACG", "CCCCTA", "TCGCTG")); //só tem horizontal
		DNA dna4 = new DNA(Arrays.asList("ATGCGA", "CCGTGC", "TTATGC", "AGAAGG", "CTCCTA", "TCCCTG")); //só tem vertical
		boolean validador = dna1.isSimian() && dna2.isSimian() && dna3.isSimian() && dna4.isSimian();
		Assertions.assertEquals(true, validador);
	}




}
