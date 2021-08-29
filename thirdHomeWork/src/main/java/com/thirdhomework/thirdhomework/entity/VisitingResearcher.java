package com.thirdhomework.thirdhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;


@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VisitingResearcher extends Instructor{

    private double visitingSalary;


}
