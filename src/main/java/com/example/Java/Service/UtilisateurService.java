package com.example.Java.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.Java.Entity.Utilisateur;
import com.example.Java.Utils.WebappConfig.Response;

public interface UtilisateurService {
	
	public Response<Boolean> addUtilisateur(Utilisateur utilisateur);

	public Response<Boolean> deleteUtilisateur(Utilisateur utilisateur);

	public Response<Boolean> updateUtilisateur(Utilisateur utilisateur);

	public Response<Utilisateur> getUtilisateur(Long id);

	public Response<Utilisateur> getUtilisateurByNom(String nom);

	public Response<Utilisateur> getUtilisateurByMail(String mail);

}