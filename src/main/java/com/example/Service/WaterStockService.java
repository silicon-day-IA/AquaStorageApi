package com.example.Service;

import com.example.Entity.WaterStock;
import com.example.Utils.WebappConfig.Response;

public interface WaterStockService {
	
	public Response<Boolean> insertWaterStock();

	public Response<WaterStock> getWaterStock();

}
