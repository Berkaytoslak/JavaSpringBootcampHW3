package com.thirdhomework.thirdhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String gender;
    private LocalDate birthDate;

    @ManyToMany
    @JsonIgnore //CourseList bilgileri save de engellendi.
    private List<Course> courseList = new ArrayList<>();

}
