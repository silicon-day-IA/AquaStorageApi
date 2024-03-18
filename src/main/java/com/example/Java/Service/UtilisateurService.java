package com.example.Java.Service;

import java.util.List;

import com.example.Java.Entity.Utilisateur;
import com.example.Java.Utils.WebappConfig.Response;

public interface UtilisateurService {
	
	public Response<Boolean> addUtilisateur();

	public Response<Boolean> deleteUtilisateur();

	public Response<Boolean> updateUtilisateur();

	public Response<Utilisateur> getUtilisateur();

	public Response<List<Boolean>> getAllUtilisateurByCreatedDate();

	public Response<Utilisateur> getUtilisateurByNom();

	public Response<Utilisateur> getUtilisateurByMail();

	public Response<Utilisateur> getUtilisateurByPassword();

}