package com.example.demo.controller;

import com.example.demo.model.Dog;
import com.example.demo.service.DogService;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/dog")
public class DogAPI {
    @Autowired
    private DogService dogService;

    @RequestMapping("/all")
    public List<Dog> findDogs(){
       return dogService.findAll();
    }

    @GetMapping(value = "show/{id}")
    public Dog showDog(@PathVariable long id) {
       return dogService.get(id);
    }

    @PostMapping(value="/add-json")
    public Dog addDog(@RequestBody Dog dog) {
        return dogService.add(dog);
    }

    @PostMapping(value = "/add-param")
    public Dog addDog(
    @RequestParam String name,
    @RequestParam String breed,
    @RequestParam Integer day,
    @RequestParam Integer month,
    @RequestParam Integer year,
    @RequestParam Boolean gender) {
        
        Dog tempDog = new Dog(name, breed, LocalDate.of(year, month, day).toString(), gender);
        return dogService.add(tempDog);
    }

    @GetMapping(value="/delete/{id}")
    public String deleteDog(@PathVariable long id) {
        dogService.delete(id);
        return "Success!";
    }
    @PostMapping(value = "/update-json")
    public Dog updateDog(@RequestBody Dog dog)
    {   
        return dogService.update(dog);
    }
    @PostMapping(value = "/update-param/{id}")
    public Dog updateDog(
    @PathVariable Long id,
    @RequestParam String name,
    @RequestParam String breed,
    @RequestParam Integer day,
    @RequestParam Integer month,
    @RequestParam Integer year,
    @RequestParam Boolean gender) {
        
        Dog tempDog = new Dog(id, name, breed, LocalDate.of(2023, 10, 27).toString(), gender);
        return dogService.update(tempDog);
    }
}
