package com.thirdhomework.thirdhomework.service;

import com.thirdhomework.thirdhomework.entity.Course;
import com.thirdhomework.thirdhomework.entity.Instructor;
import com.thirdhomework.thirdhomework.entity.Student;
import com.thirdhomework.thirdhomework.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService implements BaseService<Instructor>{

    private final InstructorRepository instructorRepository;

    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return null;
    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        instructorRepository.deleteById(id);

    }

    @Override
    public Instructor update(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Transactional
    public List<Instructor> findByName(String name){
        return instructorRepository.findByName(name);
    }

    @Transactional
    public void deleteByFullName(String name) {
        instructorRepository.deleteByName(name);
    }

    public List<Instructor> findByNameContaining(String name){
        return instructorRepository.findByNameContaining(name);
    }
}
