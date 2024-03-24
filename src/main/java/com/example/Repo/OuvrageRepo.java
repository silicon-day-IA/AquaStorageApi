package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Ouvrage;

@Repository
public interface OuvrageRepo extends JpaRepository<Ouvrage, String> {
    // You can add custom query methods if needed
}

