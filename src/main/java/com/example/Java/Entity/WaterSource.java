package com.example.Java.Entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "watersource")
public class WaterSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "type", nullable = false)
    private String type;
    
    @Column(name = "capacity", nullable = false)
    private Double capacity;
    
    @Column(name = "territoryid")
    private Integer territoryId;
    
    @Column(name = "longitude", nullable = false)
    private Double longitude;
    
    @Column(name = "latitude", nullable = false)
    private Double latitude;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "territoryid", referencedColumnName = "id", insertable = false, updatable = false)
    private Territory territory;
    
    @OneToMany(mappedBy = "waterSource",fetch = FetchType.LAZY)
    private List<WaterStock> waterStocks;
}

