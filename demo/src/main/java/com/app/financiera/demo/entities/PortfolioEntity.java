package com.app.financiera.demo.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PortfolioEntity {

    private List<PositionEntity> listPosition;
    private UserEntity user;
    private BigDecimal totalValue;
    private BigDecimal totalGainLoss;
    private BigDecimal cashBalance;
    private LocalDate createdDate;
    private LocalDate lastUpdatedDate;

}
