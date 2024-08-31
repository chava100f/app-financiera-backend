package com.app.financiera.demo.service.portfolio;

import com.app.financiera.demo.entities.PositionEntity;

public interface IPortfolioService {

    void addPosition(PositionEntity position);

    void removePosition(PositionEntity position);

    void updatePosition(PositionEntity position);
}
