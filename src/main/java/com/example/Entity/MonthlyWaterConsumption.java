package com.example.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@Getter@Setter
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
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "territoryid", referencedColumnName = "id", insertable = false, updatable = false)
    private Territory territory;
    
}
