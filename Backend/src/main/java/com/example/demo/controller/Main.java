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
public class Main {
    @GetMapping("/")
    public String hello(){
       return "Hello!";
    }
}
