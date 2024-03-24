package com.example.Utils.Mapping;

import com.example.Entity.Ouvrage;
import com.example.Dto.Utilisateur.ResultApi.OuvrageDTO;

public class OuvrageMapper {

    public static OuvrageDTO toDTO(OuvrageDTO ouvrage) {
        OuvrageDTO ouvrageDTO = new OuvrageDTO();
        ouvrageDTO.setCodeOuvrage(ouvrage.getCodeOuvrage());
        ouvrageDTO.setNomOuvrage(ouvrage.getNomOuvrage());
        ouvrageDTO.setDateExploitationDebut(ouvrage.getDateExploitationDebut());
        ouvrageDTO.setDateExploitationFin(ouvrage.getDateExploitationFin());
        ouvrageDTO.setLongitude(ouvrage.getLongitude());
        ouvrageDTO.setLatitude(ouvrage.getLatitude());
        ouvrageDTO.setCodeCommuneInsee(ouvrage.getCodeCommuneInsee());
        ouvrageDTO.setNomCommune(ouvrage.getNomCommune());
        ouvrageDTO.setCodeDepartement(ouvrage.getCodeDepartement());
        ouvrageDTO.setLibelleDepartement(ouvrage.getLibelleDepartement());
        ouvrageDTO.setUriOuvrage(ouvrage.getUriOuvrage());
        return ouvrageDTO;
    }

    public static Ouvrage toEntity(OuvrageDTO ouvrageDTO) {
        Ouvrage ouvrage = new Ouvrage();
        ouvrage.setCodeOuvrage(ouvrageDTO.getCodeOuvrage());
        ouvrage.setNomOuvrage(ouvrageDTO.getNomOuvrage());
        ouvrage.setDateExploitationDebut(ouvrageDTO.getDateExploitationDebut());
        ouvrage.setDateExploitationFin(ouvrageDTO.getDateExploitationFin());
        ouvrage.setLongitude(ouvrageDTO.getLongitude());
        ouvrage.setLatitude(ouvrageDTO.getLatitude());
        ouvrage.setCodeCommuneInsee(ouvrageDTO.getCodeCommuneInsee());
        ouvrage.setNomCommune(ouvrageDTO.getNomCommune());
        ouvrage.setCodeDepartement(ouvrageDTO.getCodeDepartement());
        ouvrage.setLibelleDepartement(ouvrageDTO.getLibelleDepartement());
        ouvrage.setUriOuvrage(ouvrageDTO.getUriOuvrage());
        return ouvrage;
    }
}

