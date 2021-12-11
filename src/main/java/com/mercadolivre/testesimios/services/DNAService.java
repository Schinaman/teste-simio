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
	
	public List<DNA> findAll(){
		return repository.findAll();
		
	}
	
	public DNA insert(DNA obj) {
		obj.setSimian(obj.isSimian());;
		
		//Tamanho precisa ser maior 
		//if obj.getDna().size()
		
		
		
		//Excecao elementos colunas diferem entre si
		for (String elements : obj.getDna()) {
			if (obj.getDna().size() != elements.length()) throw new DNARequestException("EXCEPTION: A Matriz não é quadrada: Elementos das colunas diferem"); 
			System.out.println("Size " + obj.getDna().size() + "elements " + elements.length());
		}
		
		//Valida Caracter
		for (int i = 0; i < obj.getDna().size(); i++) {
			for (int j = 0; j < obj.getDna().size(); j++) {
				if 		  ((obj.getDna().get(i).charAt(j) != 'A') && (obj.getDna().get(i).charAt(j) != 'C') 
						&& (obj.getDna().get(i).charAt(j) != 'T') && (obj.getDna().get(i).charAt(j) != 'G')) {
					throw new DNARequestException("Caracteres precisam ser 'A', 'C', 'T' ou 'G' ");
				}
			}
		}
		
		System.out.print(obj);
		return repository.save(obj);
	}
}
