package com.example.Repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Commune;


@Repository
public interface CommuneRepo extends JpaRepository<Commune, Integer>{
	
	Commune findByCodeCommune(Integer codeCommune);
	
}
