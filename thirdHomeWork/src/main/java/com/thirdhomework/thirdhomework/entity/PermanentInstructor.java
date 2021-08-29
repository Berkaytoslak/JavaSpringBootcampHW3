package com.thirdhomework.thirdhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PermanentInstructor extends Instructor{

    private double permanentSalary;

}
