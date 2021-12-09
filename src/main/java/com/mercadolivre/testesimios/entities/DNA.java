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
	}
	
	public DNA(List<String> dna) {
		super();
		this.dna = dna;	
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
	
	
}
