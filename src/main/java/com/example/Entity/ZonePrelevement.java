package com.example.Entity;


import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "zone_prelevement")
public class ZonePrelevement {

    @Id
    @Column(name = "code_point_prelevement")
    private String codePointPrelevement;

    @Column(name = "nom_point_prelevement")
    private String nomPointPrelevement;

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

    @ManyToMany
    @JoinTable(
            name = "ouvrage_zone_prelevement",
            joinColumns = @jakarta.persistence.JoinColumn(name = "code_point_prelevement"),
            inverseJoinColumns = @jakarta.persistence.JoinColumn(name = "ouvrage_code_ouvrage")

    )
    private Set<Ouvrage> ouvrages;

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

	public Set<Ouvrage> getOuvrages() {
		return ouvrages;
	}

	public void setOuvrages(Set<Ouvrage> ouvrages) {
		this.ouvrages = ouvrages;
	}

	public ZonePrelevement(String codePointPrelevement, String nomPointPrelevement, Timestamp dateExploitationDebut,
			Timestamp dateExploitationFin, Double longitude, Double latitude, String codeCommuneInsee,
			String nomCommune, String codeDepartement, String libelleDepartement, Set<Ouvrage> ouvrages) {
		super();
		this.codePointPrelevement = codePointPrelevement;
		this.nomPointPrelevement = nomPointPrelevement;
		this.dateExploitationDebut = dateExploitationDebut;
		this.dateExploitationFin = dateExploitationFin;
		this.longitude = longitude;
		this.latitude = latitude;
		this.codeCommuneInsee = codeCommuneInsee;
		this.nomCommune = nomCommune;
		this.codeDepartement = codeDepartement;
		this.libelleDepartement = libelleDepartement;
		this.ouvrages = ouvrages;
	}

	@Override
	public String toString() {
		return "ZonePrelevement [codePointPrelevement=" + codePointPrelevement + ", nomPointPrelevement="
				+ nomPointPrelevement + ", dateExploitationDebut=" + dateExploitationDebut + ", dateExploitationFin="
				+ dateExploitationFin + ", longitude=" + longitude + ", latitude=" + latitude + ", codeCommuneInsee="
				+ codeCommuneInsee + ", nomCommune=" + nomCommune + ", codeDepartement=" + codeDepartement
				+ ", libelleDepartement=" + libelleDepartement + ", ouvrages=" + ouvrages + "]";
	}

	public ZonePrelevement() {
		super();
	}

	
    
    // Getters and setters...
}

