package com.example.Dto.Utilisateur.ResultApi;

public class WaterConsumptionDTO {

    private String codeOuvrage;
    private Integer annee;
    private Double volume;
    private String libelleUsage;
    private String libelleStatutVolume;
    private String libelleQualificationVolume;
    private String libelleModeObtentionVolume;
    private Boolean prelevementEcrasant;
    private String producteurDonnee;
    private Double longitude;
    private Double latitude;
    private String codeCommuneInsee;
    private String nomCommune;
    private String codeDepartement;
    private String libelleDepartement;
    private String nomOuvrage;
    private String uriOuvrage;
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
	public WaterConsumptionDTO(String codeOuvrage, Integer annee, Double volume, String libelleUsage,
			String libelleStatutVolume, String libelleQualificationVolume, String libelleModeObtentionVolume,
			Boolean prelevementEcrasant, String producteurDonnee, Double longitude, Double latitude,
			String codeCommuneInsee, String nomCommune, String codeDepartement, String libelleDepartement,
			String nomOuvrage, String uriOuvrage) {
		super();
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
	}
	
	
	
	public WaterConsumptionDTO() {
		super();
	}
	@Override
	public String toString() {
		return "WaterConsumptionDTO [codeOuvrage=" + codeOuvrage + ", annee=" + annee + ", volume=" + volume
				+ ", libelleUsage=" + libelleUsage + ", libelleStatutVolume=" + libelleStatutVolume
				+ ", libelleQualificationVolume=" + libelleQualificationVolume + ", libelleModeObtentionVolume="
				+ libelleModeObtentionVolume + ", prelevementEcrasant=" + prelevementEcrasant + ", producteurDonnee="
				+ producteurDonnee + ", longitude=" + longitude + ", latitude=" + latitude + ", codeCommuneInsee="
				+ codeCommuneInsee + ", nomCommune=" + nomCommune + ", codeDepartement=" + codeDepartement
				+ ", libelleDepartement=" + libelleDepartement + ", nomOuvrage=" + nomOuvrage + ", uriOuvrage="
				+ uriOuvrage + "]";
	}
    
    
	
	
    

    // Getters and setters
}

