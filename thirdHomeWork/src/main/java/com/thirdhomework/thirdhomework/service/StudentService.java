package com.thirdhomework.thirdhomework.service;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Student;
import com.thirdhomework.thirdhomework.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements BaseService<Student> {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Transactional
    public List<Student> findByName(String name){
        return studentRepository.findByName(name);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public void deleteByFullName(String name) {
        studentRepository.deleteByName(name);
    }

    public List<?> getGendersWithGrouping() {
        return studentRepository.getGendersWithGrouping();
    }

    public List<Student> findByNameContaining(String name){
        return studentRepository.findByNameContaining(name);
    }
}
