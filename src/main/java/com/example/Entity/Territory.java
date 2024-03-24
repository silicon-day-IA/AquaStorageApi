package com.example.Entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@Getter@Setter
@Table(name = "territory")
public class Territory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "area")
    private Double area;
    
    @Column(name = "population")
    private Integer population;
    
    @Column(name = "inseecommune", nullable = false)
    private int inseeCommune;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.EAGER)
    private List<WaterSource> waterSources;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.LAZY)
    private List<DailyWaterConsumption> dailyWaterConsumptions;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.LAZY)
    private List<MonthlyWaterConsumption> monthlyWaterConsumptions;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inseecommune", referencedColumnName = "insee", insertable = false, updatable = false)
    private Commune insee;
    
    public Territory() {
    	
    }
    
	public Territory(String name, int inseeCommune) {
		this.name = name;
		this.inseeCommune = inseeCommune;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public int getInseeCommune() {
		return inseeCommune;
	}

	public void setInseeCommune(int inseeCommune) {
		this.inseeCommune = inseeCommune;
	}

	public List<WaterSource> getWaterSources() {
		return waterSources;
	}

	public void setWaterSources(List<WaterSource> waterSources) {
		this.waterSources = waterSources;
	}

	public List<DailyWaterConsumption> getDailyWaterConsumptions() {
		return dailyWaterConsumptions;
	}

	public void setDailyWaterConsumptions(List<DailyWaterConsumption> dailyWaterConsumptions) {
		this.dailyWaterConsumptions = dailyWaterConsumptions;
	}

	public List<MonthlyWaterConsumption> getMonthlyWaterConsumptions() {
		return monthlyWaterConsumptions;
	}

	public void setMonthlyWaterConsumptions(List<MonthlyWaterConsumption> monthlyWaterConsumptions) {
		this.monthlyWaterConsumptions = monthlyWaterConsumptions;
	}


	public Commune getInsee() {
		return insee;
	}

	public void setInsee(Commune insee) {
		this.insee = insee;
	}

	@Override
	public String toString() {
		return "Territory [id=" + id + ", name=" + name + ", area=" + area + ", population=" + population
				+ ", inseeCommune=" + inseeCommune + ", waterSources=" + waterSources + ", dailyWaterConsumptions="
				+ dailyWaterConsumptions + ", monthlyWaterConsumptions=" + monthlyWaterConsumptions +  ", insee=" + insee + "]";
	}
	
	
}

