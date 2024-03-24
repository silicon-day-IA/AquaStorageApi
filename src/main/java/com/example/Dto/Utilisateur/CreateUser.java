package com.example.Dto.Utilisateur;

import com.example.Entity.Role;

public class CreateUser {
	private String nom;
	private String mail;
	private String password;
	private String role;
	private String territory;
	private int insee;

	public CreateUser() {
	}

	public CreateUser(String nom, String mail, String password, String role, String territory, int insee) {
		this.nom = nom;
		this.mail = mail;
		this.password = password;
		this.role = role;
		this.territory = territory;
		this.insee = insee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getTerritory() {
		return territory;
	}
	
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	
	public int getInsee() {
		return insee;
	}
	
	public void setInsee(int insee) {
		this.insee = insee;
	}

}
