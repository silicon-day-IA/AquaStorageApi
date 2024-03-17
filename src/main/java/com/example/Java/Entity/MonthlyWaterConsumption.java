package com.example.Java.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "monthlywaterconsumption")
public class MonthlyWaterConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "territoryid")
    private Integer territoryId;
    
    @Column(name = "year", nullable = false)
    private Integer year;
    
    @Column(name = "month", nullable = false)
    private Integer month;
    
    @Column(name = "totalconsumption", nullable = false)
    private Double totalConsumption;
    
    @Column(name = "domesticconsumption", nullable = false)
    private Double domesticConsumption;
    
    @Column(name = "industrialconsumption", nullable = false)
    private Double industrialConsumption;
    
    @Column(name = "agriculturalconsumption", nullable = false)
    private Double agriculturalConsumption;
    
    @ManyToOne
    @JoinColumn(name = "territoryid", referencedColumnName = "id", insertable = false, updatable = false)
    private Territory territory;
    
}
