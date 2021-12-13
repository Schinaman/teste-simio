package com.mercadolivre.testesimios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolivre.testesimios.entities.DNA;
import com.mercadolivre.testesimios.entities.DNARequestException;
import com.mercadolivre.testesimios.repositories.DNARepository;

@Service
public class DNAService {

	@Autowired
	private DNARepository repository;

	public List<DNA> findAll() {
		return repository.findAll();
	}

	public DNA insert(DNA obj) {

		if (obj.getDna().size()<4) {
			throw new DNARequestException("EXCEPTION: Dimensão da Matriz menor que 4");
		}
			
		for (String elements : obj.getDna()) {
			if (obj.getDna().size() != elements.length()) {
				System.out.println("Size " + obj.getDna().size() + "elements " + elements.length());
				throw new DNARequestException("EXCEPTION: A Matriz não é quadrada");
			}
		}

		for (int i = 0; i < obj.getDna().size(); i++) {
			for (int j = 0; j < obj.getDna().size(); j++) {
				if ((obj.getDna().get(i).charAt(j) != 'A') && (obj.getDna().get(i).charAt(j) != 'C')
						&& (obj.getDna().get(i).charAt(j) != 'T') && (obj.getDna().get(i).charAt(j) != 'G')) {
					throw new DNARequestException("EXCEPTION: Caracteres precisam ser 'A', 'C', 'T' ou 'G' ");
				}
			}
		}
		
		obj.setSimian(obj.isSimian());
		return repository.save(obj);
	}
}






// for (int j = 0; j < obj.getDna().size(); j++) {
// for (int i = 0; i < obj.getDna().size(); i++) {
// System.out.print(obj.getDna().get(j).charAt(i) +" ");
// }
// System.out.println();
// }
