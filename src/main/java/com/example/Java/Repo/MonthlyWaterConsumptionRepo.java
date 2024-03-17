package com.example.Java.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.MonthlyWaterConsumption;

@Repository
public interface MonthlyWaterConsumptionRepo extends JpaRepository<MonthlyWaterConsumption, Long>{

}
