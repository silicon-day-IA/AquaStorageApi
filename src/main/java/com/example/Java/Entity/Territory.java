package com.example.Java.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    
    @Column(name = "area", nullable = false)
    private Double area;
    
    @Column(name = "population", nullable = false)
    private Integer population;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.EAGER)
    private List<WaterSource> waterSources;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.LAZY)
    private List<DailyWaterConsumption> dailyWaterConsumptions;
    
    @OneToMany(mappedBy = "territory",fetch = FetchType.LAZY)
    private List<MonthlyWaterConsumption> monthlyWaterConsumptions;
    
    @OneToOne(mappedBy = "territory",fetch = FetchType.LAZY)
    private Utilisateur utilisateurs;
}

