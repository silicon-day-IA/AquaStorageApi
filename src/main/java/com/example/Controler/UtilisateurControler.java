package com.example.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.Utilisateur.CreateUser;
import com.example.Dto.Utilisateur.LoginUser;
import com.example.Entity.Territory;
import com.example.Entity.Utilisateur;
import com.example.Service.CommuneService;
import com.example.Service.TerritoryService;
import com.example.Service.UtilisateurService;
import com.example.Service.ServiceIMPL.CommuneServiceImpl;
import com.example.Service.ServiceIMPL.TerritoryServiceImpl;
import com.example.Service.ServiceIMPL.UtilisateurServiceImpl;
import com.example.Service.ServiceIMPL.WaterApiServiceImpl;
import com.example.Utils.PasswordUtils;
import com.example.Utils.WebappConfig.Response;

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
	private TerritoryService territoryService;
	
	@Autowired
	private UtilisateurServiceImpl utilisateurServiceImpl;
	
	@Autowired
	private TerritoryServiceImpl territoryServiceImpl;
	
	@Autowired
	private CommuneService communeService;
	
	@Autowired
	private CommuneServiceImpl communeServiceImpl;

	@Autowired
	private WaterApiServiceImpl waterApiService;



	@PostMapping("/Register")
	public Response<Boolean> register(@RequestBody CreateUser user) {
	    if (user == null) {
	        return Response.failedResponse("User null");
	    }
	    if (utilisateurServiceImpl.getUtilisateurByMail(user.getMail()).getData()!=null ) {
			return Response.failedResponse("mail or territory already exist");
		}
	    if (territoryServiceImpl.getTerritoryByName(user.getTerritory()).getData()!=null) {
	    	System.out.println(user.getTerritory());
			return Response.failedResponse("mail or territory already exist");
		}

	    // Fetch and insert ouvrages, zones de prelevement, and water consumption data for the user's department
	    waterApiService.insertOuvragesByDepartment(String.valueOf(user.getInsee()).substring(0, 2));
	    waterApiService.insertPointsPrelevementByDepartment(String.valueOf(user.getInsee()).substring(0, 2));
	    waterApiService.insertChroniquesByDepartment(String.valueOf(user.getInsee()).substring(0, 2));

	    // Create Territory
	    Territory territory = new Territory(user.getTerritory(), communeServiceImpl.getCommuneByCodePostal(user.getInsee(),user.getTerritory()).getData());
	    System.out.println("Territory created : " + territory.toString());
	    Territory territory2 =  territoryServiceImpl.saveTerritory(territory).getData();

	    // Create User
	    Utilisateur utilisateur = new Utilisateur(user.getNom(), user.getMail(), user.getPassword(), user.getRole(),territory2);
	    System.out.println("User created : " + utilisateur.toString());
	    return utilisateurServiceImpl.addUtilisateur(utilisateur);
	}

	
	@PostMapping("/Login")
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
