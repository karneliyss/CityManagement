package com.machulin.citymanagement.repository;

import com.machulin.citymanagement.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
