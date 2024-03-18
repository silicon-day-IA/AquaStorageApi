package com.example.Java.Service;

import com.example.Java.Entity.WaterSource;
import com.example.Java.Utils.WebappConfig.Response;

public interface WaterSourceService {
	
	public Response<Boolean> insertWaterSource();

	public Response<WaterSource> getWaterSource();

}
