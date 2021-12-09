package com.mercadolivre.testesimios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mercadolivre.testesimios.entities.Stats;

public interface StatRepository extends JpaRepository<Stats, Long>{

}
