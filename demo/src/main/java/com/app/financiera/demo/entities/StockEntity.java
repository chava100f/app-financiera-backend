package com.app.financiera.demo.entities;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StockEntity {

    private String ticker;
    private String companyName;
    private BigDecimal price;
    private String currency;
    private SectorEntity sector;
    private ExchangeMarketEntity exchangeMarket;

}
