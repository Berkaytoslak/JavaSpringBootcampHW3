package com.thirdhomework.thirdhomework.repository;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {

    List<Course> findAll();
    List<Course> findByCourseName(String name);
    List<Course> deleteByCourseName(String name);
    List<Course> findByCourseNameContaining(String course_name);

}
