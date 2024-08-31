package com.app.financiera.demo.service.portfolio.impl;

import com.app.financiera.demo.entities.PortfolioEntity;
import com.app.financiera.demo.entities.PositionEntity;

public class PortfolioServiceImpl {


    public void addPosition(PortfolioEntity portfolio, PositionEntity position) {
        portfolio.getListPosition().add(position);
    }

    public void removePosition(PortfolioEntity portfolio, PositionEntity position) {
        portfolio.getListPosition().remove(position);
    }

    public void updatePosition(PortfolioEntity portfolio, PositionEntity position) {
        for (PositionEntity p : portfolio.getListPosition()) {
            if (p.getStock().getTicker().equals(position.getStock().getTicker())) {

                p.setQuantity(position.getQuantity());
                p.setPurchaseDate(position.getPurchaseDate());
                p.setPurchasePrice(position.getPurchasePrice());
            }
        }
    }
}
