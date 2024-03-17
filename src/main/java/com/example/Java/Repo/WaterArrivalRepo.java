package com.example.Java.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.WaterArrival;

@Repository
public interface WaterArrivalRepo extends JpaRepository<WaterArrival, Long>{

}
