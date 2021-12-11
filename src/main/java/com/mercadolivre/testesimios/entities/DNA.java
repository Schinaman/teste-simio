package com.mercadolivre.testesimios.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dna")
public class DNA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ElementCollection
	private List<String> dna = new ArrayList<>();
	private boolean simian;

	public DNA() {
		super();
		this.simian = isSimian();
	}

	public DNA(List<String> dna) {
		super();
		this.dna = dna;
		//this.simian = isSimian();
	}



	public Long getId() {
		return Id;
	}

	public List<String> getDna() {
		return dna;
	}

	public boolean isSimian() {
		return ((hasMainDiagonalCombination() || hasSecondDiagonalCombination() || hasVerticalCombination()
				|| hasHorizontalCombination()));
	}

	public void setSimian(boolean simian) {
		this.simian = simian;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DNA other = (DNA) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "DNA [Id=" + Id + ", dna=" + dna + ", simian=" + simian + "]";
	}

	public boolean hasMainDiagonalCombination() {
		for (int j = 3; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if ((dna.get(i).charAt(j) == dna.get(i - 1).charAt(j - 1))
						&& (dna.get(i).charAt(j) == dna.get(i - 2).charAt(j - 2))
						&& (dna.get(i).charAt(j) == dna.get(i - 3).charAt(j - 3)))
					return true;
			}
		}
		return false;
	}

	public boolean hasSecondDiagonalCombination() {
		for (int j = 0; j < dna.size() - 3; j++) {
			for (int i = 0; i < dna.size() - 3; i++) {
				if ((dna.get(i).charAt(j) == dna.get(i + 1).charAt(j + 1))
						&& (dna.get(i).charAt(j) == dna.get(i + 2).charAt(j + 2))
						&& (dna.get(i).charAt(j) == dna.get(i + 3).charAt(j + 3)))
					return true;
			}
		}
		return false;
	}

	public boolean hasHorizontalCombination() {
		for (int j = 0; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if ((dna.get(i).charAt(j) == dna.get(i - 1).charAt(j))
						&& (dna.get(i).charAt(j) == dna.get(i - 2).charAt(j))
						&& (dna.get(i).charAt(j) == dna.get(i - 3).charAt(j))) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasVerticalCombination() {
		for (int j = 0; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if ((dna.get(j).charAt(i) == dna.get(j).charAt(i - 1))
						&& (dna.get(j).charAt(i) == dna.get(j).charAt(i - 2))
						&& (dna.get(j).charAt(i) == dna.get(j).charAt(i - 3)))
					return true;
			}
		}
		return false;
	}

}
