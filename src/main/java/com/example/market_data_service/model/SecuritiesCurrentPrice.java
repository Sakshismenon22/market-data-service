package com.example.market_data_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class SecuritiesCurrentPrice {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne 
    private Integer securityId;

    private double open;

    private double close;

    private double high;

    private double low;

    private LocalDateTime tradedDateTimestamp;
    
}
