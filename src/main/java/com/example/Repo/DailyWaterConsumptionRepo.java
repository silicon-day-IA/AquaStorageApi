package com.example.Repo;

import org.springframework.stereotype.Repository;

import com.example.Entity.DailyWaterConsumption;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface DailyWaterConsumptionRepo extends JpaRepository<DailyWaterConsumption, Long>{

}
