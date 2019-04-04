package com.ing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.domain.Breach;


@Repository
public interface BreachRepository extends CrudRepository<Breach, Long> {

}
