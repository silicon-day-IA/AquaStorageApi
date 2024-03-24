package com.example.Service;

import com.example.Entity.MonthlyWaterConsumption;
import com.example.Utils.WebappConfig.Response;

public interface MonthlyWaterConsumptionService {
	
	public Response<Boolean> insertMonthlyWaterConsumption();
	
	public Response<MonthlyWaterConsumption> getMonthlyWaterConsumption();

}
