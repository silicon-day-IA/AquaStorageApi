package com.example.Java.Service;

import com.example.Java.Entity.WaterStock;
import com.example.Java.Utils.WebappConfig.Response;

public interface WaterStockService {
	
	public Response<Boolean> insertWaterStock();

	public Response<WaterStock> getWaterStock();

}
