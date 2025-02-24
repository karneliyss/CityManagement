package com.machulin.citymanagement.controller;


import com.machulin.citymanagement.model.Car;
import com.machulin.citymanagement.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/car")



public class CarController {

    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }



}
