package com.example.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "water_consumption")
public class WaterConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code_ouvrage")
    private String codeOuvrage;

    @Column(name = "annee")
    private Integer annee;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "libelle_usage")
    private String libelleUsage;

    @Column(name = "libelle_statut_volume")
    private String libelleStatutVolume;

    @Column(name = "libelle_qualification_volume")
    private String libelleQualificationVolume;

    @Column(name = "libelle_mode_obtention_volume")
    private String libelleModeObtentionVolume;

    @Column(name = "prelevement_ecrasant")
    private Boolean prelevementEcrasant;

    @Column(name = "producteur_donnee")
    private String producteurDonnee;

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

    @Column(name = "nom_ouvrage")
    private String nomOuvrage;

    @Column(name = "uri_ouvrage")
    private String uriOuvrage;

    @ManyToOne
    @JoinColumn(name = "code_ouvrage", referencedColumnName = "code_ouvrage",insertable=false, updatable=false)
    private Ouvrage ouvrage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeOuvrage() {
		return codeOuvrage;
	}

	public void setCodeOuvrage(String codeOuvrage) {
		this.codeOuvrage = codeOuvrage;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getLibelleUsage() {
		return libelleUsage;
	}

	public void setLibelleUsage(String libelleUsage) {
		this.libelleUsage = libelleUsage;
	}

	public String getLibelleStatutVolume() {
		return libelleStatutVolume;
	}

	public void setLibelleStatutVolume(String libelleStatutVolume) {
		this.libelleStatutVolume = libelleStatutVolume;
	}

	public String getLibelleQualificationVolume() {
		return libelleQualificationVolume;
	}

	public void setLibelleQualificationVolume(String libelleQualificationVolume) {
		this.libelleQualificationVolume = libelleQualificationVolume;
	}

	public String getLibelleModeObtentionVolume() {
		return libelleModeObtentionVolume;
	}

	public void setLibelleModeObtentionVolume(String libelleModeObtentionVolume) {
		this.libelleModeObtentionVolume = libelleModeObtentionVolume;
	}

	public Boolean getPrelevementEcrasant() {
		return prelevementEcrasant;
	}

	public void setPrelevementEcrasant(Boolean prelevementEcrasant) {
		this.prelevementEcrasant = prelevementEcrasant;
	}

	public String getProducteurDonnee() {
		return producteurDonnee;
	}

	public void setProducteurDonnee(String producteurDonnee) {
		this.producteurDonnee = producteurDonnee;
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

	public String getNomOuvrage() {
		return nomOuvrage;
	}

	public void setNomOuvrage(String nomOuvrage) {
		this.nomOuvrage = nomOuvrage;
	}

	public String getUriOuvrage() {
		return uriOuvrage;
	}

	public void setUriOuvrage(String uriOuvrage) {
		this.uriOuvrage = uriOuvrage;
	}

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

	public WaterConsumption(Long id, String codeOuvrage, Integer annee, Double volume, String codeUsage,
			String libelleUsage, String codeStatutVolume, String libelleStatutVolume, String codeQualificationVolume,
			String libelleQualificationVolume, String codeStatutInstruction, String libelleStatutInstruction,
			String codeModeObtentionVolume, String libelleModeObtentionVolume, Boolean prelevementEcrasant,
			String producteurDonnee, Double longitude, Double latitude, String codeCommuneInsee, String nomCommune,
			String codeDepartement, String libelleDepartement, String nomOuvrage, String uriOuvrage, Ouvrage ouvrage) {
		super();
		this.id = id;
		this.codeOuvrage = codeOuvrage;
		this.annee = annee;
		this.volume = volume;
		this.libelleUsage = libelleUsage;
		this.libelleStatutVolume = libelleStatutVolume;
		this.libelleQualificationVolume = libelleQualificationVolume;
		this.libelleModeObtentionVolume = libelleModeObtentionVolume;
		this.prelevementEcrasant = prelevementEcrasant;
		this.producteurDonnee = producteurDonnee;
		this.longitude = longitude;
		this.latitude = latitude;
		this.codeCommuneInsee = codeCommuneInsee;
		this.nomCommune = nomCommune;
		this.codeDepartement = codeDepartement;
		this.libelleDepartement = libelleDepartement;
		this.nomOuvrage = nomOuvrage;
		this.uriOuvrage = uriOuvrage;
		this.ouvrage = ouvrage;
	}

	
	public WaterConsumption() {
		
	}
	
	@Override
	public String toString() {
		return "WaterConsumption [id=" + id + ", codeOuvrage=" + codeOuvrage + ", annee=" + annee + ", volume=" + volume
				+ ", libelleUsage=" + libelleUsage + ", libelleStatutVolume=" + libelleStatutVolume
				+ ", libelleQualificationVolume=" + libelleQualificationVolume + ", libelleModeObtentionVolume="
				+ libelleModeObtentionVolume + ", prelevementEcrasant=" + prelevementEcrasant + ", producteurDonnee="
				+ producteurDonnee + ", longitude=" + longitude + ", latitude=" + latitude + ", codeCommuneInsee="
				+ codeCommuneInsee + ", nomCommune=" + nomCommune + ", codeDepartement=" + codeDepartement
				+ ", libelleDepartement=" + libelleDepartement + ", nomOuvrage=" + nomOuvrage + ", uriOuvrage="
				+ uriOuvrage + ", ouvrage=" + ouvrage + "]";
	}

    
    // Getters and setters...
}

