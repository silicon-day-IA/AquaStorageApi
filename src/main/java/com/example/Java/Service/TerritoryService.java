package com.example.Java.Service;

import java.util.List;

import com.example.Java.Entity.Territory;
import com.example.Java.Utils.WebappConfig.Response;

public interface TerritoryService {
	
	public Response<Boolean> saveTerritory();
	
	public Response<Boolean> updateTerritory();
	
	public Response<Boolean> deleteTerritory();
	
	public Response<Territory> getTerritory();
	
	public Response<List<Territory>> getAllTerritory();
	
	public Response<Territory> getTerritoryByName();
	
	public Response<Territory> getTerritoryByUtilisateur();
	
	

}
