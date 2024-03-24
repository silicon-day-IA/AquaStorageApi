package com.example.Utils.Mapping;

import java.util.List;
import java.util.stream.Collectors;

import com.example.Dto.Utilisateur.ResultApi.zonePrelevementReceive;
import com.example.Entity.ZonePrelevement;

public class ZonePrelevementMapper {

    public static ZonePrelevement mapToEntity(zonePrelevementReceive dto) {
        ZonePrelevement entity = new ZonePrelevement();
        entity.setCodePointPrelevement(dto.getCodePointPrelevement());
        entity.setNomPointPrelevement(dto.getNomPointPrelevement());
        entity.setDateExploitationDebut(dto.getDateExploitationDebut());
        entity.setDateExploitationFin(dto.getDateExploitationFin());
        entity.setCodeCommuneInsee(dto.getCodeCommuneInsee());
        entity.setNomCommune(dto.getNomCommune());
        entity.setCodeDepartement(dto.getCodeDepartement());
        entity.setLibelleDepartement(dto.getLibelleDepartement());
        return entity;
    }

    public static List<ZonePrelevement> mapToEntityList(List<zonePrelevementReceive> dtos) {
        return dtos.stream().map(ZonePrelevementMapper::mapToEntity).collect(Collectors.toList());
    }
}

