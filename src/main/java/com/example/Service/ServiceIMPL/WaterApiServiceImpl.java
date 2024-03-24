package com.example.Service.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Dto.Utilisateur.ResultApi.ChroniqueResult;
import com.example.Dto.Utilisateur.ResultApi.OuvrageDTO;
import com.example.Dto.Utilisateur.ResultApi.OuvragesResult;
import com.example.Dto.Utilisateur.ResultApi.PointsPrelevementResult;
import com.example.Dto.Utilisateur.ResultApi.WaterConsumptionDTO;
import com.example.Dto.Utilisateur.ResultApi.zonePrelevementReceive;
import com.example.Entity.Ouvrage;
import com.example.Entity.WaterConsumption;
import com.example.Entity.ZonePrelevement;
import com.example.Repo.OuvrageRepo;
import com.example.Repo.WaterConsumptionRepo;
import com.example.Repo.ZonePrelevementRepo;
import com.example.Utils.Mapping.OuvrageMapper;
import com.example.Utils.Mapping.WaterConsumptionMapper;
import com.example.Utils.Mapping.ZonePrelevementMapper;
import com.fasterxml.jackson.databind.ObjectMapper;






@Service

public class WaterApiServiceImpl {
    
    private final String CHRONIQUES_API_URL = "https://hubeau.eaufrance.fr/api/v1/prelevements/chroniques";
    private final String OUVRAGE_API_URL = "https://hubeau.eaufrance.fr/api/v1/prelevements/referentiel/ouvrages";
    private final String POINTS_PRELEVEMENT_API_URL = "https://hubeau.eaufrance.fr/api/v1/prelevements/referentiel/points_prelevement";
    
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(WaterApiServiceImpl.class);

    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    private OuvrageRepo ouvrageRepository;
    private ZonePrelevementRepo zonePrelevementRepository;
    private WaterConsumptionRepo waterConsumptionRepository;
    private List<String> ouvrageList;

    @Autowired
    public void WaterApiService(RestTemplate restTemplate, ObjectMapper objectMapper,
                           OuvrageRepo ouvrageRepository,
                           ZonePrelevementRepo zonePrelevementRepository,
                           WaterConsumptionRepo waterConsumptionRepository) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.ouvrageRepository = ouvrageRepository;
        this.zonePrelevementRepository = zonePrelevementRepository;
        this.waterConsumptionRepository = waterConsumptionRepository;
    }

    public void insertChroniquesByDepartment(String departmentCode) {
        String url = CHRONIQUES_API_URL + "?code_commune=" + departmentCode;
		for (String ouvrage : ouvrageList) {
			url += "&code_ouvrage=" + ouvrage;
		}
		url=url + "&format=json&size=30";
        String jsonData = restTemplate.getForObject(url, String.class);
        try {
            ChroniqueResult result = objectMapper.readValue(jsonData, ChroniqueResult.class);
            for (WaterConsumptionDTO chronique : result.getData()) {
            	logger.info(chronique.toString());
            	WaterConsumption waterConsumption = WaterConsumptionMapper.mapToEntity(chronique);
            	waterConsumptionRepository.save(waterConsumption);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertOuvragesByDepartment(String departmentCode) {
        String url = OUVRAGE_API_URL + "?code_departement=" + departmentCode + "&format=json&size=10";
        String jsonData = restTemplate.getForObject(url, String.class);
        ouvrageList = new ArrayList<>();
        try {
            OuvragesResult result = objectMapper.readValue(jsonData, OuvragesResult.class);
            for (OuvrageDTO ouvrage : result.getData()) {
            	logger.info(ouvrage.toString());
            	ouvrageList.add(ouvrage.getCodeOuvrage());
            	Ouvrage ouvrageEntity = OuvrageMapper.toEntity(ouvrage);
                ouvrageRepository.save(ouvrageEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertPointsPrelevementByDepartment(String departmentCode) {
        String url = POINTS_PRELEVEMENT_API_URL + "?code_departement=" ;
        for (String ouvrage : ouvrageList) {
			url += "&code_ouvrage=" + ouvrage;
		}
		url=url + "&format=json&size=20";
        String jsonData = restTemplate.getForObject(url, String.class);
        try {
            PointsPrelevementResult result = objectMapper.readValue(jsonData, PointsPrelevementResult.class);
            for (zonePrelevementReceive zonePrelevement : result.getData()) {
            	logger.info(zonePrelevement.toString());
            	ZonePrelevement zonePrelevementEntity = ZonePrelevementMapper.mapToEntity(zonePrelevement);
            	zonePrelevementRepository.save(zonePrelevementEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

