package com.example.market_data_service.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityMaster {

    private Integer id;

    private String securityName;

    private String currency;

    private String ISIN;

    private String symbol;

    private String exchange;

}
