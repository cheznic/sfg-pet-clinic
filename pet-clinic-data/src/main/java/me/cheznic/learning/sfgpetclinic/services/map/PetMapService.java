package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Pet;
import me.cheznic.learning.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public class PetMapService extends AbstractMapService<Pet> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }
}
