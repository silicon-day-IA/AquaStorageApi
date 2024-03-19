package com.example.Java.Repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.Territory;

@Repository
public interface TerritoryRepo extends JpaRepository<Territory, Long>{
	
	@Query("SELECT t FROM Territory t WHERE t.territoryId = :idLong")
	public Territory findByTerritoryId(Long idLong);
	
	@Query("SELECT t FROM Territory t WHERE t.territoryName = :territoryName")
	public Territory findByTerritoryName(String territoryName);
	
	@Query("SELECT t FROM Territory t WHERE t.territoryName = :territoryName")
	public Territory findByTerritoryNameIgnoreCase(String territoryName);
	
	@Query("SELECT t FROM Territory t LEFT JOIN FETCH t.DailyWaterConsumption WHERE t.id = :id")
	public Territory findByIdPlusDailyWaterConsumption(Long id);
	
	@Query("SELECT t FROM Territory t LEFT JOIN FETCH t.MonthlyWaterConsumption WHERE t.id = :id")
	public Territory findByIdPlusMonthlyWaterConsumption(Long id);
	
	@Query("SELECT t FROM Territory t LEFT JOIN FETCH t.WaterSource WHERE t.id = :id")
	public Territory findByIdPlusWaterSource(Long id);
}
