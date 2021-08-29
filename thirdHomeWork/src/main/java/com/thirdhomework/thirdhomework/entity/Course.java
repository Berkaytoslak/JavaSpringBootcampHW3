package com.thirdhomework.thirdhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private int courseCod;
    private int creditScore;

    @ManyToMany(mappedBy = "courseList")
    @JsonIgnore
    private List<Student> studentList = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private Instructor instructor;
}
