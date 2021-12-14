package com.mercadolivre.testesimios.entities;

public class DNAUtils {

public static boolean isSimian(String[] dna) {
	char dnaTable[][] = mountDnaTable(dna);
	printTable(dnaTable);
	return hasHorizontalCombination(dnaTable) || hasSecondDiagonalCombination(dnaTable) 
			|| hasVerticalCombination(dnaTable) || hasMainDiagonalCombination(dnaTable);
}

	public static boolean hasHorizontalCombination(char[][] dnaTable) {
		for (char[] dna : dnaTable) {
			for (int j = 0; j < dna.length - 3; j++) {
				if (dna[j] == dna[j + 1] && dna[j] == dna[j + 2] && dna[j] == dna[j + 3])
					return true;
			}
		}
		return false;
	}

	public static boolean hasVerticalCombination(char[][] dnaTable) {
		for (int i = 0; i < dnaTable.length; i++) {
			for (int j = 0; j < dnaTable[i].length - 3; j++) {
				if (dnaTable[j][i] == dnaTable[j + 1][i] && dnaTable[j][i] == dnaTable[j + 2][i]
						&& dnaTable[j][i] == dnaTable[j + 3][i]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasMainDiagonalCombination(char[][] dnaTable) {
		for (int i = 0; i < dnaTable.length - 3; i++) {
			for (int j = 0; j < dnaTable[i].length - 3; j++) {
				if (dnaTable[i][j] == dnaTable[i + 1][j + 1] && dnaTable[i][j] == dnaTable[i + 2][j + 2]
						&& dnaTable[i][j] == dnaTable[i + 3][j + 3]) {
					System.out.println();
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasSecondDiagonalCombination(char[][] dnaTable) {
		for (int i = 0; i < dnaTable.length - 3; i++) {
			for (int j = dnaTable[i].length - 1; j > 2; j--) {
				System.out.println(dnaTable[i][j] + " " + dnaTable[i + 1][j - 1] + " " + dnaTable[i + 2][j - 2] + " "
						+ dnaTable[i + 3][j - 3]);
				if (dnaTable[i][j] == dnaTable[i + 1][j - 1] && dnaTable[i][j] == dnaTable[i + 2][j - 2]
						&& dnaTable[i][j] == dnaTable[i + 3][j - 3]) {
					return true;
				}
			}
		}
		return false;
	}

	public static char[][] mountDnaTable(String[] dna) {
		char[][] dnaTable = new char[dna.length][];
		for (int i = 0; i < dna.length; i++) {
			dnaTable[i] = new char[dna[i].length()];
			for (int j = 0; j < dnaTable[i].length; j++) {
				dnaTable[i][j] = dna[i].charAt(j);
			}
		}
		return dnaTable;
	}

	public static void printTable(char[][] dnaTable) {
		for (char[] dna : dnaTable) {
			for (int j = 0; j < dna.length; j++) {
				System.out.print(dna[j] + "  ");
			}
			System.out.print("\n");
		}
	}

}
