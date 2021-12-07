package com.mercadolivre.testesimios.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DNASequence implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String isSimio;
	private String sequencia;
	
	public DNASequence() {
		super();
	}

	public DNASequence(Long id, String isSimio) {
		super();
		Id = id;
		this.isSimio = isSimio;
	}


	public Long getId() {
		return Id;
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
		DNASequence other = (DNASequence) obj;
		return Objects.equals(Id, other.Id);
	}
	
	
	
}
