package com.example.Java.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "territory")
public class Territory {
    public class Response {

	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "area", nullable = false)
    private Double area;
    
    @Column(name = "population", nullable = false)
    private Integer population;
    
    @OneToMany(mappedBy = "territory")
    private List<WaterSource> waterSources;
    
    @OneToMany(mappedBy = "territory")
    private List<DailyWaterConsumption> dailyWaterConsumptions;
    
    @OneToMany(mappedBy = "territory")
    private List<MonthlyWaterConsumption> monthlyWaterConsumptions;
    
    @OneToOne(mappedBy = "territory")
    private Utilisateur utilisateurs;
}

