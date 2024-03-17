package com.example.AquaStorageApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Data
@Entity
@AllArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur{
	
	@Id
	private String Id;
	
	@Column(name = "nom")
	private String nom;
	
	
}