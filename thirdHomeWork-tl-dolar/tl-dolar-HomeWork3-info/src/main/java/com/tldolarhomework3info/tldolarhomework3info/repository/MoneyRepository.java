package com.tldolarhomework3info.tldolarhomework3info.repository;

import com.tldolarhomework3info.tldolarhomework3info.entity.Money;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends CrudRepository<Money,Integer> {
}
