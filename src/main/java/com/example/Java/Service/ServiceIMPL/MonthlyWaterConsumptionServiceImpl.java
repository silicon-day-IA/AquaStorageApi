package com.example.Java.Service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.example.Java.Entity.MonthlyWaterConsumption;
import com.example.Java.Service.MonthlyWaterConsumptionService;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("MonthlyWaterConsumptionService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MonthlyWaterConsumptionServiceImpl implements MonthlyWaterConsumptionService{
	
	
	@Override
	public Response<Boolean> insertMonthlyWaterConsumption() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + MonthlyWaterConsumptionServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<MonthlyWaterConsumption> getMonthlyWaterConsumption() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + MonthlyWaterConsumptionServiceImpl.class.getCanonicalName());
	}

}
