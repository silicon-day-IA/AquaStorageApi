package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.ZonePrelevement;

@Repository
public interface ZonePrelevementRepo extends JpaRepository<ZonePrelevement, String> {
    // You can add custom query methods if needed
}

