package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.WaterStock;

@Repository
public interface WaterStockRepo extends JpaRepository<WaterStock, Long>{

}
