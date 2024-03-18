package com.example.Java.Service;

import com.example.Java.Entity.WaterArrival;
import com.example.Java.Utils.WebappConfig.Response;

public interface WaterArrivalService {
	
	public Response<Boolean> insertWaterArrivalSource();

	public Response<WaterArrival> getWaterArrivalSource();

}
