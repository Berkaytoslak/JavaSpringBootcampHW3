package com.tldolarhomework3test.tldolarhomework3test.repository;

import com.sun.tools.javac.comp.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyToRepository extends CrudRepository<Todo, Integer> {
}
