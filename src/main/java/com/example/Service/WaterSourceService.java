package com.example.Service;

import com.example.Entity.WaterSource;
import com.example.Utils.WebappConfig.Response;

public interface WaterSourceService {
	
	public Response<Boolean> insertWaterSource();

	public Response<WaterSource> getWaterSource();

}
