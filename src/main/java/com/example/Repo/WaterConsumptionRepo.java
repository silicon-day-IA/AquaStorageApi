package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.WaterConsumption;

@Repository
public interface WaterConsumptionRepo extends JpaRepository<WaterConsumption, Long> {
    // You can add custom query methods if needed
}

