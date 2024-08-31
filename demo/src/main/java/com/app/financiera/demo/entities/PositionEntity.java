package com.app.financiera.demo.entities;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PositionEntity {
    private StockEntity stock;
    private int quantity;
    private BigDecimal purchasePrice;
    private BigDecimal currentPrice;
    private BigDecimal gainLoss;
    private LocalDate purchaseDate;
}
