package com.example.Java.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Java.Entity.Utilisateur;
import com.example.Java.Service.UtilisateurService;
import com.example.Java.Service.ServiceIMPL.UtilisateurServiceImpl;
import com.example.Java.Utils.PasswordUtils;
import com.example.Java.Utils.WebappConfig.Response;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/ASapi/v1/utilisateur")
@RequiredArgsConstructor
public class UtilisateurControler {

	PasswordUtils passwordUtils = new PasswordUtils();
	Response response = new Response();
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@Autowired
	private UtilisateurServiceImpl utilisateurServiceImpl;
	
	@PostMapping("/Register")
	public Response<Boolean> register(@RequestBody Utilisateur utilisateur) {
		return utilisateurServiceImpl.addUtilisateur(utilisateur);
	}
	
	@PostMapping("/Login")
	public Response<Utilisateur> login(@RequestBody Utilisateur utilisateur) {
		Utilisateur user = utilisateurServiceImpl.getUtilisateurByMail(utilisateur.getEmail()).getData();
		if (user != null) {
			if (passwordUtils.matchPassword(utilisateur.getPassword(), user.getPassword())) {
				return Response.successfulResponse("Login successful",user);
			}
			return Response.failedResponse("Login failed : wrong password");
		}
		return Response.failedResponse("Login failed : wrong email");
	}
	
	
	
	
	
}
