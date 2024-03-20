package com.example.Java.Service;

import java.util.List;

import com.example.Java.Entity.Territory;
import com.example.Java.Utils.WebappConfig.Response;

public interface TerritoryService {
	
	public Response<Territory> saveTerritory(Territory territory);
	
	public Response<Boolean> updateTerritory(Territory territory);
	
	public Response<Boolean> deleteTerritory(Long id);
	
	public Response<Territory> getTerritory(Long id);
	
	public Response<List<Territory>> getAllTerritory();
	
	public Response<Territory> getTerritoryByName(String name);
	
	public Response<Territory> getTerritoryByUtilisateur();
	
	

}
