package com.app.financiera.demo.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RiskEntity {
    private BigDecimal expectedReturn;
    private BigDecimal standardDeviation;
    private BigDecimal sharpeRatio;
    private BigDecimal alpha;
    private BigDecimal beta;
    private BigDecimal rateReturn;
}
