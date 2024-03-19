package com.example.Java.Service.ServiceIMPL;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Java.Entity.Utilisateur;
import com.example.Java.Repo.UtilisateurRepo;
import com.example.Java.Service.UtilisateurService;
import com.example.Java.Utils.PasswordUtils;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("UtilisateurService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UtilisateurServiceImpl implements UtilisateurService{
	
	PasswordUtils passwordUtils = new PasswordUtils();
	
	@Autowired
	private UtilisateurRepo utilisateurRepo;

	@Override
	public Response<Boolean> addUtilisateur(Utilisateur utilisateur) {
		if (utilisateur == null) {
			return Response.failedResponse("Utilisateur null");
		}
		utilisateur.setPassword(passwordUtils.encryptPassword(utilisateur.getPassword()));
		utilisateurRepo.save(utilisateur);
		return Response.successfulResponse("Utilisateur added");
	}
	
	
	@Override
	public Response<Boolean> deleteUtilisateur(Utilisateur utilisateur) {
		new Response<>();
		if (utilisateur == null || utilisateurRepo.findById(utilisateur.getId()).isEmpty()) {
			return Response.failedResponse("Utilisateur not null");
		}
		utilisateurRepo.delete(utilisateur);
		return Response.successfulResponse("Utilisateur deleted");
	}

	@Override
	public Response<Boolean> updateUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null; 
	}
	
	
	
	

	@Override
	public Response<Utilisateur> getUtilisateur(Long id) {
		if (id == null) {
			return Response.failedResponse("Utilisateur not null");
		}
		return Response.successfulResponse("Utilisateur found", utilisateurRepo.findById(id).get());
	}


	@Override
	public Response<Utilisateur> getUtilisateurByNom(String nom) {
		if (nom == null) {
			return Response.failedResponse("no name found");
		};
		Utilisateur utilisateur = utilisateurRepo.findByName(nom);
		if (utilisateur != null) {
			return Response.successfulResponse("Utilisateur found", utilisateur);
			
		}
		return Response.failedResponse("Utilisateur not found");
	}

	@Override
	public Response<Utilisateur> getUtilisateurByMail(String mail) {
		if (mail == null) {
			return Response.failedResponse("no mail found");
		};
		Utilisateur utilisateur = utilisateurRepo.findByEmailIgnoreCase(mail);
		if (utilisateur != null) {
			return Response.successfulResponse("Utilisateur found", utilisateur);
			
		}
		return Response.failedResponse("Utilisateur not found");
	}


	
	
	
	
	

}
