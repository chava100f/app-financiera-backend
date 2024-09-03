package com.app.financiera.demo.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IndicatorsEntity {

    private BigDecimal roi;
    private BigDecimal twr;
    private BigDecimal mwr;
}
