package com.example.Java.Service.ServiceIMPL;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Java.Entity.Territory;
import com.example.Java.Service.TerritoryService;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("TerritoryService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class TerritoryServiceImpl implements TerritoryService{

	@Override
	public Response<Boolean> saveTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Boolean> updateTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Boolean> deleteTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Territory> getTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<List<Territory>> getAllTerritory() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Territory> getTerritoryByName() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<Territory> getTerritoryByUtilisateur() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + TerritoryServiceImpl.class.getCanonicalName());
	}

}
