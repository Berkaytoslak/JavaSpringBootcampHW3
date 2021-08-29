package com.thirdhomework.thirdhomework.controller;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import com.thirdhomework.thirdhomework.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> findAll(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/courses/{name}")
    public List<Course> findByCourseName(@PathVariable String name){
        return courseService.findByCourseName(name);
    }

    @PostMapping("/courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable int id){
        courseService.deleteById(id);
        return "Deleted course...";
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.update(course);
    }

    @GetMapping("/deleteByCourseName/{name}")
    public String deleteByFullCourseName(@PathVariable String name){
        courseService.deleteByFullCourseName(name);
        return "Deleted courses";
    }

    @GetMapping("/findByNameContainingCourse")
    public List<Course> findByNameContaining(@RequestParam("CourseName") String course_name){
        return courseService.findByNameContaining(course_name);
    }

}
