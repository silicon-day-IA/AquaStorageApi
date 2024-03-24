package com.example.Service;

import com.example.Entity.WaterArrival;
import com.example.Utils.WebappConfig.Response;

public interface WaterArrivalService {
	
	public Response<Boolean> insertWaterArrivalSource();

	public Response<WaterArrival> getWaterArrivalSource();

}
