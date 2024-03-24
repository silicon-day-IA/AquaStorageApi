package com.example.Dto.Utilisateur.ResultApi;


import java.util.List;

import com.example.Entity.WaterConsumption;

public class Chronique {
	List<WaterConsumption> waterConsumptions;
	
	public Chronique() {
	}
	
	public Chronique(List<WaterConsumption> waterConsumptions) {
		this.waterConsumptions = waterConsumptions;
	}
	
	public List<WaterConsumption> getWaterConsumptions() {
		return waterConsumptions;
	}
	
	public void setWaterConsumptions(List<WaterConsumption> waterConsumptions) {
		this.waterConsumptions = waterConsumptions;
	}

	@Override
	public String toString() {
		return "Chronique [waterConsumptions=" + waterConsumptions + "]";
	}
	
	
}
