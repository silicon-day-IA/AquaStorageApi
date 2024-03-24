package com.example.Service.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Territory;
import com.example.Repo.TerritoryRepo;
import com.example.Service.TerritoryService;
import com.example.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("TerritoryService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class TerritoryServiceImpl implements TerritoryService{

	@Autowired
	private TerritoryRepo territoryRepo;
	
	@Override
	public Response<Territory> saveTerritory(Territory territory) {
		if (territory == null) {
			return Response.failedResponse("Territory null");
		}
		territoryRepo.save(territory);
		Territory territoryReturn = territoryRepo.findByNameIgnoreCase(territory.getName());
		if (territoryReturn == null) {
			return Response.failedResponse("Error in inserting territory in database, territory not found in database");
		}
        return Response.successfulResponse("Territory added",territoryReturn);
	}

	@Override
	public Response<Boolean> updateTerritory(Territory territory) {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Boolean> deleteTerritory(Long id) {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Territory> getTerritory(Long id) {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<List<Territory>> getAllTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Territory> getTerritoryByName(String name) {
		Territory territory = territoryRepo.findByNameIgnoreCase(name);		
		if (territory==null) {
			return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
		}
		// TODO Auto-generated method stub
		return Response.successfulResponse("territory found",territory);
	}

	@Override
	public Response<Territory> getTerritoryByUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

}
