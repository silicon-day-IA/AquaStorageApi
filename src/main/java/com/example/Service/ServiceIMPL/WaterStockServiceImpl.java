package com.example.Service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.example.Entity.WaterStock;
import com.example.Service.WaterStockService;
import com.example.Utils.WebappConfig.Response;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service("WaterStockService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class WaterStockServiceImpl implements WaterStockService{

	@Override
	public Response<Boolean> insertWaterStock() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterStockServiceImpl.class.getCanonicalName());
	}

	@Override
	public Response<WaterStock> getWaterStock() {
		// TODO Auto-generated method stub
		return Response.failedResponse("Not implemented yet, path:" + WaterStockServiceImpl.class.getCanonicalName());
	}

}
