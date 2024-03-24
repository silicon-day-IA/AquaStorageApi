package com.example.Service;

import com.example.Entity.DailyWaterConsumption;
import com.example.Utils.WebappConfig.Response;

public interface DailyWaterConsumptionService {
	
	public Response<Boolean> insertDailyWaterConsumption();

	public Response<DailyWaterConsumption> getDailyWaterConsumption();
	
	

}
