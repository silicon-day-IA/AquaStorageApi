package com.example.Java.Entity;
import java.sql.Timestamp;

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
@Table(name = "waterstock")
public class WaterStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "sourceid")
    private Integer sourceId;
    
    @Column(name = "quantity", nullable = false)
    private Double quantity;
    
    @Column(name = "lastupdated")
    private Timestamp lastUpdated;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sourceid", referencedColumnName = "id", insertable = false, updatable = false)
    private WaterSource waterSource;
}
