package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;

import java.util.List;

@RequestMaping
@RestController("api/pets")
public class PetController {

    private final PetRepository repository;
    public PetController(PetRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public List<Pet> mostrar(){
        return repository.findById();
    }
    @GetMapping
    public void criar(@RequestBody Pet p){
        repository.save(p);
    }

    //CRIE O DELETE
}
