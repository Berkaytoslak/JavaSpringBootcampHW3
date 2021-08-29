package com.thirdhomework.thirdhomework.controller;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import com.thirdhomework.thirdhomework.entity.Student;
import com.thirdhomework.thirdhomework.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorController {

    private InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/instructor")
    public ResponseEntity<List<Instructor>> findAll(){
        return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/instructor/{name}")
    public List<Instructor> findByName(@PathVariable String name){
        return instructorService.findByName(name);
    }

    @PostMapping("/instructors")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return instructorService.save(instructor);
    }

    @DeleteMapping("/instructors/{id}")
    public String deleteInstructorById(@PathVariable int id){
        instructorService.deleteById(id);
        return "Deleted instructor...";
    }

    @PutMapping("/instructors")
    public Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.update(instructor);
    }
    @GetMapping("/deleteByName/{name}")
    public String deleteByFullInstructorName(@PathVariable String name){
        instructorService.deleteByFullName(name);
        return "Deleted instructors";
    }

    @GetMapping("/findByNameContainingInstructor")
    public List<Instructor> findByNameContaining(@RequestParam("name") String name){
        return instructorService.findByNameContaining(name);
    }


}
