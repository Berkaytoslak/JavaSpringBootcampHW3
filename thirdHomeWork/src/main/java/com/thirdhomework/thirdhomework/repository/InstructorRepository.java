package com.thirdhomework.thirdhomework.repository;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import com.thirdhomework.thirdhomework.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor,Integer> {

    List<Instructor> findAll();
    List<Instructor> findByName(String name);
    List<Instructor> deleteByName(String name);
    List<Instructor> findByNameContaining(String name);

}
