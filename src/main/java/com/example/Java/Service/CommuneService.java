package com.example.Java.Service;

import com.example.Java.Entity.Commune;
import com.example.Java.Utils.WebappConfig.Response;

public interface CommuneService {

	public Response<Integer> getCommuneByCodePostal(int codePostal);
}
