package com.thirdhomework.thirdhomework.repository;

import com.thirdhomework.thirdhomework.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

    List<Student> findAll(); //tüm bilgiler getirilir
    List<Student> findByName(String name); //isime göre getirir.
    List<Student> deleteByName(String name); // isime göre siler
    List<Student> findByNameContaining(String name); //belli bir aralık seçimine göre bilgileri getirir

    @Query(nativeQuery = true, value = "select (CASE gender when 'E' then 'Male' ELSE 'Famele' end) as gender, count(st.gender) as count from Student st GROUP BY st.gender")
    List<StudentGenderStatistic> getGendersWithGrouping(); // erkek ve kız sayısını getirir.

}
