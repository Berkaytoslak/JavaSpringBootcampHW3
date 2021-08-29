package com.tldolarhomework3info.tldolarhomework3info.controller;

import com.tldolarhomework3info.tldolarhomework3info.entity.Money;
import com.tldolarhomework3info.tldolarhomework3info.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MoneyController {

    private MoneyService moneyService;

    @Autowired
    public MoneyController(MoneyService moneyService) {
        this.moneyService = moneyService;
    }

    @GetMapping("/dolars")
    public Double dolarTotl(Double money1){
        return moneyService.dolarToTl(money1);
    }

    @GetMapping("/liras")
    public Double lirasTodolars(Double money2){
        return moneyService.tlToDolar(money2);
    }

}
