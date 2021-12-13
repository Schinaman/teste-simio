package com.mercadolivre.testesimios.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Stats {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int count_mutant_dna= 0;
	private  int count_human_dna=0;
	private double ratio=0;
	
	public Stats() {
		super();
	}
	
	public Stats(int humans, int simians, double ratio) {
		super();
		this.count_mutant_dna = humans;
		this.count_human_dna = simians;
		this.ratio = ratio;
	}
	

	public int getCount_mutant_dna() {
		return count_mutant_dna;
	}

	public void setCount_mutant_dna(int count_mutant_dna) {
		this.count_mutant_dna = count_mutant_dna;
	}

	public int getCount_human_dna() {
		return count_human_dna;
	}

	public void setCount_human_dna(int count_human_dna) {
		this.count_human_dna = count_human_dna;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(count_mutant_dna, ratio, count_human_dna);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stats other = (Stats) obj;
		return count_mutant_dna == other.count_mutant_dna && Double.doubleToLongBits(ratio) == Double.doubleToLongBits(other.ratio)
				&& count_human_dna == other.count_human_dna;
	}
	
	
	
}