package com.tldolarhomework3info.tldolarhomework3info.service;

import org.springframework.stereotype.Service;

@Service
public class MoneyService {

    public Double tlToDolar(Double money1){
        Double dolar = money1 * 8.20;
        return dolar;
    }

    public Double dolarToTl(Double money2){
        Double liras = money2 / 8.20;
        return liras;
    }
}
