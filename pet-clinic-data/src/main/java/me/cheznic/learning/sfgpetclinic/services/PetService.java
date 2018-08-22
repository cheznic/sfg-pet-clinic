package me.cheznic.learning.sfgpetclinic.services;

import me.cheznic.learning.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
