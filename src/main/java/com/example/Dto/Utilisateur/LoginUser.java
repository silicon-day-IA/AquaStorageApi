package com.example.Dto.Utilisateur;

public class LoginUser {
	
	private String mail;
	private String password;

	public LoginUser() {
	}

	public LoginUser(String mail, String password) {
		this.mail = mail;
		this.password = password;
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
}
