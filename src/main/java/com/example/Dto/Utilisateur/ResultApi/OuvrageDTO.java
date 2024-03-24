package com.example.Dto.Utilisateur.ResultApi;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OuvrageDTO {
    private String codeOuvrage;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String nomOuvrage;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Timestamp dateExploitationDebut;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Timestamp dateExploitationFin;
    private Double longitude;
    private Double latitude;
    private String codeCommuneInsee;
    private String nomCommune;
    private String codeDepartement;
    private String libelleDepartement;
    private String uriOuvrage;

    // Getters and Setters

    public String getCodeOuvrage() {
        return codeOuvrage;
    }

    public void setCodeOuvrage(String codeOuvrage) {
        this.codeOuvrage = codeOuvrage;
    }

    public String getNomOuvrage() {
        return nomOuvrage;
    }

    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public Timestamp getDateExploitationDebut() {
        return dateExploitationDebut;
    }

    public void setDateExploitationDebut(Timestamp dateExploitationDebut) {
        this.dateExploitationDebut = dateExploitationDebut;
    }

    public Timestamp getDateExploitationFin() {
        return dateExploitationFin;
    }

    public void setDateExploitationFin(Timestamp dateExploitationFin) {
        this.dateExploitationFin = dateExploitationFin;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCodeCommuneInsee() {
        return codeCommuneInsee;
    }

    public void setCodeCommuneInsee(String codeCommuneInsee) {
        this.codeCommuneInsee = codeCommuneInsee;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getLibelleDepartement() {
        return libelleDepartement;
    }

    public void setLibelleDepartement(String libelleDepartement) {
        this.libelleDepartement = libelleDepartement;
    }

    public String getUriOuvrage() {
        return uriOuvrage;
    }

    public void setUriOuvrage(String uriOuvrage) {
        this.uriOuvrage = uriOuvrage;
    }

    // Constructor
    public OuvrageDTO(String codeOuvrage, String nomOuvrage, Timestamp dateExploitationDebut,
                      Timestamp dateExploitationFin, Double longitude, Double latitude, String codeCommuneInsee,
                      String nomCommune, String codeDepartement, String libelleDepartement, String uriOuvrage) {
        this.codeOuvrage = codeOuvrage;
        this.nomOuvrage = nomOuvrage;
        this.dateExploitationDebut = dateExploitationDebut;
        this.dateExploitationFin = dateExploitationFin;
        this.longitude = longitude;
        this.latitude = latitude;
        this.codeCommuneInsee = codeCommuneInsee;
        this.nomCommune = nomCommune;
        this.codeDepartement = codeDepartement;
        this.libelleDepartement = libelleDepartement;
        this.uriOuvrage = uriOuvrage;
    }

    // Default constructor
    public OuvrageDTO() {
    }

    // toString method
    @Override
    public String toString() {
        return "OuvrageDTO [codeOuvrage=" + codeOuvrage + ", nomOuvrage=" + nomOuvrage
                + ", dateExploitationDebut=" + dateExploitationDebut + ", dateExploitationFin="
                + dateExploitationFin + ", longitude=" + longitude + ", latitude=" + latitude
                + ", codeCommuneInsee=" + codeCommuneInsee + ", nomCommune=" + nomCommune + ", codeDepartement="
                + codeDepartement + ", libelleDepartement=" + libelleDepartement + ", uriOuvrage=" + uriOuvrage
                + "]";
    }
}
