
package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@NamedQueries({
		@NamedQuery(name = "Commune.findByCodePostal", query = "SELECT c.codeInsee FROM Commune c WHERE c.codePostal = :codePostal and c.commune = UPPER(:commune)"), 
		@NamedQuery(name = "Commune.findByCodeCommune", query = "SELECT c.codeInsee FROM Commune c WHERE c.codeCommune = :codeCommune" ) 

})

@Entity
@Table(name = "correspondance_code_insee_code_postal")
public class Commune {

    @Id
    @Column(name = "insee")
    private Integer codeInsee;

    @Column(name = "postal")
    private Integer codePostal;

    @Column(name = "commune")
    private String commune;

    @Column(name = "département")
    private String departement;

    @Column(name = "région")
    private String region;

    @Column(name = "statut")
    private String statut;

    @Column(name = "altitude moyenne")
    private Float altitudeMoyenne;

    @Column(name = "superficie")
    private Float superficie;

    @Column(name = "population")
    private Float population;

    @Column(name = "geo_point_2d")
    private String geoPoint2d;

    @Column(name = "geo_shape")
    private String geoShape;

    @Column(name = "id geofla")
    private Integer idGeofla;

    @Column(name = "Code Commune")
    private Integer codeCommune;

    @Column(name = "code canton")
    private Integer codeCanton;

    @Column(name = "code arrondissement")
    private Integer codeArrondissement;

    @Column(name = "code département")
    private Integer codeDepartement;

    @Column(name = "code région")
    private Integer codeRegion;
    
    
	public Commune() {
	}


	public Commune(Integer codeInsee, Integer codePostal, String commune, String departement, String region) {
		super();
		this.codeInsee = codeInsee;
		this.codePostal = codePostal;
		this.commune = commune;
		this.departement = departement;
		this.region = region;
	}


	public Commune(Integer codeInsee, Integer codePostal, String commune, String departement, String region,
			String statut, Float altitudeMoyenne, Float superficie, Float population, String geoPoint2d) {
		super();
		this.codeInsee = codeInsee;
		this.codePostal = codePostal;
		this.commune = commune;
		this.departement = departement;
		this.region = region;
		this.statut = statut;
		this.altitudeMoyenne = altitudeMoyenne;
		this.superficie = superficie;
		this.population = population*1000;
		this.geoPoint2d = geoPoint2d;
	}


	public Commune(Integer codeInsee, Integer codePostal, String commune, String departement, String region,
			String statut, Float altitudeMoyenne, Float superficie, Float population, String geoPoint2d,
			String geoShape, Integer idGeofla, Integer codeCommune, Integer codeCanton, Integer codeArrondissement,
			Integer codeDepartement, Integer codeRegion) {
		super();
		this.codeInsee = codeInsee;
		this.codePostal = codePostal;
		this.commune = commune;
		this.departement = departement;
		this.region = region;
		this.statut = statut;
		this.altitudeMoyenne = altitudeMoyenne;
		this.superficie = superficie;
		this.population = population*1000;
		this.geoPoint2d = geoPoint2d;
		this.geoShape = geoShape;
		this.idGeofla = idGeofla;
		this.codeCommune = codeCommune;
		this.codeCanton = codeCanton;
		this.codeArrondissement = codeArrondissement;
		this.codeDepartement = codeDepartement;
		this.codeRegion = codeRegion;
	}


	public Integer getCodeInsee() {
		return codeInsee;
	}


	public void setCodeInsee(Integer codeInsee) {
		this.codeInsee = codeInsee;
	}


	public Integer getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}


	public String getCommune() {
		return commune;
	}


	public void setCommune(String commune) {
		this.commune = commune;
	}


	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public Float getAltitudeMoyenne() {
		return altitudeMoyenne;
	}


	public void setAltitudeMoyenne(Float altitudeMoyenne) {
		this.altitudeMoyenne = altitudeMoyenne;
	}


	public Float getSuperficie() {
		return superficie;
	}


	public void setSuperficie(Float superficie) {
		this.superficie = superficie;
	}


	public Float getPopulation() {
		return population;
	}


	public void setPopulation(Float population) {
		this.population = population;
	}


	public String getGeoPoint2d() {
		return geoPoint2d;
	}


	public void setGeoPoint2d(String geoPoint2d) {
		this.geoPoint2d = geoPoint2d;
	}


	public String getGeoShape() {
		return geoShape;
	}


	public void setGeoShape(String geoShape) {
		this.geoShape = geoShape;
	}


	public Integer getIdGeofla() {
		return idGeofla;
	}


	public void setIdGeofla(Integer idGeofla) {
		this.idGeofla = idGeofla;
	}


	public Integer getCodeCommune() {
		return codeCommune;
	}


	public void setCodeCommune(Integer codeCommune) {
		this.codeCommune = codeCommune;
	}


	public Integer getCodeCanton() {
		return codeCanton;
	}


	public void setCodeCanton(Integer codeCanton) {
		this.codeCanton = codeCanton;
	}


	public Integer getCodeArrondissement() {
		return codeArrondissement;
	}


	public void setCodeArrondissement(Integer codeArrondissement) {
		this.codeArrondissement = codeArrondissement;
	}


	public Integer getCodeDepartement() {
		return codeDepartement;
	}


	public void setCodeDepartement(Integer codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public Integer getCodeRegion() {
		return codeRegion;
	}


	public void setCodeRegion(Integer codeRegion) {
		this.codeRegion = codeRegion;
	}


	@Override
	public String toString() {
		return "Commune [codeInsee=" + codeInsee + ", codePostal=" + codePostal + ", commune=" + commune
				+ ", departement=" + departement + ", region=" + region + "]";
	}
	
	
    // Getters and setters
    // Vous pouvez générer automatiquement les getters et les setters avec votre IDE ou les ajouter manuellement.
}
