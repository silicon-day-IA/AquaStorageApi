package com.example.Java.Repo;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.Utilisateur;

@Repository
public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long>{
	
	@Query("SELECT u FROM Utilisateur u LEFT JOIN FETCH u.Territory WHERE u.id = :id")
	public Optional<Utilisateur> findById(Utilisateur utilisateur);
	
	@Query("SELECT u FROM Utilisateur u LEFT JOIN FETCH u.Territory WHERE u.name = :name")
	public Utilisateur findByName(String name);

	@Query("SELECT u FROM Utilisateur u LEFT JOIN FETCH u.Territory WHERE u.email = :email")
	public Utilisateur findByEmailIgnoreCase(String email);
	
	@Query("SELECT u FROM Utilisateur u LEFT JOIN FETCH u.Territory WHERE u.territoryId = :territoryId")
	public Utilisateur findByTerritoryId(Long territoryId);
	
	public void delete(Utilisateur utilisateur);
}
