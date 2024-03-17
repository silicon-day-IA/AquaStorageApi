package com.example.Java.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Java.Entity.WaterSource;

@Repository
public interface WaterSourceRepo extends JpaRepository<WaterSource, Long>{

}
