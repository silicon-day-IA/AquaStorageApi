package com.example.Entity;


import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ouvrage")
public class Ouvrage {

    @Id
    @Column(name = "code_ouvrage")
    private String codeOuvrage;

    @Column(name = "nom_ouvrage")
    private String nomOuvrage;

    @Column(name = "date_exploitation_debut")
    private Timestamp dateExploitationDebut;

    @Column(name = "date_exploitation_fin")
    private Timestamp dateExploitationFin;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "code_commune_insee")
    private String codeCommuneInsee;

    @Column(name = "nom_commune")
    private String nomCommune;

    @Column(name = "code_departement")
    private String codeDepartement;

    @Column(name = "libelle_departement")
    private String libelleDepartement;

    @Column(name = "uri_ouvrage")
    private String uriOuvrage;

    @ManyToMany(mappedBy = "ouvrages")
    private Set<ZonePrelevement> zonesPrelevement;

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

	public Set<ZonePrelevement> getZonesPrelevement() {
		return zonesPrelevement;
	}

	public void setZonesPrelevement(Set<ZonePrelevement> zonesPrelevement) {
		this.zonesPrelevement = zonesPrelevement;
	}

	@Override
	public String toString() {
		return "Ouvrage [codeOuvrage=" + codeOuvrage + ", nomOuvrage=" + nomOuvrage + ", dateExploitationDebut="
				+ dateExploitationDebut + ", dateExploitationFin=" + dateExploitationFin + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", codeCommuneInsee=" + codeCommuneInsee + ", nomCommune=" + nomCommune
				+ ", codeDepartement=" + codeDepartement + ", libelleDepartement=" + libelleDepartement
				+ ", uriOuvrage=" + uriOuvrage + ", zonesPrelevement=" + zonesPrelevement + "]";
	}

	public Ouvrage(String codeOuvrage, String nomOuvrage, Timestamp dateExploitationDebut,
			Timestamp dateExploitationFin, Double longitude, Double latitude, String codeCommuneInsee,
			String nomCommune, String codeDepartement, String libelleDepartement, String uriOuvrage,
			Set<ZonePrelevement> zonesPrelevement) {
		super();
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
		this.zonesPrelevement = zonesPrelevement;
	}
    
	public Ouvrage() {
		
	}
    // Getters and setters...
}
