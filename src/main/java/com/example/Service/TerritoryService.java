package com.example.Service;

import java.util.List;

import com.example.Entity.Territory;
import com.example.Utils.WebappConfig.Response;

public interface TerritoryService {
	
	public Response<Territory> saveTerritory(Territory territory);
	
	public Response<Boolean> updateTerritory(Territory territory);
	
	public Response<Boolean> deleteTerritory(Long id);
	
	public Response<Territory> getTerritory(Long id);
	
	public Response<List<Territory>> getAllTerritory();
	
	public Response<Territory> getTerritoryByName(String name);
	
	public Response<Territory> getTerritoryByUtilisateur();
	
	

}
