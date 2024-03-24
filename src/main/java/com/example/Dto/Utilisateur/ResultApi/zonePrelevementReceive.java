package com.example.Dto.Utilisateur.ResultApi;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class zonePrelevementReceive {

    private String codePointPrelevement;
    private String nomPointPrelevement;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Timestamp dateExploitationDebut;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Timestamp dateExploitationFin;
    private String codeCommuneInsee;
    private String nomCommune;
    private String codeDepartement;
    private String libelleDepartement;
    private String codeOuvrage;
	public String getCodePointPrelevement() {
		return codePointPrelevement;
	}
	public void setCodePointPrelevement(String codePointPrelevement) {
		this.codePointPrelevement = codePointPrelevement;
	}
	public String getNomPointPrelevement() {
		return nomPointPrelevement;
	}
	public void setNomPointPrelevement(String nomPointPrelevement) {
		this.nomPointPrelevement = nomPointPrelevement;
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
	public String getCodeOuvrage() {
		return codeOuvrage;
	}
	public void setCodeOuvrage(String codeOuvrage) {
		this.codeOuvrage = codeOuvrage;
	}

	public zonePrelevementReceive(String codePointPrelevement, String nomPointPrelevement,
			Timestamp dateExploitationDebut, Timestamp dateExploitationFin, String codeCommuneInsee, String nomCommune,
			String codeDepartement, String libelleDepartement, String codeOuvrage, String uriOuvrage) {
		super();
		this.codePointPrelevement = codePointPrelevement;
		this.nomPointPrelevement = nomPointPrelevement;
		this.dateExploitationDebut = dateExploitationDebut;
		this.dateExploitationFin = dateExploitationFin;
		this.codeCommuneInsee = codeCommuneInsee;
		this.nomCommune = nomCommune;
		this.codeDepartement = codeDepartement;
		this.libelleDepartement = libelleDepartement;
		this.codeOuvrage = codeOuvrage;
	}
    
	public zonePrelevementReceive() {
		
	}
	@Override
	public String toString() {
		return "zonePrelevementReceive [codePointPrelevement=" + codePointPrelevement + ", nomPointPrelevement="
				+ nomPointPrelevement + ", dateExploitationDebut=" + dateExploitationDebut + ", dateExploitationFin="
				+ dateExploitationFin + ", codeCommuneInsee=" + codeCommuneInsee + ", nomCommune=" + nomCommune
				+ ", codeDepartement=" + codeDepartement + ", libelleDepartement=" + libelleDepartement
				+ ", codeOuvrage=" + codeOuvrage + ", uriOuvrage=" +  "]";
	}
	
	
}
