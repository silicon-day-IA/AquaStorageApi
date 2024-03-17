package com.example.Java.Entity;

import java.sql.Date;

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
@Table(name = "waterarrival")
public class WaterArrival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "sourceid")
    private Integer sourceId;
    
    @Column(name = "arrivaldate", nullable = false)
    private Date arrivalDate;
    
    @Column(name = "quantity", nullable = false)
    private Double quantity;
    
    @ManyToOne
    @JoinColumn(name = "sourceid", referencedColumnName = "id", insertable = false, updatable = false)
    private WaterSource waterSource;
}

