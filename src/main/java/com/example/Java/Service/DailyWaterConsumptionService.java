package com.example.Java.Service;

import com.example.Java.Entity.DailyWaterConsumption;
import com.example.Java.Utils.WebappConfig.Response;

public interface DailyWaterConsumptionService {
	
	public Response<Boolean> insertDailyWaterConsumption();

	public Response<DailyWaterConsumption> getDailyWaterConsumption();
	
	

}
