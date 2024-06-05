package com.example.demo.service;

import com.example.demo.model.Dog;
import com.example.demo.repo.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {
    @Autowired
    private DogRepository repository;

    public List<Dog> findAll() {
        return (List<Dog>) repository.findAll();
    }

    public Dog add(Dog Dog) {
        return repository.save(Dog);
    }

    public Dog update(Dog Dog) {
        return repository.save(Dog);
    }

    public Dog get(long id) {
        Optional<Dog> optional = repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Dog) optional.get();
    }

    public String delete(long id) {
        repository.deleteById(id);
        return "Success";
    }
}