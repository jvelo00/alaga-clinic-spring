package com.jvelo00.alagaclinicspring.services;

import com.jvelo00.alagaclinicspring.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
