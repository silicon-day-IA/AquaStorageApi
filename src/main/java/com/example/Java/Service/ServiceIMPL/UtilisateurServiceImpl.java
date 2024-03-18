package com.example.Java.Service.ServiceIMPL;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Java.Entity.Utilisateur;
import com.example.Java.Service.UtilisateurService;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("UtilisateurService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UtilisateurServiceImpl implements UtilisateurService{

	@Override
	public Response<Boolean> addUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Boolean> deleteUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Boolean> updateUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Utilisateur> getUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<List<Boolean>> getAllUtilisateurByCreatedDate() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Utilisateur> getUtilisateurByNom() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Utilisateur> getUtilisateurByMail() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Utilisateur> getUtilisateurByPassword() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + UtilisateurServiceImpl.class.getCanonicalName());
	}
	
	

}
