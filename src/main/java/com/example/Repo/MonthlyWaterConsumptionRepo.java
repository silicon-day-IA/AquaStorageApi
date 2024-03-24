package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.MonthlyWaterConsumption;

@Repository
public interface MonthlyWaterConsumptionRepo extends JpaRepository<MonthlyWaterConsumption, Long>{

}
