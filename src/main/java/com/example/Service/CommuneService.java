package com.example.Service;

import com.example.Entity.Commune;
import com.example.Utils.WebappConfig.Response;

public interface CommuneService {

	public Response<Integer> getCommuneByCodePostal(int codePostal,String commune);

	Response<Integer> getCommuneByCodeCommune(int codeCommune);
}
