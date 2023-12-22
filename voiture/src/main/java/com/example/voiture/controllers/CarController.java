package com.example.voiture.controllers;

import com.example.voiture.models.CarReponse;
import com.example.voiture.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping
    public List<CarReponse> findAll(){
        return carService.findAll();
    }
    @GetMapping("/{id}")
    public CarReponse findById(@PathVariable Long id) throws Exception{
        return carService.findById(id);
    }
}
