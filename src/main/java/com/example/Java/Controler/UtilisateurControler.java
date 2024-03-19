package com.example.Java.Controler;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Java.Dto.Utilisateur.CreateUser;
import com.example.Java.Dto.Utilisateur.LoginUser;
import com.example.Java.Entity.Utilisateur;
import com.example.Java.Service.UtilisateurService;
import com.example.Java.Service.ServiceIMPL.UtilisateurServiceImpl;
import com.example.Java.Utils.PasswordUtils;
import com.example.Java.Utils.WebappConfig.Response;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin
@RequestMapping("/ASapi/v1/utilisateur")
@RequiredArgsConstructor
@Slf4j
public class UtilisateurControler {
	
	@Autowired
	PasswordUtils passwordUtils = new PasswordUtils();
	
	Response response = new Response();
	

	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@Autowired
	private UtilisateurServiceImpl utilisateurServiceImpl;
	
	@PostMapping("/Register")
	public Response<Boolean> register(@RequestBody CreateUser user) {
		if (user == null) {
			return Response.failedResponse("User null");
		}
		Utilisateur utilisateur = new Utilisateur(user.getNom(), user.getMail(), user.getPassword(), user.getRole());
		System.out.println("User created : " + utilisateur.toString());
		return utilisateurServiceImpl.addUtilisateur(utilisateur);
	}
	
	@GetMapping("/Login")
	public Response<Utilisateur> login(@RequestBody LoginUser utilisateur) {
		Utilisateur user = utilisateurServiceImpl.getUtilisateurByMail(utilisateur.getMail()).getData();
		if (user != null) {
			if (passwordUtils.matchPassword(utilisateur.getPassword(), user.getPassword())) {
				return Response.successfulResponse("Login successful",user);
			}
			return Response.failedResponse("Login failed : wrong password");
		}
		return Response.failedResponse("Login failed : wrong email");
	}

	
	
	
	
}
