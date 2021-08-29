package com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 10, message = "The age cannot be less than 0")
    @Max(value = 80, message = "The age cannot be greater than 120")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private int age;

    @Email(message = "Email is not valid")
    @NotBlank(message = "Email is mandatory")
    private String email;


}
