package com.thirdhomework.thirdhomework.service;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import com.thirdhomework.thirdhomework.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements BaseService<Course>{

    private final CourseRepository courseRepository;


    @Override
    public List<Course> findAll() {
        List<Course> coList = new ArrayList<>();
        Iterable<Course> courseIter = courseRepository.findAll();
        courseIter.iterator().forEachRemaining(coList::add);
        return coList;
    }

    @Transactional
    public List<Course> findByCourseName(String name){
        return courseRepository.findByCourseName(name);
    }

    @Override
    public Course findById(int id) {
        return null;
    }


    @Override
    @Transactional
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course update(Course course) {
        return courseRepository.save(course);
    }

    @Transactional
    public void deleteByFullCourseName(String name) {
        courseRepository.deleteByCourseName(name);
    }

    public List<Course> findByNameContaining(String course_name){
        return courseRepository.findByCourseNameContaining(course_name);
    }
}
