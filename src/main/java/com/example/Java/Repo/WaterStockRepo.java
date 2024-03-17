package com.example.Java.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.WaterStock;

@Repository
public interface WaterStockRepo extends JpaRepository<WaterStock, Long>{

}
