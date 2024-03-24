package com.example.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.Entity.Utilisateur;
import com.example.Utils.WebappConfig.Response;

public interface UtilisateurService {
	
	public Response<Boolean> addUtilisateur(Utilisateur utilisateur);

	public Response<Boolean> deleteUtilisateur(Utilisateur utilisateur);

	public Response<Boolean> updateUtilisateur(Utilisateur utilisateur);

	public Response<Utilisateur> getUtilisateur(Long id);

	public Response<Utilisateur> getUtilisateurByNom(String nom);

	public Response<Utilisateur> getUtilisateurByMail(String mail);

	Response<Utilisateur> getUtilisateurByMailAndTerritory(String mail, String territory);

}