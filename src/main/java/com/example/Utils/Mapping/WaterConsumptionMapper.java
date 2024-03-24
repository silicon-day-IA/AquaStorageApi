package com.example.Utils.Mapping;

import java.util.List;
import java.util.stream.Collectors;

import com.example.Dto.Utilisateur.ResultApi.WaterConsumptionDTO;
import com.example.Entity.WaterConsumption;

public class WaterConsumptionMapper {

    public static WaterConsumption mapToEntity(WaterConsumptionDTO dto) {
        WaterConsumption entity = new WaterConsumption();
        entity.setCodeOuvrage(dto.getCodeOuvrage());
        entity.setAnnee(dto.getAnnee());
        entity.setVolume(dto.getVolume());
        entity.setLibelleUsage(dto.getLibelleUsage());
        entity.setLibelleStatutVolume(dto.getLibelleStatutVolume());
        entity.setLibelleQualificationVolume(dto.getLibelleQualificationVolume());
        entity.setLibelleModeObtentionVolume(dto.getLibelleModeObtentionVolume());
        entity.setPrelevementEcrasant(dto.getPrelevementEcrasant());
        entity.setProducteurDonnee(dto.getProducteurDonnee());
        entity.setLongitude(dto.getLongitude());
        entity.setLatitude(dto.getLatitude());
        entity.setCodeCommuneInsee(dto.getCodeCommuneInsee());
        entity.setNomCommune(dto.getNomCommune());
        entity.setCodeDepartement(dto.getCodeDepartement());
        entity.setLibelleDepartement(dto.getLibelleDepartement());
        entity.setNomOuvrage(dto.getNomOuvrage());
        entity.setUriOuvrage(dto.getUriOuvrage());
        return entity;
    }

    public static List<WaterConsumption> mapToEntityList(List<WaterConsumptionDTO> dtos) {
        return dtos.stream().map(WaterConsumptionMapper::mapToEntity).collect(Collectors.toList());
    }
}

