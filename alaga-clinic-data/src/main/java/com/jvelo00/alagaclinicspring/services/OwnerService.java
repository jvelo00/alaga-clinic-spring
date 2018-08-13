package com.jvelo00.alagaclinicspring.services;

import com.jvelo00.alagaclinicspring.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
