package com.mercadolivre.testesimios.entities;

import java.io.Serializable;
import java.util.Objects;

public class DNASequence implements Serializable{
	private static final long serialVersionUID = 1L;

	private String Id;
	private String isSimio;
	private String sequencia;
	
	public DNASequence() {
		super();
	}

	public DNASequence(String id, String isSimio) {
		super();
		Id = id;
		this.isSimio = isSimio;
	}


	public String getId() {
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
