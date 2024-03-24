package com.example.Service;

public interface WaterService {
    
    // Fetch water consumption data for a given department
    String fetchChroniquesByDepartment(String departmentCode);

    // Fetch water sources (ouvrages) for a given department
    String fetchOuvragesByDepartment(String departmentCode);

    // Fetch water withdrawal points (points de prelevement) for a given department
    String fetchPointsPrelevementByDepartment(String departmentCode);

    // Map the fetched water consumption data to WaterConsumption entity and insert into database
    void insertWaterConsumption(String json);

    // Map the fetched water sources data to Ouvrage entity and insert into database
    void insertOuvrages(String json);

    // Map the fetched water withdrawal points data to ZonePrelevement entity and insert into database
    void insertZonePrelevement(String json);
}

