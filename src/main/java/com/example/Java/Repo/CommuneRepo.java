package com.example.Java.Repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Java.Entity.Commune;


@Repository
public interface CommuneRepo extends JpaRepository<Commune, Integer>{

	
}
