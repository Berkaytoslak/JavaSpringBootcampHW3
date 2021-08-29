package com.thirdhomework.thirdhomework.controller;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Student;
import com.thirdhomework.thirdhomework.repository.StudentGenderStatistic;
import com.thirdhomework.thirdhomework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/Students")
    public ResponseEntity<List<Student>> findAll(){ // tüm bilgiler sıralanır.
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/Students/{name}") // isime göre arar ve bulur
    public List<Student> findByCourseName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @PostMapping("/Students") // nesne bilgileri ile kayıt eder
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/Students/{id}") // id bilgisini bularak siler
    public String deleteStudentById(@PathVariable int id){
        studentService.deleteById(id);
        return "Deleted Students...";
    }

    @PutMapping("/Students") // nsene ile güncelleme
    public Student updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }

    @GetMapping("/deleteByStudentName/{name}") //isim aratılarak siler
    public String deleteByFullStudentName(@PathVariable String name){
        studentService.deleteByFullName(name);
        return "Deleted Students";
    }

    @GetMapping("/getGendersWithGrouping")
    public List<?> getGendersWithGrouping(){ //erkek ve kız sayısını getirir
        return studentService.getGendersWithGrouping();
    }

    @GetMapping("/findByNameContainingStudent")
    public List<Student> findByNameContaining(@RequestParam("name") String name){
        return studentService.findByNameContaining(name);
    }
}
