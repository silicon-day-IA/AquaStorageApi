package com.example.Java.Service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.example.Java.Entity.DailyWaterConsumption;
import com.example.Java.Service.DailyWaterConsumptionService;
import com.example.Java.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("DailyWaterConsumptionService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class DailyWaterConsumtionServiceImpl implements DailyWaterConsumptionService{

	@Override
	public Response<Boolean> insertDailyWaterConsumption() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + DailyWaterConsumtionServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<DailyWaterConsumption> getDailyWaterConsumption() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + DailyWaterConsumtionServiceImpl.class.getCanonicalName());
	}

}
