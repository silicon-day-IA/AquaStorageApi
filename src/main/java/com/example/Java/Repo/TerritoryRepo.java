package com.example.Java.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.Territory;

@Repository
public interface TerritoryRepo extends JpaRepository<Territory, Long>{

}
