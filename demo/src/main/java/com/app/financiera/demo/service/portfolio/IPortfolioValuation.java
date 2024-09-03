package com.app.financiera.demo.service.portfolio;

import com.app.financiera.demo.entities.PositionEntity;

import java.math.BigDecimal;
import java.util.List;

public interface IPortfolioValuation {
    BigDecimal calculateValuation(List<PositionEntity> listPosition);
    BigDecimal calculateGainLoss(List<PositionEntity> listPosition);
}
