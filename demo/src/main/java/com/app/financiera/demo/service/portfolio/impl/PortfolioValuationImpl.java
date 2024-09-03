package com.app.financiera.demo.service.portfolio.impl;

import com.app.financiera.demo.entities.PositionEntity;
import com.app.financiera.demo.service.portfolio.IPortfolioValuation;

import java.math.BigDecimal;
import java.util.List;

public class PortfolioValuationImpl implements IPortfolioValuation {

    @Override
    public BigDecimal calculateValuation(List<PositionEntity> listPosition) {
        BigDecimal valuation = BigDecimal.ZERO;
        for (PositionEntity p : listPosition) {
            valuation = valuation.add(p.getCurrentPrice().add(p.getCurrentPrice()));
        }
        return valuation;
    }

    @Override
    public BigDecimal calculateGainLoss(List<PositionEntity> listPosition) {
        BigDecimal gainLoss = BigDecimal.ZERO;
        for (PositionEntity p : listPosition) {
            gainLoss = gainLoss.add(p.getGainLoss());
        }
        return gainLoss;
    }
}
