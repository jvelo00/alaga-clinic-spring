package com.jvelo00.alagaclinicspring.services;

import com.jvelo00.alagaclinicspring.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
