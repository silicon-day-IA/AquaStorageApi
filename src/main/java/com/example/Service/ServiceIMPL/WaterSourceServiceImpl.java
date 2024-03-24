package com.example.Service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.example.Entity.WaterSource;
import com.example.Service.WaterSourceService;
import com.example.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service("WaterSourceService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class WaterSourceServiceImpl implements WaterSourceService{

	@Override
	public Response<Boolean> insertWaterSource() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterSourceServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<WaterSource> getWaterSource() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterSourceServiceImpl.class.getCanonicalName());
	}

}
