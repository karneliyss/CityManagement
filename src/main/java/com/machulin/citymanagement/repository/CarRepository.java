package com.machulin.citymanagement.repository;

import com.machulin.citymanagement.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> {
}
