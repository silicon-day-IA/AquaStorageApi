package com.example.Service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.example.Entity.WaterArrival;
import com.example.Service.WaterArrivalService;
import com.example.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("WaterArrivalService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class WaterArrivalServiceImpl implements WaterArrivalService{

	@Override
	public Response<Boolean> insertWaterArrivalSource() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterArrivalServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<WaterArrival> getWaterArrivalSource() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterArrivalServiceImpl.class.getCanonicalName());
	}

}
