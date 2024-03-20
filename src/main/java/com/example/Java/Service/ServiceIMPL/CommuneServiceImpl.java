package com.example.Java.Service.ServiceIMPL;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Service;

import com.example.Java.Entity.Commune;
import com.example.Java.Repo.CommuneRepo;
import com.example.Java.Service.CommuneService;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("ComuneService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CommuneServiceImpl implements CommuneService{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Autowired
	private CommuneRepo communeRepo;
	
	@Override
	public Response<Integer> getCommuneByCodePostal(int codePostal) {
		if (codePostal <= 0 || codePostal > 99999) {
			return Response.failedResponse("Code postal is not valid");
		}
		TypedQuery<Integer> query = entityManager.createNamedQuery("Commune.findByCodePostal",Integer.class);
		query.setParameter("codePostal", codePostal);
		int insee = query.getSingleResult();
		if (insee == 0) {
			return Response.failedResponse("Commune not found");	
		}
		return Response.successfulResponse("Commune found", insee);
	}
	

}
