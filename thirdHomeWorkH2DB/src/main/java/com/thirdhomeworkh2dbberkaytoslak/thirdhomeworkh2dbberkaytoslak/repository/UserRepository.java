package com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.repository;


import com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
