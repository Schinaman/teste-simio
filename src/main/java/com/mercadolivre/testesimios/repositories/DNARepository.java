package com.mercadolivre.testesimios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mercadolivre.testesimios.entities.DNASequence;

public interface DNARepository extends JpaRepository<DNASequence, Long>{

}
