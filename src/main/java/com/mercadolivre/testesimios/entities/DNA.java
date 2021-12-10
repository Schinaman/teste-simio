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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "tb_dna")
public class DNA implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private boolean isSimio;
	@ElementCollection
	private List<String> dna = new ArrayList<>();
	
	
	public DNA() {
		super();
		if ((checkDiagonal() || checkHorizontal() || checkVertical()) == true) this.isSimio = true;
	}
	
	public DNA(List<String> dna) {
		super();
		this.dna = dna;
		if ((checkDiagonal() || checkHorizontal() || checkVertical()) == true) this.isSimio = true;
	}

	
	public boolean isSimio() {
		return isSimio;
	}
	public void setSimio(boolean isSimio) {
		this.isSimio = isSimio;
	}
	public Long getId() {
		return Id;
	}
	public List<String> getDna() {
		return dna;
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
	
	
	private boolean checkDiagonal() {
		outer: for (int j = 3; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if (dna.get(i).charAt(j) == dna.get(i - 1).charAt(j - 1)) {
					if (dna.get(i).charAt(j) == dna.get(i - 2).charAt(j - 2)) {
						if (dna.get(i).charAt(j) == dna.get(i - 3).charAt(j - 3)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean checkHorizontal() {
		outer: for (int j = 0; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if (dna.get(i).charAt(j) == dna.get(i - 1).charAt(j)) {
					if (dna.get(i).charAt(j) == dna.get(i - 2).charAt(j)) {
						if (dna.get(i).charAt(j) == dna.get(i - 3).charAt(j)) {
							System.out.println(" " +  dna.get(i - 3).charAt(j) +  dna.get(i - 2).charAt(j) +  dna.get(i - 1).charAt(j) +  dna.get(i ).charAt(j));
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean checkVertical() {
		outer: for (int j = 0; j < dna.size(); j++) {
			for (int i = 3; i < dna.size(); i++) {
				if (dna.get(j).charAt(i) == dna.get(j).charAt(i - 1)) {
					if (dna.get(j).charAt(i) == dna.get(j).charAt(i - 2)) {
						if (dna.get(j).charAt(i) == dna.get(j).charAt(i - 3)) {
							System.out.println(" " + dna.get(j).charAt(i-3) + dna.get(j).charAt(i - 2) + dna.get(j).charAt(i - 1) + dna.get(j).charAt(i - 0));
							return true;
						}
					}
				}
			}
		}
	return false;
	}
	
}
