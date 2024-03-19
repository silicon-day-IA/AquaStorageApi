package com.example.Java.Service;

import com.example.Java.Entity.MonthlyWaterConsumption;
import com.example.Java.Utils.WebappConfig.Response;

public interface MonthlyWaterConsumptionService {
	
	public Response<Boolean> insertMonthlyWaterConsumption();
	
	public Response<MonthlyWaterConsumption> getMonthlyWaterConsumption();

}
