package com.tldolarhomework3test.tldolarhomework3test.controller;

import com.tldolarhomework3test.tldolarhomework3test.entity.MoneyTo;
import com.tldolarhomework3test.tldolarhomework3test.repository.MoneyToRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class MoneyToController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MoneyToRepository moneyToRepository;

    @GetMapping("/get/{id}")
    public ResponseEntity<MoneyTo> getJsonFromRemoteTodoList (@PathVariable int id){
        MoneyTo oneyTo = restTemplate.getForObject("http://localhost:8080/api/dolars?money1=8.20" + id,MoneyTo.class);

        moneyToRepository.save(MoneyTo);

        return new ResponseEntity<>(MoneyTo, HttpStatus.OK);
    }
}
