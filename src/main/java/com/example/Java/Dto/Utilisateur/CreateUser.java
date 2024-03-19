package com.example.Java.Dto.Utilisateur;

import com.example.Java.Entity.Role;

public class CreateUser {
	private String nom;
	private String mail;
	private String password;
	private String role;

	public CreateUser() {
	}

	public CreateUser(String nom, String mail, String password, String role) {
		this.nom = nom;
		this.mail = mail;
		this.password = password;
		this.role = role;
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

}
