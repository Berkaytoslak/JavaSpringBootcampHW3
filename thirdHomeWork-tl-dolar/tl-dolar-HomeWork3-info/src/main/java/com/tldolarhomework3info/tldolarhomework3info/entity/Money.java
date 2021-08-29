package com.tldolarhomework3info.tldolarhomework3info.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Money {

    @Id
    private int id;
    private double dolar;
    private double liras;

}
