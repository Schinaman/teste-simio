package com.mercadolivre.testesimios.entities;

import java.util.Arrays;
import java.util.List;

public class DNAUtils {

	String[] sequencia = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};

	public void teste(){
		isSimian(sequencia);
		
	}

	public boolean isSimian(String[] dna) {
		return ((checkDiagonal(dna) || checkHorizontal(dna) || checkVertical(dna)) == true);
	}

	private boolean checkDiagonal(String[] dna) {
		List<String> d = Arrays.asList(dna);
		for (int j = 3; j < d.size(); j++) {
			for (int i = 3; i < d.size(); i++) {
				if (d.get(i).charAt(j) == d.get(i - 1).charAt(j - 1)) {
					if (d.get(i).charAt(j) == d.get(i - 2).charAt(j - 2)) {
						if (d.get(i).charAt(j) == d.get(i - 3).charAt(j - 3)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean checkHorizontal(String[] dna) {
		List<String> d = Arrays.asList(dna);
		for (int j = 0; j < d.size(); j++) {
			for (int i = 3; i < d.size(); i++) {
				if (d.get(i).charAt(j) == d.get(i - 1).charAt(j)) {
					if (d.get(i).charAt(j) == d.get(i - 2).charAt(j)) {
						if (d.get(i).charAt(j) == d.get(i - 3).charAt(j)) {
							System.out.println(" " + d.get(i - 3).charAt(j) + d.get(i - 2).charAt(j)
									+ d.get(i - 1).charAt(j) + d.get(i).charAt(j));
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean checkVertical(String[] dna) {
		List<String> d = Arrays.asList(dna);
		for (int j = 0; j < d.size(); j++) {
			for (int i = 3; i < d.size(); i++) {
				if (d.get(j).charAt(i) == d.get(j).charAt(i - 1)) {
					if (d.get(j).charAt(i) == d.get(j).charAt(i - 2)) {
						if (d.get(j).charAt(i) == d.get(j).charAt(i - 3)) {
							System.out.println(" " + d.get(j).charAt(i - 3) + d.get(j).charAt(i - 2)
									+ d.get(j).charAt(i - 1) + d.get(j).charAt(i - 0));
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	
}
