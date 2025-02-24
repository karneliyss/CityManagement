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

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElseThrow(()-> new RuntimeException("Car not found"));
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }



}
