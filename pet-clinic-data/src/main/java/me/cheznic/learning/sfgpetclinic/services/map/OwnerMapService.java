package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import me.cheznic.learning.sfgpetclinic.services.OwnerService;
import me.cheznic.learning.sfgpetclinic.services.PetService;
import me.cheznic.learning.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerMapService(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return super.findAll().stream().filter(x -> x.getLastName().equals(lastName)).findAny().orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {

        if (owner == null)
            return null;

        owner.getPets().forEach(pet -> {

            if (pet.getPetType() != null) {

                if (pet.getPetType().getId() == null) {
                    pet.setPetType(petTypeService.save(pet.getPetType()));
                }

            } else {
                throw new RuntimeException("Object of type Pet must have value for PetType");
            }

            if (pet.getId() == null)
                pet.setId(petService.save(pet).getId());
        });


        return super.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
