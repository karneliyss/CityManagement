package com.machulin.citymanagement.service;


import com.machulin.citymanagement.model.Car;
import com.machulin.citymanagement.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CarService {
    private CarRepository carRepository;


    //create
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    //read
    public List<Car> getAllCars() {
       return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    //update
    public Car updateCar(Long id, Car updatedCar) {

    }
}
